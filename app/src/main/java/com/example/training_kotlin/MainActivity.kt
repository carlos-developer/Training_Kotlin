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

        /**------------------------------------------------------------*/

        userAdapter = UserAdapter(getUsers())
        binding.recyclerViewUser.apply {
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }
    }

    private fun getUsers(): List<User> {
        return listOf(
            User(
                1,
                "Juan",
                "Suarez",
                "https://live.staticflickr.com/7385/8993534463_241b0b6eb8_b.jpg"
            ),
            User(
                2,
                "Pedro",
                "Suarez",
                "https://upload.wikimedia.org/wikipedia/commons/c/c1/Bar%C3%A7a_-_Napoli_-_20140806_-_Pedro_Rodriguez.jpg"
            ),
            User(
                3,
                "Sara",
                "Suarez",
                "https://live.staticflickr.com/4101/4819040531_47dbbeff73_b.jpg"
            ),
            User(
                4,
                "Andrea",
                "Suarez",
                "https://upload.wikimedia.org/wikipedia/commons/0/07/Andrea_Sola.jpg"
            ),
            User(
                5,
                "Giovana",
                "Suarez",
                "https://assets-jpcust.jwpsrv.com/thumbnails/tix75cxd-720.jpg"
            ),
            User(
                6,
                "Juan",
                "Suarez",
                "https://live.staticflickr.com/7385/8993534463_241b0b6eb8_b.jpg"
            ),
            User(
                7,
                "Pedro",
                "Suarez",
                "https://upload.wikimedia.org/wikipedia/commons/c/c1/Bar%C3%A7a_-_Napoli_-_20140806_-_Pedro_Rodriguez.jpg"
            ),
            User(
                8,
                "Sara",
                "Suarez",
                "https://live.staticflickr.com/4101/4819040531_47dbbeff73_b.jpg"
            ),
            User(
                9,
                "Andrea",
                "Suarez",
                "https://upload.wikimedia.org/wikipedia/commons/0/07/Andrea_Sola.jpg"
            ),
            User(
                10,
                "Giovana",
                "Suarez",
                "https://assets-jpcust.jwpsrv.com/thumbnails/tix75cxd-720.jpg"
            ),
            User(
                11,
                "Juan",
                "Suarez",
                "https://live.staticflickr.com/7385/8993534463_241b0b6eb8_b.jpg"
            ),
            User(
                12,
                "Pedro",
                "Suarez",
                "https://upload.wikimedia.org/wikipedia/commons/c/c1/Bar%C3%A7a_-_Napoli_-_20140806_-_Pedro_Rodriguez.jpg"
            ),
            User(
                13,
                "Sara",
                "Suarez",
                "https://live.staticflickr.com/4101/4819040531_47dbbeff73_b.jpg"
            ),
            User(
                14,
                "Andrea",
                "Suarez",
                "https://upload.wikimedia.org/wikipedia/commons/0/07/Andrea_Sola.jpg"
            ),
            User(
                15,
                "Giovana",
                "Suarez",
                "https://assets-jpcust.jwpsrv.com/thumbnails/tix75cxd-720.jpg"
            )
        )
    }
}
