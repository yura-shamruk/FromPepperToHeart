package com.shamruk.frompeppertoheart.ui

import android.app.Fragment
import com.shamruk.frompeppertoheart.MainActivity





/**
 * Created by yura on 10/12/17.
 */
open class MainActivityFragment : Fragment() {


    protected fun goHome() {
        getMainActivity().supportFragmentManager.popBackStack(DishesTypesScreen.Constants.TAG, 0)
    }

    protected fun onBackPressed() {
        goBack()
    }

    protected fun goBack() {
        activity.fragmentManager.popBackStack()
    }

    protected fun getMainActivity(): MainActivity {
        return activity as MainActivity
    }

}