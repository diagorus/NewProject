package com.fuh.newproject.utils.extensions

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

fun <T> T.toJson(): String? = Gson().toJson(this)

inline fun <reified T> String?.fromJsonToObject(): T? {
    return try {
        Gson().fromJson(this, genericType<T>())
    } catch (e: Exception) {
        null
    }
}

inline fun <reified T> genericType() = object : TypeToken<T>() {}.type