package com.dagger.hilt

import javax.inject.Inject

class TestClass @Inject constructor(private val value: String) {
    fun method(): String {
        return "method$value"
    }
}
