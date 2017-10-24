package com.shamruk.frompeppertoheart.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shamruk.frompeppertoheart.R
import com.shamruk.frompeppertoheart.adapter.DishTypeGridViewAdapter
import com.shamruk.frompeppertoheart.model.DishType
import kotlinx.android.synthetic.main.fragment_dishes_types.*


/**
 * Created by yura on 10/13/17.
 */
class DishesTypesScreen : MainActivityFragment() {

    private var dishTypeGridViewAdapter:DishTypeGridViewAdapter? = null

    class Constants {
        companion object {
            // won't compile
            const val TAG = "DishesTypesScreen"
        }
    }

    private val dishesTypes = listOf(DishType("dish1"),
            DishType("dish1"), DishType("dish1"),
            DishType("dish1"), DishType("dish1"),
            DishType("dish1"), DishType("dish1"))

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_dishes_types, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dishTypeGridViewAdapter = DishTypeGridViewAdapter(context, dishesTypes)
        dishesTypesGridView.adapter = dishTypeGridViewAdapter
    }
}