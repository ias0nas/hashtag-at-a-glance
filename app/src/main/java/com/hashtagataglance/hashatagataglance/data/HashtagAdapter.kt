package com.hashtagataglance.hashatagataglance.data

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.hashtagataglance.hashatagataglance.R

class HashtagAdapter(val hashtagList: List<String>): RecyclerView.Adapter<HashtagAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.txtName?.text = hashtagList[position]
        holder?.txtTitle?.text = hashtagList[position]

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context)
                .inflate(R.layout.recent_hashtag_card, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return hashtagList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val txtName = itemView.findViewById<TextView>(R.id.txtName)
        val txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)

    }

}