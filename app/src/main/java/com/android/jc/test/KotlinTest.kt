package com.android.jc.test

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.android.jc.R

/**
 *@author   Mr.Hu(Jc)
 *@create   2018/3/6 17:27
 *@describe
 *@update
 */
class KotlinTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_touch)

    }
}