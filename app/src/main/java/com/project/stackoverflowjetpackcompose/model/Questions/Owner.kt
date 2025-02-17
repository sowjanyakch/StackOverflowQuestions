package com.project.stackoverflowjetpackcompose.model.Questions

data class Owner(
    val accept_rate: Int,
    val account_id: Int,
    val badge_counts: BadgeCounts,
    val display_name: String,
    val link: String,
    val profile_image: String,
    val reputation: Int,
    val user_id: Int,
    val user_type: String
)