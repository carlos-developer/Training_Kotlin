package com.example.training_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.training_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var userAdapter: UserAdapter
    private val linearLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /** Lista añadida para probar el funcionamiento del adaptador*/
        val list = listOf(User(1,"Juan", "Suarez", "url//:"),
            User(2,"Pedro", "Suarez", "url//:"),
            User(3,"Sara", "Suarez", "url//:"),
            User(4,"Andrea", "Suarez", "url//:"),
            User(5,"Giovana", "Suarez", "url//:"))
        /**------------------------------------------------------------*/

        userAdapter = UserAdapter(list)
        binding.recyclerViewUser.apply {
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }
    }
}