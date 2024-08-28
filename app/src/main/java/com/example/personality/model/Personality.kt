package com.example.personality.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Personality(
    @StringRes val stringResourceId:Int,
    @DrawableRes val imageResourceId:Int,
    @StringRes val descriptionResourceId:Int
)
