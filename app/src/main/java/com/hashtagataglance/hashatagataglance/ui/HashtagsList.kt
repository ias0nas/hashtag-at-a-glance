package com.hashtagataglance.hashatagataglance.ui

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.hashtagataglance.hashatagataglance.R
import com.hashtagataglance.hashatagataglance.data.HashtagAdapter
import com.hashtagataglance.hashatagataglance.data.HashtagData

import kotlinx.android.synthetic.main.activity_hashtags_list.*

class HashtagsList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hashtags_list)
        setSupportActionBar(toolbar)

        val recentHashtags = HashtagData().recentHashtags(this)
        rc_hashtags.hasFixedSize()
        rc_hashtags.layoutManager = LinearLayoutManager(this)
        rc_hashtags.adapter = HashtagAdapter(recentHashtags)

        if (recentHashtags.count() > 1) {
            tv_noRecentHashtags.visibility = View.GONE
        }

        fabNewHashtag.setOnClickListener { _ ->
            val intent = Intent(this, NewHashtag::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_hashtags_list, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_social_media_accounts -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
