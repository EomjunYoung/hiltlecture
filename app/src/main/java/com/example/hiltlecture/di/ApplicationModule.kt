package com.example.hiltlecture.di

import com.example.hiltlecture.di.qualifier.AppHash
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)//이 모듈은 전체앱에서 사용되는(applicationcomponent) scope란 의미
object ApplicationModule {

    @AppHash//이런식으로 inject시 주입할 메소드를 구분할 수 있음
    @Provides
    fun provideHash() = hashCode().toString()
}