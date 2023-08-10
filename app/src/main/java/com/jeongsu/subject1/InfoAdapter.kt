package com.jeongsu.subject1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InfoAdapter(private val items: ArrayList<PData>):RecyclerView.Adapter<InfoAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent:ViewGroup,viewType:Int):ViewHolder
    {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ViewHolder(view)
    }
    override fun getItemCount():Int =items.size
    override fun onBindViewHolder(holder:ViewHolder,position:Int)
    {
        holder.bind(items[position])
    }
    inner class ViewHolder(view:View): RecyclerView.ViewHolder(view)
    {

        private val name:TextView=itemView.findViewById(R.id.name)
        private val phoneNumber:TextView=itemView.findViewById(R.id.phone_number)

        fun bind(item:PData)
        {
            name.text=item.name;
            phoneNumber.text=item.phoneNumber;
        }
    }
}