package com.example.urbaneye.feature.places.data.di

import com.example.urbaneye.feature.places.data.remote.api.PlacesApiService
import com.example.urbaneye.feature.places.data.repository.PlacesRepositoryImpl
import com.example.urbaneye.feature.places.domain.repository.PlacesRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class PlacesDataModule {

    @Binds
    @Singleton
    abstract fun bindPlacesRepository(
        placesRepositoryImpl: PlacesRepositoryImpl
    ): PlacesRepository

    companion object {
        @Provides
        @Singleton
        fun providePlacesApiService(retrofit: Retrofit): PlacesApiService {
            return retrofit.create(PlacesApiService::class.java)
        }
    }
}
