package com.example.hw_5_5.di

import android.app.Application
import androidx.room.Room
import com.example.hw_5_5.data.room.AppDataBase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        appDatabase = Room.databaseBuilder(applicationContext, AppDataBase::class.java, "love-file")
            .allowMainThreadQueries().build()
    }

    companion object {
        lateinit var appDatabase: AppDataBase
    }
}