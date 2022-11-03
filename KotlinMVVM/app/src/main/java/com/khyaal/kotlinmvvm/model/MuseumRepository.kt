package com.khyaal.kotlinmvvm.model

import com.khyaal.kotlinmvvm.data.MuseumDataSource
import com.khyaal.kotlinmvvm.data.OperationResult

/**
 
 */
class MuseumRepository(private val dataSource: MuseumDataSource) {

    suspend fun fetchMuseums(): OperationResult<Museum> = dataSource.retrieveMuseums()
}