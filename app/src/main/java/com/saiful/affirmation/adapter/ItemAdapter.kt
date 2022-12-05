package com.saiful.affirmation.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.saiful.affirmation.R
import com.saiful.affirmation.model.Affirmation

class ItemAdapter(
    private val context: Context,
    private val dataSet: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val displayTitle: TextView = view.findViewById(R.id.displayTitle)
        val displayId: TextView = view.findViewById(R.id.displayId)
        val profileAvatar: ImageView = view.findViewById(R.id.profileAvatar)
        val displayBloodGroup: TextView = view.findViewById(R.id.displayBloodGroup)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        var item = dataSet[position]
        Log.d("item", item.displayName.toString())
        holder.displayTitle.text = item.displayName
        holder.displayId.text = item.displayId
        holder.profileAvatar.setImageResource(item.imageResourceId)
        holder.displayBloodGroup.text = item.displayBloodGroup
    }

    override fun getItemCount() = dataSet.size
}