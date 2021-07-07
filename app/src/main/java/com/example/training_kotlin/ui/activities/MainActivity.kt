package com.example.training_kotlin.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.training_kotlin.R
import com.example.training_kotlin.Utils
import com.example.training_kotlin.databinding.ActivityMainBinding
import com.example.training_kotlin.model.User
import com.example.training_kotlin.ui.adapter.OnClickListener
import com.example.training_kotlin.ui.adapter.UserAdapter
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var userAdapter: UserAdapter
    private val linearLayoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val preferences = getPreferences(MODE_PRIVATE)

        val isFirstTime = preferences.getBoolean(getString(R.string.sp_firstTime), true)

        if (isFirstTime) {
            val dialogView = layoutInflater.inflate(R.layout.dialog_register, null)

            MaterialAlertDialogBuilder(this)
                .setTitle(R.string.dialog_title)
                .setView(dialogView)
                .setCancelable(false)
                .setPositiveButton(R.string.dialog_confirm) { _, _ ->
                    val userName =
                        dialogView.findViewById<TextInputEditText>(R.id.edit_text_user_name)
                            .text
                            .toString()

                    with(preferences.edit()) {
                        putBoolean(getString(R.string.sp_firstTime), false)
                        putString(getString(R.string.sp_user_name), userName).apply()
                    }
                }
                .show()
        }

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
