package com.example.urbaneye.core.common.result

// Result.kt
// A classe criada é responsável por representar os resultados
// das operações e facilitar a sua gestão, evitando q eu dê throw em excecoes

sealed class Result<out T> {
    data class Success<T>(val data: T) : Result<T>()
    data class Error(val exception: Throwable) : Result<Nothing>()
    data object Loading : Result<Nothing>()
}
