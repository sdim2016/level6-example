package com.slepnev.numberskotlin.api

import com.slepnev.numberskotlin.model.Trivia
import retrofit2.Call
import retrofit2.http.GET

public interface NumbersApiService {

    @GET("/random/trivia?json")
    fun getRandomNumberTrivia(): Call<Trivia>
}