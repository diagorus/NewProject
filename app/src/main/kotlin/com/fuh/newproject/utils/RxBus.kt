package com.fuh.newproject.utils

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

object RxBus {
    private val bus = PublishSubject.create<Any>()

    fun send(event: Any) {
        bus.onNext(event)
    }

    fun toObservable(): Observable<Any> {
        return bus.hide()
    }

    fun <T> observeEvent(events: Class<T>): Observable<T> {
        return bus.ofType(events)
    }

    object SingleEvent
}