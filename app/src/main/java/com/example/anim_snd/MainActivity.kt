package com.example.anim_snd

import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity() : AppCompatActivity() {

    private var soundPool: SoundPool? = null
    private var soundId1: Int = 0
    private var soundId2: Int = 0
    private var soundId3: Int = 0
    private var soundId4: Int = 0
    private var soundId5: Int = 0
    private var soundId6: Int = 0
    var Random_One_Six = Random.nextInt(1, 6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.b1).setOnClickListener {
            playSound(1)
            MainScope().launch {
                for (i in 0..179) {
                    it.rotationX = it.rotationX + 1
                    delay(1)
                }
            }
        }

        findViewById<Button>(R.id.b2).setOnClickListener {
            playSound(2)
            MainScope().launch {
                for (i in 0..179) {
                    it.rotationX = it.rotationX + 1
                    delay(1)
                }
            }
        }

        findViewById<Button>(R.id.b3).setOnClickListener {
            playSound(3)
            MainScope().launch {
                for (i in 0..179) {
                    it.rotationX = it.rotationX + 1
                    delay(1)
                }
            }
        }

        findViewById<Button>(R.id.b4).setOnClickListener {
            playSound(4)
            MainScope().launch {
                for (i in 0..179)
                {
                    it.rotationX =  it.rotationX +1
                    delay(1)
                }
            }
        }

        findViewById<Button>(R.id.b5).setOnClickListener {
            playSound(5)
            MainScope().launch {
                for (i in 0..179)
                {
                    it.rotationX =  it.rotationX +1
                    delay(1)
                }
            }
        }

        findViewById<Button>(R.id.b6).setOnClickListener {
            playSound(6)
            MainScope().launch {
                for (i in 0..179)
                {
                    it.rotationX =  it.rotationX +1
                    delay(1)
                }
            }
        }
    }

    fun playSound(sound: Int) {

        var soundId = 0
        if (sound != 0) {
            Random_One_Six = sound
        }
        when (Random_One_Six) {
            1 -> soundId = soundId1
            2 -> soundId = soundId2
            3 -> soundId = soundId3
            4 -> soundId = soundId4
            5 -> soundId = soundId5
            6 -> soundId = soundId6
        }


    }
}