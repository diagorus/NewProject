package com.fuh.newproject.utils

sealed class Optional<out T> {
    class Some<out T>(val element: T) : Optional<T>()
    object None : Optional<Nothing>()

    val value: T?
        get() = when (this) {
            is None -> null
            is Some -> element
        }

    companion object {
        fun <T> create(value: T?): Optional<T> {
            return if (value != null) {
                Some(value)
            } else {
                None
            }
        }
    }
}