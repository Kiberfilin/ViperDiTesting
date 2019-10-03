package ru.cyber_eagle_owl.viperditesting.utils

import android.content.res.Resources

class ResourcesHelper(val resources: Resources){

    fun getStringArray(arrayId: Int): Array<String> {
        return resources.getStringArray(arrayId)
    }
}