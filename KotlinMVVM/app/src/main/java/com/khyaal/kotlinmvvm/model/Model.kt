package com.khyaal.kotlinmvvm.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 
 * @since : 11/17/18
 * https://developer.android.com/kotlin/parcelize
 */
@Parcelize
data class Museum(val id: Int, val name: String, val photo: String) : Parcelable