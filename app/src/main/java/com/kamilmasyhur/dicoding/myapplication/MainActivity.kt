package com.kamilmasyhur.dicoding.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.kamilmasyhur.dicoding.myapplication.zahid.appbar.AppBarActivity
import com.kamilmasyhur.dicoding.myapplication.zahid.bottomnavigation.BottomNavigationActivity
import com.kamilmasyhur.dicoding.myapplication.zahid.localization.LocalizationActivity
import com.kamilmasyhur.dicoding.myapplication.zahid.navigationdrawer.NavDrawerActivity
import com.kamilmasyhur.dicoding.myapplication.zahid.tablayout.TabActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1: Button = findViewById(R.id.button)
        val btn2: Button = findViewById(R.id.button2)
        val btn3: Button = findViewById(R.id.button3)
        val btn4: Button = findViewById(R.id.button4)
        val btn5: Button = findViewById(R.id.button5)

        btn1.setOnClickListener {
            val moveIntent = Intent(
                this@MainActivity,
                AppBarActivity::class.java
            )
            startActivity(moveIntent)
        }
        btn2.setOnClickListener {
            val moveIntent = Intent(
                this@MainActivity,
                BottomNavigationActivity::class.java
            )
            startActivity(moveIntent)
        }
        btn3.setOnClickListener {
            val moveIntent = Intent(
                this@MainActivity,
                NavDrawerActivity::class.java
            )
            startActivity(moveIntent)
        }
        btn4.setOnClickListener {
            val moveIntent = Intent(
                this@MainActivity,
                TabActivity::class.java
            )
            startActivity(moveIntent)
        }
        btn5.setOnClickListener {
            val moveIntent = Intent(
                this@MainActivity,
                LocalizationActivity::class.java
            )
            startActivity(moveIntent)
        }
    }
}
