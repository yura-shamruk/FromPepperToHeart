package com.shamruk.frompeppertoheart.manager

import com.shamruk.frompeppertoheart.model.DataRoot
import com.shamruk.frompeppertoheart.model.DishType

class DataRootManager(private var dataRoot: DataRoot) {


    fun getDishesTypes(): ArrayList<DishType>? {
        return dataRoot.dishesTypes
    }
}