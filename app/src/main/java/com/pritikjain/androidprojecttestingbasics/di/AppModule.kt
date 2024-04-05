package com.pritikjain.androidprojecttestingbasics.di

import android.content.Context
import androidx.room.Room
import com.pritikjain.androidprojecttestingbasics.data.local.ShoppingItemDataBase
import com.pritikjain.androidprojecttestingbasics.other.Constants.BASE_URL
import com.pritikjain.androidprojecttestingbasics.other.Constants.DATABASE_NAME
import com.pritikjain.androidprojecttestingbasics.remote.responses.PixabayAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideShoppingItemDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context,ShoppingItemDataBase::class.java,DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideShoppingDao(
        dataBase: ShoppingItemDataBase
    ) = dataBase.shoppingDao()

    @Singleton
    @Provides
    fun providePixabayApi(): PixabayAPI {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PixabayAPI::class.java)
    }
}