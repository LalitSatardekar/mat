package com.example.recyclerview 
 
import android.view.LayoutInflater 
import android.view.View 
import android.view.ViewGroup 
import android.widget.TextView 
import androidx.recyclerview.widget.RecyclerView 
 
class MyAdapter(private val dataList: List<String>) : 
    RecyclerView.Adapter<MyAdapter.ViewHolder>() { 
 
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) { 
        val textName: TextView = itemView.findViewById(R.id.textName) 
    } 
 
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): 
ViewHolder { 
        val view = LayoutInflater.from(parent.context) 
            .inflate(R.layout.item_row, parent, false) 
        return ViewHolder(view) 
    } 
 
    override fun onBindViewHolder(holder: ViewHolder, position: Int) { 
        holder.textName.text = dataList[position] 
    } 
 
    override fun getItemCount(): Int { 
        return dataList.size 
    } 
} 