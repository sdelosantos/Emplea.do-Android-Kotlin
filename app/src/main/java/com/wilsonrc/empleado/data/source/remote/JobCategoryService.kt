package com.wilsonrc.empleado.data.source.remote

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.wilsonrc.empleado.data.models.JobCategory
import com.wilsonrc.empleado.utils.LoggingInterceptor
import io.reactivex.Single
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface JobCategoryService {

    @GET("t5y4j")
    fun getJobCategories() : Single<ArrayList<JobCategory>>

}