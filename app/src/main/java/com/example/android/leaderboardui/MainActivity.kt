package com.example.android.leaderboardui

import android.os.Bundle
import android.view.Gravity
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_drop_popmenu.setOnClickListener{
            var popupMenu : PopupMenu?= null
            popupMenu = PopupMenu(this, it,Gravity.END)
            popupMenu.inflate(R.menu.pop_time_menu)
            popupMenu.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.menu_today -> {
                        Toast.makeText(this, "today", Toast.LENGTH_SHORT).show()
                    }
                    R.id.menu_week -> {
                        Toast.makeText(this,"week", Toast.LENGTH_SHORT).show()
                    }
                    R.id.menu_month -> {
                        Toast.makeText(this,"month", Toast.LENGTH_SHORT).show()
                    }
                    R.id.menu_all_time -> {
                        Toast.makeText(this,"all time", Toast.LENGTH_SHORT).show()
                    }
                }
                true
            }
            popupMenu.show()
        }
    }
}
