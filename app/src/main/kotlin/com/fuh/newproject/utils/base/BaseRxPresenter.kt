package com.fuh.newproject.utils.base

import com.fuh.newproject.utils.mvp.BasePresenter
import io.reactivex.disposables.CompositeDisposable

abstract class BaseRxPresenter : BasePresenter {

    val disposables: CompositeDisposable = CompositeDisposable()

    override fun stop() {
        disposables.clear()
    }
}