 package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



 class MainActivity : AppCompatActivity() {

    private lateinit var list : ArrayList<News>
    private lateinit var img : Array<Int>
    private lateinit var txt : Array<String>

    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        txt = arrayOf("asanka pradeep dharmasena asanka",
            "asanka pradeep dharmasena asanka",
            "asanka pradeep dharmasena asanka",
            "asanka pradeep dharmasena asanka",
            "asanka pradeep dharmasena asanka",
            "asanka pradeep dharmasena asanka",
            "asanka pradeep dharmasena asanka",
            "asanka pradeep dharmasena asanka",
            "asanka pradeep dharmasena asanka",
            "asanka pradeep dharmasena asanka",
            "asanka pradeep dharmasena asanka",
            "asanka pradeep dharmasena asanka")
        img = arrayOf(R.drawable.a,R.drawable.b,R.drawable.c,
            R.drawable.a,R.drawable.b,R.drawable.c,
            R.drawable.a,R.drawable.b,R.drawable.c,
            R.drawable.a,R.drawable.b,R.drawable.c)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        list = arrayListOf()
        setData()
        recyclerView.adapter = MyAdapter(list)

    }

     private fun setData() {
        for( i in img.indices){
            val news = News(img[i], txt[i])
            list.add(news)
        }
     }
 }