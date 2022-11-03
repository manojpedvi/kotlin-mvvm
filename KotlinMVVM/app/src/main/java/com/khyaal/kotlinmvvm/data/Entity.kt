package com.khyaal.kotlinmvvm.data

import com.khyaal.kotlinmvvm.model.Museum

data class MuseumResponse(val status: Int?, val msg: String?, val data: List<Museum>?) {
    fun isSuccess(): Boolean = (status == 200)
}