package com.shamruk.frompeppertoheart.ui

import android.app.Fragment
import android.os.Bundle
import android.view.View
import com.shamruk.frompeppertoheart.BackButtonListener
import com.shamruk.frompeppertoheart.MainActivity





/**
 * Created by yura on 10/12/17.
 */
open class MainActivityFragment : Fragment(), BackButtonListener {


    override fun onStart() {
        super.onStart()
        getMainActivity().setBackButtonListener(this)
    }

    protected fun goHome() {
        getMainActivity().supportFragmentManager.popBackStack(DishesTypesScreen.Constants.TAG, 0)
    }

    override fun onBackPressed() {
        goBack()
    }

    private fun goBack() {
        activity.fragmentManager.popBackStack()
    }

    protected fun getMainActivity(): MainActivity = activity as MainActivity

}