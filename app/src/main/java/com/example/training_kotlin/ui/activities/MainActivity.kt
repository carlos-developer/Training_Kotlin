package com.example.training_kotlin.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.training_kotlin.Utils
import com.example.training_kotlin.databinding.ActivityMainBinding
import com.example.training_kotlin.model.User
import com.example.training_kotlin.ui.adapter.OnClickListener
import com.example.training_kotlin.ui.adapter.UserAdapter

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var userAdapter: UserAdapter
    private val linearLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userAdapter = UserAdapter(Utils.getUsers(), this)
        binding.recyclerViewUser.apply {
            setHasFixedSize(true)
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }
    }

    override fun onCLick(user: User, position: Int) {
    }

    override fun onLongCLick(user: User) {
    }
}
