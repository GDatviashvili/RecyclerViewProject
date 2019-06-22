package com.example.recyclerviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val movies = listOf(
        Movie( 1,"","UA",73,2300,"Captain Marvel","English","3D",true),
        Movie( 1,"","UA",73,2300,"Captain Marvel","English","3D",true),
        Movie( 1,"","UA",73,2300,"Captain Marvel","English","3D",false),
        Movie( 1,"","UA",73,2300,"Captain Marvel","English","3D",false),
        Movie( 1,"","UA",73,2300,"Captain Marvel","English","3D",true),
        Movie( 1,"","UA",73,2300,"Captain Marvel","English","3D",true),
        Movie( 1,"","UA",73,2300,"Captain Marvel","English","3D",true)
    )
    recyclerViewMovies.layoutManager = LinearLayoutManager(this)
        recyclerViewMovies.adapter = MovieAdapter(movies)
    }
}
