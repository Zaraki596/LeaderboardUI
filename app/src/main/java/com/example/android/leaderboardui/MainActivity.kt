package com.example.android.leaderboardui

import android.os.Bundle
import android.view.Gravity
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator

class MainActivity : AppCompatActivity() {

    var imageUrls: Array<String> = arrayOf(
        "https://cdn.pixabay.com/photo/2016/11/11/23/34/cat-1817970_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/12/21/12/26/glowworm-3031704_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/12/24/09/09/road-3036620_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/11/07/00/07/fantasy-2925250_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/10/10/15/28/butterfly-2837589_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/12/21/12/26/glowworm-3031704_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/12/24/09/09/road-3036620_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/12/21/12/26/glowworm-3031704_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/12/24/09/09/road-3036620_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/12/21/12/26/glowworm-3031704_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/12/24/09/09/road-3036620_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/12/21/12/26/glowworm-3031704_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/12/24/09/09/road-3036620_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/12/21/12/26/glowworm-3031704_960_720.jpg",
        "https://cdn.pixabay.com/photo/2017/12/24/09/09/road-3036620_960_720.jpg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        View pager intialization for the items to load
        val viewPager = findViewById<ViewPager>(R.id.vp_leaderboard_img_slider)
        val indicator = findViewById<ScrollingPagerIndicator>(R.id.vp_scroll_indicator)
        val viewPagerAdapter = LeaderBoardViewPagerAdapter(this,imageUrls)
        viewPager.adapter = viewPagerAdapter
        indicator.attachToPager(viewPager)


        iv_drop_popmenu.setOnClickListener {
            var popupMenu: PopupMenu? = null
            popupMenu = PopupMenu(this, it, Gravity.END)
            popupMenu.inflate(R.menu.pop_time_menu)
            popupMenu.setOnMenuItemClickListener {
                when (it.itemId) {
                    R.id.menu_today -> {
                        Toast.makeText(this, "today", Toast.LENGTH_SHORT).show()
                    }
                    R.id.menu_week -> {
                        Toast.makeText(this, "week", Toast.LENGTH_SHORT).show()
                    }
                    R.id.menu_month -> {
                        Toast.makeText(this, "month", Toast.LENGTH_SHORT).show()
                    }
                    R.id.menu_all_time -> {
                        Toast.makeText(this, "all time", Toast.LENGTH_SHORT).show()
                    }
                }
                true
            }
            popupMenu.show()
        }
    }
}
