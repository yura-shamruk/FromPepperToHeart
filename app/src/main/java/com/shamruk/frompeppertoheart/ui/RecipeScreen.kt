package com.shamruk.frompeppertoheart.ui

import android.os.Bundle
import android.util.Log
import android.view.View

class RecipeScreen : MainActivityFragment() {

    class Constanst{
        companion object {
            const val TAG = "RecipeScreen"
        }
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(Constanst.TAG, "2")
    }
}