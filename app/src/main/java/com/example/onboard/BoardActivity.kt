package com.example.onboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hololo.tutorial.library.TutorialActivity
import android.R
import android.graphics.Color
import android.graphics.Color.parseColor
import com.hololo.tutorial.library.Step


class BoardActivity : TutorialActivity() {

    override fun currentFragmentPosition(position: Int) {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addFragment(
            Step.Builder().setTitle("MARIÃO DA MASSA")
                .setContent("AQUI FICARIA O SUBTITULO")
                .setBackgroundColor(parseColor("#FF0957")) // int background color
                .setDrawable(com.example.onboard.R.drawable.im3) // int top drawable
                .setSummary("AQUI SEI LÁ")
                .build()
        )
    }
}
