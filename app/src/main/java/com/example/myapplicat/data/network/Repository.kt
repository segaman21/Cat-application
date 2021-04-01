package com.example.myapplicat.data.network

import android.content.Context
import com.example.myapplicat.data.model.Model
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository {
    private val api = NetworkModule().provideApi()
    private val key = "533ac9a5-6204-4c64-8faa-3e6494c6a961"

    suspend fun loadCats(context: Context): List<Model>? {
        var cat: List<Model>? = null
        cat = withContext(Dispatchers.IO){
            api.loadCats()}
        return cat
    }
}