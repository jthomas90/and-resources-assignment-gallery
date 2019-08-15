package com.example.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val importedPics = ArrayList<ImageView>(10)

        importedPics[0].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
        importedPics[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.adventure_automobile_classic_2533092))
        importedPics[2].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.afterglow_beach_cliff_2555285))
        importedPics[3].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
        importedPics[4].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.alley_architecture_buildings_2526517))
        importedPics[5].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.architectural_design_architecture_bridge_2540653))
        importedPics[6].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.beautiful_breathtaking_canada_day_2526105))
        importedPics[7].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011))
        importedPics[8].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.close_up_colorful_colors_2529148))
        importedPics[9].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.clouds_coconut_trees_daylight_2486168))
        importedPics[10].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.colorful_colourful_houses_2501965))

    }

}