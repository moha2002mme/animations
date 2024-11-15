package com.example.myappanimations

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.myappanimations.R

class MainActivity : AppCompatActivity() {
    lateinit var card:CardView
    lateinit var rotateBTN:Button
    lateinit var scaleBTN:Button
    lateinit var translateBTN:Button
    lateinit var slideUpBTN:Button
    lateinit var slideDownBTN:Button
    lateinit var slideLeftBTN:Button
    lateinit var slideRightBTN:Button
    lateinit var fadeInBTN:Button
    lateinit var fadeOutBTN:Button
    lateinit var zommInBTN:Button
    lateinit var zommOutBTN:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        card=findViewById(R.id.imgvw)
        rotateBTN=findViewById(R.id.Rotate)
        scaleBTN=findViewById(R.id.scale)
        translateBTN=findViewById(R.id.translate)
        slideUpBTN=findViewById(R.id.slideUp)
        slideDownBTN=findViewById(R.id.slideDown)
        slideLeftBTN=findViewById(R.id.slideLeft)
        slideRightBTN=findViewById(R.id.slideRight)
        fadeInBTN=findViewById(R.id.btnFadeIn)
        fadeOutBTN=findViewById(R.id.btnFadeOut)
        zommInBTN=findViewById(R.id.zoomIn)
        zommOutBTN=findViewById(R.id.zoomOut)


        zommOutBTN.setOnClickListener{
            val animZoomOut=AnimationUtils.loadAnimation(this,R.anim.zoom_out)
            card.startAnimation(animZoomOut)
        }

        zommInBTN.setOnClickListener{
            val animZoomIn=AnimationUtils.loadAnimation(this,R.anim.zoom_in)
            card.startAnimation(animZoomIn)
        }

        fadeInBTN.setOnClickListener{
            val animFadeIn=AnimationUtils.loadAnimation(this,R.anim.fade_in)
            card.startAnimation(animFadeIn)
        }

        fadeOutBTN.setOnClickListener{
            val animFadeOut=AnimationUtils.loadAnimation(this,R.anim.fade_out)
            card.startAnimation(animFadeOut)
        }

        slideUpBTN.setOnClickListener{
            val animSlideUp=AnimationUtils.loadAnimation(this,R.anim.slide_up)
            card.startAnimation(animSlideUp)
        }

        slideDownBTN.setOnClickListener{
            val animSlideDown=AnimationUtils.loadAnimation(this,R.anim.slide_down)
            card.startAnimation(animSlideDown)
        }

        slideLeftBTN.setOnClickListener{
            val animSlideLeft=AnimationUtils.loadAnimation(this,R.anim.slide_left)
            card.startAnimation(animSlideLeft)
        }

        slideRightBTN.setOnClickListener{
            val animSlideRight=AnimationUtils.loadAnimation(this,R.anim.slide_right)
            card.startAnimation(animSlideRight)
        }

        translateBTN.setOnClickListener{
            translater()
        }

        scaleBTN.setOnClickListener{
            scaler()
        }

        rotateBTN.setOnClickListener{
            rotater()
        }
    }

    private fun rotater() {
        val animator=ObjectAnimator.ofFloat(card,View.ROTATION,-360f,0f)
        animator.duration=1000
        animator.start()
    }

    private fun translater(){
        val animator=ObjectAnimator.ofFloat(card,View.TRANSLATION_X,200f)
        animator.repeatCount=1
        animator.duration=1500
        animator.repeatMode=ObjectAnimator.REVERSE
        animator.start()
    }

    private fun scaler(){
        val scaleX=PropertyValuesHolder.ofFloat(View.SCALE_X,4f)
        val scaleY=PropertyValuesHolder.ofFloat(View.SCALE_Y,4f)
        val animator=ObjectAnimator.ofPropertyValuesHolder(card,scaleX,scaleY)
        animator.repeatCount=1
        animator.repeatMode=ObjectAnimator.REVERSE
        animator.start()
    }
}