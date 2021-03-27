package com.example.itunes
import retrofit2.Call
import retrofit2.http.*
interface ApiInterface {
    @GET("posts")
    fun fetchAllPosts(): Call<List<PostModel>>
}