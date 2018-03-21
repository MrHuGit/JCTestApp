package com.android.jc;

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.Log
import android.view.SurfaceHolder
import android.view.SurfaceView

/**
 * Created by xiangfan on 2018/3/6.
 */

class WaveViewBySinCos(context: Context, attributeSet: AttributeSet?, defaultStyle: Int) :
        SurfaceView(context, attributeSet, defaultStyle),SurfaceHolder.Callback {
    constructor(context: Context, attributeSet: AttributeSet?) : this(context, attributeSet, 0)

    constructor(context: Context) : this(context, null, 0)

    private val lock = Object()
    @Volatile var canRun = false
    @Volatile var threadQuit = false
    var thread = Thread{
        while (!threadQuit){
            if(!canRun){
                synchronized(lock){
                    try {
                        Log.d("xiangfan","阻塞中。。")
                        lock.wait()
                    }catch (e : Exception){
                    }
                }
            }
            var startTime = System.currentTimeMillis()
            try {
                val canvas = holder.lockCanvas()
                if (canvas != null){
                    canvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR)
                    draw(canvas,startTime)
                }
                holder.unlockCanvasAndPost(canvas)
                val drawTime = System.currentTimeMillis() - startTime
                // 平均16ms一帧才能有顺畅的感觉
                if (drawTime < 16) {
                    Thread.sleep(16 - drawTime)
                }
            }catch (e : Exception){
            }
        }
    }.apply { name = "WaveViewBySinCosThread" }
    val arrl = arrayOf(3f,6f,23f,45f,2f)
    var index = 0
    var paint = Paint().apply {
        strokeWidth = 3f
        isAntiAlias = true
    }
    private  fun draw(canvas: Canvas,startTime: Long) {
        canvas.drawCircle(50f,50f, arrl[index], paint)
        index++
        if(index>=arrl.size){
            index=0;
        }
    }

    override fun surfaceChanged(p0: SurfaceHolder?, p1: Int, p2: Int, p3: Int) {
        Log.d("xiangfan","执行surfaceChanged")
    }

    override fun surfaceDestroyed(p0: SurfaceHolder?) {
        Log.d("xiangfan","执行surfaceDestroyed")
        canRun = false
    }

    override fun surfaceCreated(p0: SurfaceHolder?) {
        Log.d("xiangfan","执行surfaceCreated")
        threadQuit = false
        canRun = true
        try {
            synchronized(lock){
                lock.notify()
            }
        }catch (e: Exception){

        }
    }

    init {
        Log.d("xiangfan","开始init")
        holder.addCallback(this)
        holder.setFormat(PixelFormat.RGBA_8888)
        setZOrderOnTop(true)
        thread.start()
    }

    fun onDestroy() {
        threadQuit = true
        canRun = true
        try {
            synchronized(lock) {
                lock.notify()
            }
        } catch (e: Exception) {
        }
    }
}