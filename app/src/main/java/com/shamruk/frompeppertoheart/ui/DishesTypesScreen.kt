package com.shamruk.frompeppertoheart.ui

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import com.shamruk.frompeppertoheart.MainActivity
import com.shamruk.frompeppertoheart.R
import com.shamruk.frompeppertoheart.adapter.DishTypeGridViewAdapter
import com.shamruk.frompeppertoheart.model.DishType
import kotlinx.android.synthetic.main.fragment_dishes_types.*


class DishesTypesScreen : MainActivityFragment() {

    private var dishTypeGridViewAdapter:DishTypeGridViewAdapter? = null

    class Constants {
        companion object {
            // won't compile
            const val TAG = "DishesTypesScreen"
        }
    }


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater!!.inflate(R.layout.fragment_dishes_types, container, false)

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dataRootManager = (activity as MainActivity).dataRootManager

        val dishesTypes = dataRootManager.getDishesTypes()
        if(dishesTypes != null) {

            dishTypeGridViewAdapter = DishTypeGridViewAdapter(context, dishesTypes, object : DishTypeGridViewAdapter.OnClickListener{
                override fun onClick(dishType: DishType) {
                    getMainActivity().showDishesListScreen()
                }
            })
            dishesTypesGridView.adapter = dishTypeGridViewAdapter
        }

    }


}