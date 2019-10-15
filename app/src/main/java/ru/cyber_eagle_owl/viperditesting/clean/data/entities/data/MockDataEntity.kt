package ru.cyber_eagle_owl.viperditesting.clean.data.entities.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MockDataEntity(val param1: String, val param2: String) : Parcelable