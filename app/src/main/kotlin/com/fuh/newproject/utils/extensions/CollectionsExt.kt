package com.fuh.newproject.utils.extensions

fun <K, V> Map<K, V>.toMutableCopy(): MutableMap<K, V> = HashMap(this)

fun <E> List<E>.toMutableCopy(): MutableList<E> = ArrayList(this)