package com.example.retrofit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.model.Question
import kotlinx.android.synthetic.main.question_item.view.*

class ListAdapter (private val context: Context, private val mQuestions: List<Question>, private val mRowLayout: Int) : RecyclerView.Adapter<ListAdapter.QuestionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(mRowLayout, parent, false)
        return QuestionViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuestionViewHolder, position: Int) {

        holder.image.setImageResource(mQuestions[position].imageResource)
        holder.title.text = mQuestions[position].title
        holder.author.text = mQuestions[position].author
        holder.link.text = mQuestions[position].link


    }

    override fun getItemCount(): Int {
        return mQuestions.size
    }

    class QuestionViewHolder(val containerView: View) : RecyclerView.ViewHolder(containerView) {
        val image = itemView.imageView;
        val title = containerView.textView;
        val author = containerView.textView2;
        val link = containerView.textView3;
    }
}



