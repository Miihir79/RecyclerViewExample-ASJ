package com.mihir.recyclerviewexample_asj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val URL = "https://picsum.photos/200" // to generate random images needs internet permission

        // making a simple list of ItemClass objects to be displayed
        val list = listOf(
            ItemClass(1,"ABC","ABC@BCD",URL),
            ItemClass(2,"BCD","ABC@BCD",URL),
            ItemClass(3,"CDE","ABC@BCD",URL),
            ItemClass(4,"DEF","DEF@BCD",URL),
        )

        val adapter = ItemAdapter(list)  // initializing the adapter
        val recycler : RecyclerView = findViewById(R.id.recycler)

        recycler.adapter = adapter  // attaching adapter that we made with our recycler

        // helps us set custom arrangements of our items inside of the recyclerview
        recycler.layoutManager = LinearLayoutManager(this)
    }
}