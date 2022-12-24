package com.dagger.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object TestClassModule {

    @Provides
    @Named("qwe")
    fun provideString1(): String = "String qwe"

    @Provides
    @Named("asd")
    fun provideString2(): String = "String asd"

    @Provides
    fun provideTestClass(@Named("asd") asd: String): TestClass = TestClass(asd)
}