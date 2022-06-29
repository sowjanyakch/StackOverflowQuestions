package com.example.stackoverflowjetpackcompose.model.QuestionId

data class LastEditor(
    val account_id: Int,
    val badge_counts: BadgeCounts,
    val display_name: String,
    val link: String,
    val profile_image: String,
    val reputation: Int,
    val user_id: Int,
    val user_type: String
)