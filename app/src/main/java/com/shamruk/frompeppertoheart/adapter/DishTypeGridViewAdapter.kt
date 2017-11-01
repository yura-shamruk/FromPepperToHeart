package com.shamruk.frompeppertoheart.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.shamruk.frompeppertoheart.R
import com.shamruk.frompeppertoheart.model.DishType
import java.text.FieldPosition

class DishTypeGridViewAdapter(context: Context,
                              private var dishesTypes: ArrayList<DishType>,
                              private var onClickListener: DishTypeGridViewAdapter.OnClickListener) : BaseAdapter() {

    private var layoutInflater: LayoutInflater


    init {
        val systemService = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
        layoutInflater = systemService as LayoutInflater
    }

    override fun getCount(): Int {
        return dishesTypes.size
    }

    override fun getItem(i: Int): Any? {
        return null
    }

    override fun getItemId(i: Int): Long {
        return 0
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        val view: View = layoutInflater.inflate(R.layout.dish_type_cell, null)
        val dishTypeName = view.findViewById<TextView>(R.id.dishTypeName)
        val dishType = dishesTypes[position]
        dishTypeName.text = dishType.name
        view.setOnClickListener { onClickListener.onClick(dishType) }
        return view
    }

    interface OnClickListener{
        fun onClick(dishType:DishType)
    }

}