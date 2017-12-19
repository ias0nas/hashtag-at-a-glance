package com.hashtagataglance.hashatagataglance

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hashtagataglance.hashatagataglance.AppConfig.HashtagType.Companion.RECENT
import com.hashtagataglance.hashatagataglance.AppConfig.SharedPreferencesFileName.Companion.RECENT_HASHTAGS
import kotlinx.android.synthetic.main.activity_hashtag.*

class Hashtag : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hashtag)
        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btAddHashtag.setOnClickListener { _ ->
            addRecentHashtag(etHashtag.text.toString())
        }
    }

    fun addRecentHashtag(hashtag: String) {
        val sharedPreferences = this.getSharedPreferences(RECENT_HASHTAGS,
                android.content.Context.MODE_PRIVATE)
        sharedPreferences.edit().putInt(hashtag, RECENT)
    }
}
