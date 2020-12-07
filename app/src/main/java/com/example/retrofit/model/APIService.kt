package com.example.retrofit.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {
    @GET("/books/v1//volumes?")
    fun fetchQuestions(@Query("ru") tags: String): Call<QuestionList>
}