package com.emedinaa.kotlinmvvm.di

import androidx.lifecycle.ViewModelProvider
import com.emedinaa.kotlinmvvm.data.ApiClient
import com.emedinaa.kotlinmvvm.data.MuseumDataSource
import com.emedinaa.kotlinmvvm.data.MuseumRemoteDataSource
import com.emedinaa.kotlinmvvm.model.MuseumRepository
import com.emedinaa.kotlinmvvm.viewmodel.ViewModelFactory

/**
 * @author Eduardo Medina
 */
object Injection {
    private var museumDataSource: MuseumDataSource? = null
    private var museumRepository: MuseumRepository? = null

    private fun createMuseumDataSource(): MuseumDataSource {
        val dataSource = MuseumRemoteDataSource(ApiClient)
        museumDataSource = dataSource
        return dataSource
    }

    private fun createMuseumRepository(): MuseumRepository {
        val repository = MuseumRepository(provideDataSource())
        museumRepository = repository
        return repository
    }

    private fun provideDataSource() = museumDataSource ?: createMuseumDataSource()

    private fun providerRepository() = museumRepository ?: createMuseumRepository()

    private val museumViewModelFactory = ViewModelFactory(providerRepository())
    fun provideViewModelFactory(): ViewModelProvider.Factory{
        return museumViewModelFactory
    }

    fun destroy() {
        museumDataSource = null
        museumRepository = null
    }
}