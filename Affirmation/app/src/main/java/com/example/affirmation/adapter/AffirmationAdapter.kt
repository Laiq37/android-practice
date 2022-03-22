package com.example.affirmation.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmation.R
import com.example.affirmation.model.Affirmation

class AffirmationAdapter(private val context: Context ,private val dataSet : List<Affirmation>) : RecyclerView.Adapter<AffirmationAdapter.AffirmationViewHolder>(){


    class AffirmationViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AffirmationViewHolder {
        val adapterView: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return  AffirmationViewHolder(adapterView)
    }

    override fun onBindViewHolder(holder: AffirmationViewHolder, position: Int) {
        val currAff:Affirmation = dataSet[position]
        holder.imageView.setImageResource(currAff.affirmationImgId)
        holder.textView.text = context.resources.getString(currAff.affiramtionId)
    }

    override fun getItemCount(): Int = dataSet.size

}