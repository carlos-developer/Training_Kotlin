package com.example.training_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.training_kotlin.databinding.LayoutItemUserBinding

class UserAdapter(private val users: List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder ( LayoutInflater.from(parent.context)
                          .inflate(R.layout.layout_item_user,
                              parent,
                              false)
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = users[position]

        with(holder) {
            binding.tvOrder.text = user.id.toString()
            binding.tvName.text = user.name
        }
    }

    override fun getItemCount(): Int = users.size

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val binding = LayoutItemUserBinding.bind(itemView)

    }
}
