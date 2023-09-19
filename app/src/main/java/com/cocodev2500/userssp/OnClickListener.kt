package com.cocodev2500.userssp

import androidx.recyclerview.widget.RecyclerView

interface OnClickListener {
    fun onClick(user: User, position:Int )
}