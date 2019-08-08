package com.example.android.leaderboardui

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide

class LeaderBoardViewPagerAdapter(context: Context, imageUrls: Array<String>) : PagerAdapter() {

   private var context = context
    private var imageUrls = imageUrls
    init {

    }

    val MAX_VALUE = 200

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return imageUrls.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imageView = ImageView(context)
        Glide.with(context)
            .load(imageUrls[position])
            .centerCrop()
            .into(imageView)
        container.addView(imageView)
        return imageView
    }



    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }
}