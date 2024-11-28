package com.example.hw.task3.utils

import com.example.hw.task3.model.AnswerModel
import com.example.hw.task3.model.QAModel

object QARepository {

    fun getQAs(): List<QAModel> = listOf(
        QAModel(
            id = "a12bp",
            question = "What's name of the main character?",
            answers = listOf(
                AnswerModel(
                    answer = "James Sunderland"
                ),
                AnswerModel(
                    answer = "Harry Mason"
                ),
                AnswerModel(
                    answer = "Heather"
                )
        ),
        ),
        QAModel(
            id = "ajj7",
            question = "What is the name of the main character's daughter?",
            answers = listOf(
                AnswerModel(
                    answer = "Cheryl"
                ),
                AnswerModel(
                    answer = "Abby"
                ),
                AnswerModel(
                    answer = "Mary"
                ),
                AnswerModel(
                    answer = "Sophia"
                )
            )
        ),
        QAModel(
            id = "as2",
            question = "Where was the first appearance of Lisa?",
            answers = listOf(
                AnswerModel(
                    answer = "School"
                ),
                AnswerModel(
                    answer = "Antiques Shop"
                ),
                AnswerModel(
                    answer = "Hospital"
                ),
                AnswerModel(
                    answer = "Sewers"
                )
            )
        ),
        QAModel(
            id = "e78f",
            question = "What's the name of the antiques shop?",
            answers = listOf(
                AnswerModel(
                    answer = "Green Eagle",
                ),
                AnswerModel(
                    answer = "Red Tiger",
                ),
                AnswerModel(
                    answer = "Green Rabbit",
                ),
                AnswerModel(
                    answer = "Green Lion",
                ),
                AnswerModel(
                    answer = "Red Bird"
                )
            )
       ),
        QAModel(
            id = "r90sl",
            question = "What weapon is not in the game?",
            answers = listOf(
                AnswerModel(
                    answer = "Shotgun"
                ),
                AnswerModel(
                    answer = "Hammer"
                ),
                AnswerModel(
                    answer = "Rifle"
                ),
                AnswerModel(
                    answer = "Crossbow"
                )
            )
        ),
        QAModel(
            id = "a78sa",
            question = "What state is Silent Hill in?",
            answers = listOf(
                AnswerModel(
                    answer = "Ohio"
                ),
                AnswerModel(
                    answer = "Maine"
                ),
                AnswerModel(
                    answer = "Michigan"
                ),
                AnswerModel(
                    answer = "Iowa"
                ),
                AnswerModel(
                    answer = "Utah"
                )
            )
        ),
        QAModel(
            id = "b788ss",
            question = "What theme was the riddle in the hospital about?",
            answers = listOf(
                AnswerModel(
                    answer = "The Wizard of Oz"
                ),
                AnswerModel(
                    answer = "JoJo's Bizarre Adventure"
                ),
                AnswerModel(
                    answer = "Alice in Wonderland"
                )
            )
        ),
        QAModel(
            id = "g124l",
            question = "Where did Cybil see the protagonist's daughter?",
            answers = listOf(
                AnswerModel(
                    answer = "Near the lake"
                ),
                AnswerModel(
                    answer = "In the sewers"
                ),
                AnswerModel(
                    answer = "Near the park"
                ),
                AnswerModel(
                    answer = "In the hospital"
                )
            )
        ),
        QAModel(
            id = "i032q",
            question = "Who is Cybil?",
            answers = listOf(
                AnswerModel(
                    answer = "Police officer"
                ),
                AnswerModel(
                    answer = "Hunter"
                ),
                AnswerModel(
                    answer = "Teacher"
                ),
                AnswerModel(
                    answer = "Musician"
                )
            )
        ),
        QAModel(
            id = "p90s",
            question = "Which riddle was the most difficult?",
            answers = listOf(
                AnswerModel(
                    answer = "The hospital door riddle"
                ),
                AnswerModel(
                    answer = "The piano riddle"
                ),
                AnswerModel(
                    answer = "The boiler room riddle"
                )
            )
        ),
        QAModel(
            id = "gh902",
            question = "What year was the game released?",
            answers = listOf(
                AnswerModel(
                    answer = "1997"
                ),
                AnswerModel(
                    answer = "1998"
                ),
                AnswerModel(
                    answer = "1999"
                ),
                AnswerModel(
                    answer = "2000"
                )
            )
        ),
        QAModel(
            id = "kl223",
            question = "What was the first boss?",
            answers = listOf(
                AnswerModel(
                    answer = "The Twinfeeler"
                ),
                AnswerModel(
                    answer = "The Floatstinger"
                ),
                AnswerModel(
                    answer = "The Split Head"
                )
            )
        )
    )
}