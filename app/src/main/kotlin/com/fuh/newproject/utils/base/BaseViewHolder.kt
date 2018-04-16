package com.fuh.newproject.utils.base

import android.support.v7.widget.RecyclerView
import android.view.View

abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var onClick: (T) -> Unit = { }
    var onLongClick: (T) -> Boolean = { false }

    abstract fun View.onBind(data: T)

    fun bind(data: T) {
        with(itemView) {
            onBind(data)

            setOnClickListener { onClick(data) }
            setOnLongClickListener { onLongClick(data) }
        }
    }
}