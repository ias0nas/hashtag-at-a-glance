package com.hashtagataglance.hashatagataglance.data

import android.content.Context
import com.hashtagataglance.hashatagataglance.AppConfig

class HashtagData {
    fun recentHashtags(context: Context): List<String> {
        var recentHashtags: MutableList<String> = mutableListOf()

        context.getSharedPreferences(
                AppConfig.SharedPreferencesFileName.RECENT_HASHTAGS,
                android.content.Context.MODE_PRIVATE)
                .all.keys.forEach { hashtag -> recentHashtags.add(hashtag) }

        return recentHashtags
    }
}