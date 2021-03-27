package com.kamilmasyhur.dicoding.myapplication.zahid.localization

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.kamilmasyhur.dicoding.myapplication.R
import android.provider.Settings
import com.kamilmasyhur.dicoding.myapplication.databinding.ActivityLocalizationBinding

class LocalizationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLocalizationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_localization)

        binding = ActivityLocalizationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pokeCount = 3
        val hello = resources.getString(R.string.hello_world, "Narenda Wicaksono", pokeCount, "Yoza Aprilio")
        binding.tvHello.text = hello
        val songCount = 5
        val pluralText = resources.getQuantityString(R.plurals.numberOfSongsAvailable, songCount, songCount)
        binding.tvPlural.text = pluralText
        binding.tvXliff.text = resources.getString(R.string.app_homeurl)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.localization_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_change_settings) {
            val mIntent = Intent(Settings.ACTION_LOCALE_SETTINGS)
            startActivity(mIntent)
        }
        return super.onOptionsItemSelected(item)
    }
}