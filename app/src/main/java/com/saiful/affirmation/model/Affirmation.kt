package com.saiful.affirmation.model

import androidx.annotation.DrawableRes

data class Affirmation(
    val displayName: String,
    val displayId: String,
    @DrawableRes val imageResourceId: Int,
    val displayBloodGroup: String
)
