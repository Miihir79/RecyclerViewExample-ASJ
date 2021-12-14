package com.mihir.recyclerviewexample_asj

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ItemAdapter(var items:List<ItemClass>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val Uname : TextView= itemView.findViewById(R.id.Uname)
        val UID : TextView= itemView.findViewById(R.id.UID)
        val photo : ImageView= itemView.findViewById(R.id.img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // this function inflates the layout
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // this function binds or connects the data with UI
        holder.UID.text = items[position].Uid
        holder.Uname.text = items[position].UName
        // loading images from URL using glide coil can also be used for the same
        Glide.with(holder.photo.context).load(items[position].Img).into(holder.photo)
    }

    override fun getItemCount(): Int {
        // this function just returns the number of items
        return items.size
    }
}