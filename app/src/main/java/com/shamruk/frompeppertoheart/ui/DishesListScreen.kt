package com.shamruk.frompeppertoheart.ui

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shamruk.frompeppertoheart.R
import com.shamruk.frompeppertoheart.adapter.DishListRecyclerViewAdapter
import kotlinx.android.synthetic.main.fragment_dishes_list.*

class DishesListScreen : MainActivityFragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater!!.inflate(R.layout.fragment_dishes_list, container, false)


    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dishType = getMainActivity().dataRootManager.getDishesTypes()?.get(0)

        val recipes = dishType?.recipes
        if(recipes != null) {
            val adapter = DishListRecyclerViewAdapter(context, recipes)
            dishesListRecyclerView.adapter = adapter;

            val orientation: Int = resources.configuration.orientation
            dishesListRecyclerView.layoutManager = GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
            if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
                dishesListRecyclerView.layoutManager = GridLayoutManager(context, 3, GridLayoutManager.VERTICAL, false)
            }
            if (orientation == Configuration.ORIENTATION_PORTRAIT) {
                dishesListRecyclerView.layoutManager = GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
            }
        }
    }

    class Constants {
        companion object {
            val TAG = "DishesListScreen"
        }

    }
}