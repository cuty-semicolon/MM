package com.example.loginandlegister.services

import com.example.loginandlegister.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=<<api_key>>&language=ko-KR&page=10")
    fun getMovieListList(): Call<MovieResponse>
}