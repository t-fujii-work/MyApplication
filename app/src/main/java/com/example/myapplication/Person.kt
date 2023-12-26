package com.example.myapplication

data class Person(var name: String = "名無し", var age: Int? = null) {
    companion object {
        private var _id = 0
    }

    val id: Int = ++_id
}
