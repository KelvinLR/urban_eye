package com.example.urbaneye.core.common.di
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

// criando as annotations para cada dispatcher
@Qualifier
// esse tipo da annotation vai definir por qnt tempo ela
// vai sobreviver no codigo, tipo aq ela vai ser compilada
// mas vai evitar q ela gaste memoria em Runtime
// isso eh massa pq evita crashes por falta de memoria no celular
@Retention(AnnotationRetention.BINARY)
annotation class MainDispatcher

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class IODispatcher

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DefaultDispatcher

// fazendo com object e obedecendo o padrão Singleton p evitar multiplas instâncias
@Module
@InstallIn(SingletonComponent::class)
object DispatcherModule {
    @Provides
    @MainDispatcher
    fun providesMainDispatcher() : CoroutineDispatcher = Dispatchers.Main

    @Provides
    @IODispatcher
    fun providesIODispatcher() : CoroutineDispatcher = Dispatchers.IO

    @Provides
    @DefaultDispatcher
    fun providesDefaultDispatcher() : CoroutineDispatcher = Dispatchers.Default
}
