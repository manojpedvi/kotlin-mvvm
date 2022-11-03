package com.khyaal.kotlinmvvm

import com.khyaal.kotlinmvvm.data.OperationResult
import com.khyaal.kotlinmvvm.model.Museum
import com.khyaal.kotlinmvvm.data.MuseumDataSource

/**
 
 */
class FakeErrorMuseumDataSource : MuseumDataSource {

    private val mockException = Exception("Ocurrió un error")

    override suspend fun retrieveMuseums(): OperationResult<Museum> {
        return OperationResult.Error(mockException)
    }
}