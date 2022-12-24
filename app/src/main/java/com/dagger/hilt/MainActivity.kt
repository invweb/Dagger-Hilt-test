package com.dagger.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var testClass: TestClass

    @Inject
    @Named("qwe")
    lateinit var testStringQwe : String

    @Inject
    @Named("asd")
    lateinit var testStringAsd : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testClass.method()
    }
}