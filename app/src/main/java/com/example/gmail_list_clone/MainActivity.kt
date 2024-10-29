package com.example.gmail_list_clone

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.gmail_list_clone.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val emails = listOf(
            "Thanh Nguyen - Day la tieu de 1",
            "Thanh Nguyen - Day la tieu de 2",
            "Thanh Nguyen - Day la tieu de 3",
            "Thanh Nguyen - Day la tieu de 4",
            "Thanh Nguyen - Day la tieu de 5"
        )

        val listView = findViewById<ListView>(R.id.listView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, emails)
        listView.adapter = adapter
    }
}
