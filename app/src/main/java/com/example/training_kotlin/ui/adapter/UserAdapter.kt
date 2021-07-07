package com.example.training_kotlin.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.training_kotlin.R
import com.example.training_kotlin.databinding.LayoutItemUserAltBinding
import com.example.training_kotlin.model.User
import com.squareup.picasso.Picasso


class UserAdapter(
    private val users: List<User>,
    private val onClickListener: OnClickListener
) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    private lateinit var context: Context
    private lateinit var layout: View

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_item_user_alt, parent, false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = users[position]

        with(holder) {
            setListener(user, position + 1)
            binding.tvOrder.text = user.id.toString()
            binding.tvName.text = user.getFullName()
            Picasso.get()
                .load(user.url)
                .into(binding.imgPhoto)
        }
    }

    override fun getItemCount(): Int = users.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = LayoutItemUserAltBinding.bind(itemView)

        fun setListener(user: User, position: Int) {
            binding.root.setOnClickListener { onClickListener.onCLick(user, position) }
            binding.root.setOnLongClickListener {
                onClickListener.onLongCLick(user)
                true
            }
        }
    }
}
