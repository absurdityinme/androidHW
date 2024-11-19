package com.example.hw.recyclerView

import java.io.Serializable

sealed class MultipleHoldersData(
    open val id: String
): Serializable

class ButtonHolderData(
    override val id: String,
    val btn1: String,
    val btn2: String
) : MultipleHoldersData(id)

class BasicHolderData(
    override val id: String,
    val description: String,
    val title: String,
    val imageUrl: String,
) : MultipleHoldersData(id)