package com.example.hw.task3.model

data class QAModel(
    val id: String,
    val question: String,
    val answers: List<AnswerModel>
)