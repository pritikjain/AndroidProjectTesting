package com.pritikjain.androidprojecttestingbasics.remote.responses

import com.pritikjain.androidprojecttestingbasics.BuildConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayAPI {

    @GET("/api")
    suspend fun searchForImage(
        @Query("q") searchQuery: String,
        @Query("key") apiKey: String = BuildConfig.API_KEY
    ) : Response<ImageResponse>
    
}