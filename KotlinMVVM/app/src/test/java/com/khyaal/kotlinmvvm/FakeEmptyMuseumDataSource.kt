package com.khyaal.kotlinmvvm

import com.khyaal.kotlinmvvm.data.OperationResult
import com.khyaal.kotlinmvvm.model.Museum
import com.khyaal.kotlinmvvm.data.MuseumDataSource

/**
 
 */
class FakeEmptyMuseumDataSource : MuseumDataSource {

    override suspend fun retrieveMuseums(): OperationResult<Museum> {
        return OperationResult.Success(emptyList())
    }
}