package com.fatihcetiner.retrofitcompose.service

import com.fatihcetiner.retrofitcompose.model.CryptoModel
import com.fatihcetiner.retrofitcompose.util.Constants.END_POINT
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    @GET(END_POINT)
    fun getData() : Call<List<CryptoModel>>
}