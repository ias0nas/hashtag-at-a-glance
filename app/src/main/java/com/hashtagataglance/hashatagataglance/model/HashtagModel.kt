package com.hashtagataglance.hashatagataglance.model

import java.util.*

data class HashtagModel(
        var tag: String,
        var lastUpdated: Date,
        var recent: Boolean
)