package com.example.cusotmviewdemo

import android.app.Application
import androidx.emoji.bundled.BundledEmojiCompatConfig
import androidx.emoji.text.EmojiCompat


/**
 * This application uses EmojiCompat.
 */
class EmojiCompatApplication : Application() {


    override fun onCreate() {
        super.onCreate()

        val config: EmojiCompat.Config

        config = BundledEmojiCompatConfig(applicationContext)

        EmojiCompat.init(config)
    }

}
