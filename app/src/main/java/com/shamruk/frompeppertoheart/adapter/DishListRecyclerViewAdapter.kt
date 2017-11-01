package com.shamruk.frompeppertoheart.adapter

import android.content.Context
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import com.shamruk.frompeppertoheart.R
import com.shamruk.frompeppertoheart.model.Recipe


class DishListRecyclerViewAdapter (private val context : Context, private val list : List<Recipe>) : RecyclerView.Adapter<DishListRecyclerViewAdapter.ViewHolder>(){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titleTextView: TextView = itemView.findViewById(R.id.title)

    }

    override fun onCreateViewHolder(parent : ViewGroup, type : Int) : DishListRecyclerViewAdapter.ViewHolder{
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.dish_card_view, parent, false);
        val card = view.findViewById<CardView>(R.id.cardView)
        card.maxCardElevation = 2.0F
        card.radius = 5.0F
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder : DishListRecyclerViewAdapter.ViewHolder, position : Int){
        var recipe : Recipe = list.get(position)
        holder.titleTextView.text = recipe.name
    }

    override fun getItemCount() : Int{
        return list.size;
    }

}