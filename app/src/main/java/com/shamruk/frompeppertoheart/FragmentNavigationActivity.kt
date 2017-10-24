package com.shamruk.frompeppertoheart

import android.app.Fragment
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.shamruk.frompeppertoheart.ui.DishesTypesScreen


abstract class FragmentNavigationActivity : AppCompatActivity() {

    private var backButtonListener: BackButtonListener? = null

    fun setBackButtonListener(backButtonListener: BackButtonListener) {
        this.backButtonListener = backButtonListener
    }


    override fun onBackPressed() {
        if (backButtonListener == null) {
            moveTaskToBack(true)
        } else {
            backButtonListener!!.onBackPressed()
        }
    }


    private fun showScreen(fragment: Fragment) {
        showScreen(fragment, null, null)
    }

    private fun showScreen(fragment: Fragment, screenName: String) {
        showScreen(fragment, screenName, null)
    }

    private fun showScreen(fragment: Fragment?, screenName: String?, bundle: Bundle?) {
        if (fragment == null) {
            return
        }
        val fragmentManager = fragmentManager
        if (bundle != null) {
            fragment.arguments = bundle
        }
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment, screenName)
        if (screenName != null) {
            fragmentTransaction.addToBackStack(screenName)
        }
        fragmentTransaction.commit()
    }

    fun showDishTypesScreen(){
        showScreen(DishesTypesScreen(), DishesTypesScreen.Constants.TAG)
    }

    fun showGroceriesScreen(){

    }


}

interface BackButtonListener {
    fun onBackPressed()
}
