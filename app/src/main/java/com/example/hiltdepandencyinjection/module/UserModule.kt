package com.example.hiltdepandencyinjection.module


import com.example.hiltdepandencyinjection.FirebaseRepository
import com.example.hiltdepandencyinjection.SQLRepository
import com.example.hiltdepandencyinjection.UserRepository
import com.example.hiltdepandencyinjection.annotation.Firebase
import com.example.hiltdepandencyinjection.annotation.SQL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)
@Module
class UserModule {

    @Provides
    @Firebase
    fun  providesFirebaseRepository() : UserRepository{
        return FirebaseRepository()
    }
    @Provides
    @SQL
    fun providesSQLRepository(): UserRepository{
        return SQLRepository()
    }

}