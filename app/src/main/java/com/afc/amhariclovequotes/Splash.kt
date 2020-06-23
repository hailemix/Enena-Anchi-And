package com.afc.amhariclovequotes

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


/**
 * Created by HaileApp on 06/9/2020.
 */
class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        val iv = findViewById<ImageView>(R.id.splash)
        Glide.with(this).load(R.drawable.splash).into(iv)
        val an = AnimationUtils.loadAnimation(baseContext, R.anim.splashanimation)

        iv.startAnimation(an)
        an.duration = 2400
        an.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) = Unit

            override fun onAnimationEnd(animation: Animation) {

                finish()
                val i = Intent(baseContext, MainActivity::class.java)
                startActivity(i)
            }
            override fun onAnimationRepeat(animation: Animation) = Unit
        })
    }
}


