package com.mgx.customviewapp.slidingtopview

import android.animation.Animator
import android.content.Context
import android.os.Handler
import android.os.Parcel
import android.os.Parcelable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.animation.AccelerateInterpolator
import android.view.animation.DecelerateInterpolator
import android.widget.FrameLayout
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.doOnPreDraw
import androidx.core.view.marginBottom
import androidx.core.view.marginTop
import com.mgx.customviewapp.R
import java.util.ArrayDeque

class SlidingTopView : FrameLayout {

    private var isShow = false

    private var slidingTopLayout: ConstraintLayout? = null
    private var slidingTopIv: AppCompatImageView? = null
    private var slidingTopTitleTv: AppCompatTextView? = null
    private var slidingTopDescriptionTv: AppCompatTextView? = null

    private val LayoutAboveScreenStartPosition: Float get() = -height.toFloat() + -marginBottom.toFloat()

    private val maxDurationShownHandler: Handler by lazy {
        Handler()
    }

    private val titleDescriptionPairQueue = ArrayDeque<Pair<String, CharSequence>>()

    private val privateMaxDurationRunnable = Runnable {
        dismissCurrent()
    }

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet? = null) : super(context, attrs) {
        val inflate =
            LayoutInflater.from(context).inflate(R.layout.custom_sliding_top_view, this, false)
        slidingTopLayout = inflate.findViewById<ConstraintLayout>(R.id.slidingTopLayout)
        slidingTopIv = inflate.findViewById<AppCompatImageView>(R.id.slidingTopIv)
        slidingTopTitleTv = inflate.findViewById<AppCompatTextView>(R.id.slidingTopTitleTv)
        slidingTopDescriptionTv =
            inflate.findViewById<AppCompatTextView>(R.id.slidingTopDescriptionTv)
        addView(inflate)
    }

    private fun dismissCurrent() {
        if (titleDescriptionPairQueue.size > 0) {
            maxDurationShownHandler.removeCallbacksAndMessages(null)

            titleDescriptionPairQueue.removeFirst()

            moveViewToAboveOfScreen()
        }
    }

    fun addMessage(title: String, description: CharSequence) {
        titleDescriptionPairQueue.add(Pair(title, description))

        if (!isShow) {
            showNext()
        }
    }

    private fun showNext() {
        if (titleDescriptionPairQueue.size > 0) {
            isShow = true

            val (title, description) = titleDescriptionPairQueue.first
            slidingTopTitleTv?.text = title
            slidingTopDescriptionTv?.text = description

            slidingTopLayout?.doOnPreDraw {
                it.translationY = LayoutAboveScreenStartPosition
                moveViewToOriginalPosition()
                maxDurationShownHandler.postDelayed(privateMaxDurationRunnable, MAX_SHOWN_DURATION)
            }
        } else {
            isShow = false
        }
    }

    private fun moveViewToOriginalPosition() {
        slidingTopLayout?.run {
            with(this) {
                animate()
                    .y(marginTop.toFloat())
                    .setInterpolator(DecelerateInterpolator())
                    .setListener(object : Animator.AnimatorListener {
                        override fun onAnimationRepeat(animation: Animator?) {
                            // nothing to do
                        }

                        override fun onAnimationEnd(animation: Animator?) {
                            // nothing to do
                        }

                        override fun onAnimationCancel(animation: Animator?) {
                            y = LayoutAboveScreenStartPosition
                        }

                        override fun onAnimationStart(animation: Animator?) {
                            // nothing to do
                        }
                    })
                    .setDuration(IN_ANIMATION_DURATION)
                    .withLayer()
                    .start()
            }
        }
    }

    private fun moveViewToAboveOfScreen() {
        slidingTopLayout?.run {
            with(this) {
                animate()
                    .y(LayoutAboveScreenStartPosition)
                    .setInterpolator(AccelerateInterpolator())
                    .setDuration(OUT_ANIMATION_DURATION)
                    .withLayer()
                    .setListener(object : Animator.AnimatorListener {
                        override fun onAnimationRepeat(animation: Animator?) {
                            // nothing to do
                        }

                        override fun onAnimationEnd(animation: Animator?) {
                            Handler().postDelayed({ showNext() }, NEXT_DELAY)
                        }

                        override fun onAnimationCancel(animation: Animator?) {
                            y = LayoutAboveScreenStartPosition
                        }

                        override fun onAnimationStart(animation: Animator?) {
                            // nothing to do
                        }
                    })
                    .start()
            }
        }
    }

    companion object {
        private const val MAX_SHOWN_DURATION = 4000L
        private const val OUT_ANIMATION_DURATION = 600L
        private const val IN_ANIMATION_DURATION = 800L
        private const val NEXT_DELAY = 500L
    }
}
