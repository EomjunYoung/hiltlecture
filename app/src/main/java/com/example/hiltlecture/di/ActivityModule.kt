package com.example.hiltlecture.di

import com.example.hiltlecture.di.qualifier.ActivityHash
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)//이 모듈은 전체앱에서 사용되는(applicationcomponent) scope란 의미
object ActivityModule {

    @ActivityHash
    @Provides
    fun provideHash() = hashCode().toString()
}