package com.justnik.numbercomposition.domain.entities

import java.io.Serializable

data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val minGameTimeInSeconds: Int
) : Serializable