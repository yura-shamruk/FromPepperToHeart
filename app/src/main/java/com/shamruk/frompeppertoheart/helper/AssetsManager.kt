package com.shamruk.frompeppertoheart.helper

import android.content.Context


class AssetsManager {

    class Constants{
        companion object {
            val DATA_ROOT_PATH = "dataRoot.json"
        }
    }

    companion object {
        fun loadDataRoot(context: Context): String? {
            return loadStringFromAsset(context, Constants.DATA_ROOT_PATH)
        }

        private fun loadStringFromAsset(context: Context, fileName: String): String? {

            return context.assets.open(fileName).use {
                it.bufferedReader().use {
                    it.readText()
                }
            }
        }
    }
}