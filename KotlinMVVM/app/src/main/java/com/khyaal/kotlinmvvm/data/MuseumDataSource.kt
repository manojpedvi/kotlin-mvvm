package com.khyaal.kotlinmvvm.data

import com.khyaal.kotlinmvvm.model.Museum

/**
 
 */

interface MuseumDataSource {
    suspend fun retrieveMuseums() : OperationResult<Museum>
}