package com.fuh.newproject.screens.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.fuh.newproject.R
import com.fuh.newproject.utils.base.BaseActivity

/**
 * Created by Nikita on 16.04.18.
 */
class MainActivity : BaseActivity() {

    companion object {

        fun start(from: Context) {
            val intent = Intent(from, MainActivity::class.java)

            from.startActivity(intent)
        }
    }

    override val layoutRes: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
}