package com.example.alkhurayyif_linah_guessthephrasepart2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.alkhurayyif_linah_guessthephrasepart2.R
import kotlinx.android.synthetic.main.recycler_view.view.*

class GuessthephraseAdapter(val messages: ArrayList<String>):
    RecyclerView.Adapter<GuessthephraseAdapter.GuessthephraseViewHolder>() {
    class GuessthephraseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuessthephraseViewHolder {
        return GuessthephraseViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_view,parent,false)
        )
    }

    override fun onBindViewHolder(holder: GuessthephraseViewHolder, position: Int) {
        val message = messages[position]
        holder.itemView.apply {
            guessthephraseMessage.text= message
        }
    }


    override fun getItemCount()= messages.size
}
