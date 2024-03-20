package com.training.notesrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.training.notesrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val noteslist=ArrayList<Notes>()
    private lateinit var notesadapter: NotesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        prepareData()
        showList()
        changeLayout()
    }

    private fun changeLayout() {
binding.linear.setOnClickListener {
    notesadapter= NotesAdapter(noteslist)
    binding.view.layoutManager=LinearLayoutManager(this)
    binding.view.adapter=notesadapter
}
        binding.grid.setOnClickListener {
            notesadapter=NotesAdapter(noteslist)
            binding.view.layoutManager=GridLayoutManager(this,2)
            binding.view.adapter=notesadapter
        }
        binding.staggrid.setOnClickListener {
            notesadapter= NotesAdapter(noteslist)
            binding.view.layoutManager=StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL)
            binding.view.adapter=notesadapter
        }


    }

    private fun showList(){
         notesadapter= NotesAdapter(noteslist)
        binding.view.layoutManager=LinearLayoutManager(this)
        binding.view.adapter=notesadapter
        ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT){
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position=viewHolder.adapterPosition
                noteslist.removeAt(position)
                notesadapter.notifyItemRemoved(position)
            }
        }).attachToRecyclerView(binding.view)
    }
    private fun prepareData(){
            noteslist.add(
                Notes(
                notes = "Notes",
                title = "Tommorow's meetings",
                    body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                    date_time = "Friday 4:00",
                    priority = Priority.HIGH
            )
            )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Today's meetings",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Thursday 3:00",
                priority = Priority.LOW
            )
        )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Today's meetings",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Thursday 3:00",
                priority = Priority.MEDIUM
            )
        )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Reminder to seld",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Saturday 6:00",
                priority = Priority.HIGH
            )
        )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Tommorow's meetings",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Friday 4:00",
                priority = Priority.HIGH
            )
        )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Today's meetings",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Thursday 3:00",
                priority = Priority.LOW
            )
        )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Today's meetings",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Thursday 3:00",
                priority = Priority.MEDIUM
            )
        )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Reminder to seld",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Saturday 6:00",
                priority = Priority.HIGH
            )
        )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Tommorow's meetings",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Friday 4:00",
                priority = Priority.HIGH
            )
        )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Today's meetings",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Thursday 3:00",
                priority = Priority.LOW
            )
        )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Today's meetings",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Thursday 3:00",
                priority = Priority.MEDIUM
            )
        )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Reminder to seld",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Saturday 6:00",
                priority = Priority.HIGH
            )
        )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Tommorow's meetings",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Friday 4:00",
                priority = Priority.HIGH
            )
        )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Today's meetings",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Thursday 3:00",
                priority = Priority.LOW
            )
        )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Today's meetings",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Thursday 3:00",
                priority = Priority.MEDIUM
            )
        )
        noteslist.add(
            Notes(
                notes = "Notes",
                title = "Reminder to seld",
                body = "A paragraph (from Ancient Greek παράγραφος (parágraphos) 'to write beside') is a self-contained unit of discourse in writing dealing with a particular point or idea. Though not required by the orthographic conventions of any language with a writing system, paragraphs are a conventional means of organizing extended segments of prose",
                date_time = "Saturday 6:00",
                priority = Priority.HIGH
            )
        )

    }    }

