package com.training.notesrecyclerview
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.training.notesrecyclerview.databinding.NotesItemLayoutBinding
import com.training.notesrecyclerview.NotesDetails


class NotesAdapter(private val notes:List<Notes>):
    RecyclerView.Adapter<NotesAdapter.NotesViewHolder>(){

    private lateinit var binding: NotesItemLayoutBinding

    override fun getItemCount()=notes.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        binding= NotesItemLayoutBinding.inflate(layoutInflater,parent,false)
        return NotesViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: NotesViewHolder,position:Int) {
        val note=notes[position]
        holder.notes.text=note.notes
        holder.title.text=note.title
        holder.body.text=note.body
        holder.time.text=note.date_time
        holder.priority.text=note.priority.toString()
        holder.itemView.setOnClickListener{
            val intent=Intent(binding.root.context,NotesDetails::class.java)
            intent.putExtra("data",note)
            binding.root.context.startActivity(intent)
        }
    }
    inner class NotesViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        fun bind(item:Notes){
        val notes: TextView = binding.
        val title: TextView = binding.title
        val body: TextView = binding.body
        val time: TextView=binding.
    }
}