package com.creeds_code.notekeeper

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.creeds_code.notekeeper.databinding.ActivityNoteListBinding

class NoteListActivity : AppCompatActivity() {


    private lateinit var binding: ActivityNoteListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNoteListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)



        binding.fab.setOnClickListener { view ->
            val activityIntent = Intent(this, MainActivity::class.java)
            startActivity(activityIntent)
        }
        binding.listNotes.adapter = ArrayAdapter(this,
        android.R.layout.simple_list_item_1,
        DataManager.notes)

        binding.listNotes.setOnItemClickListener{parent,view,position,id ->
            val activityIntent = Intent(this,MainActivity::class.java)
            activityIntent.putExtra(NOTE_POSITION,position)
            startActivity(activityIntent)
        }
    }

    override fun onResume() {
        super.onResume()
        (binding.listNotes.adapter as ArrayAdapter<NoteInfo>).notifyDataSetChanged()
    }


}