package com.training.notesrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.training.notesrecyclerview.Notes
import com.training.notesrecyclerview.databinding.ActivityNotesDetailsBinding


class NotesDetails : AppCompatActivity() {
    private lateinit var binding: ActivityNotesDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNotesDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val note=intent.getSerializableExtra("data") as Notes
        binding.notes.text=note.notes
        binding.title.text=note.title
        binding.body.text=note.body
        binding.time.text=note.date_time
        binding.priority.text=note.priority.toString()
    }
}