package com.shamruk.frompeppertoheart.repository

import android.content.Context
import android.content.res.AssetManager
import com.github.salomonbrys.kotson.*
import com.google.gson.Gson
import com.shamruk.frompeppertoheart.helper.AssetsManager
import com.shamruk.frompeppertoheart.model.DataRoot
import com.shamruk.frompeppertoheart.model.DishType

class RecipesRepository {

    var dataRoot:DataRoot? = null

    fun loadDataRoot(context: Context){
        var dataRootString = AssetsManager.loadDataRoot(context)
        val gson = Gson()
        dataRoot = dataRootString?.let { gson.fromJson(it) }
    }

}