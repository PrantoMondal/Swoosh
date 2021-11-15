package com.prantokm.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class BaseActivity : AppCompatActivity() {

    val TAG = "LifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"${javaClass.simpleName}OnCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"${javaClass.simpleName}onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"${javaClass.simpleName}OnResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(TAG,"${javaClass.simpleName}OnRestart")
        super.onRestart()
    }

    override fun onPause() {
        Log.d(TAG,"${javaClass.simpleName}OnPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"${javaClass.simpleName}OnStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"${javaClass.simpleName}OnDestroy")
        super.onDestroy()
    }
}