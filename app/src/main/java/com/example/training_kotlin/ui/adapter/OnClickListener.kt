package com.example.training_kotlin.ui.adapter

import com.example.training_kotlin.model.User

interface OnClickListener {

    fun onCLick(user: User, position: Int)

    fun onLongCLick(user: User)
}
