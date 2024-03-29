package com.example.recyclerviewproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_movie.view.*

class MovieAdapter(val movies : List<Movie>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_movie,parent,false)
        )
    }

    override fun getItemCount() = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]

        holder.view.textViewTitle.text = movie.title
        holder.view.textViewLanguage.text = movie.language
        holder.view.textViewType.text = movie.type
        holder.view.textViewRating.text = movie.rating
        holder.view.textViewLikePercent.text = movie.likePercent.toString()+"%"
        holder.view.textViewVotesCount.text =  movie.voteCount.toString()+"votes"

        holder.view.textViewIsNew.visibility = if(movie.isNew) View.VISIBLE else View.INVISIBLE
    }


    class MovieViewHolder(val view:View) : RecyclerView.ViewHolder(view)
}