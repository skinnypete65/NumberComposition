package com.justnik.numbercomposition.domain.repository

import com.justnik.numbercomposition.domain.entities.GameSettings
import com.justnik.numbercomposition.domain.entities.Level
import com.justnik.numbercomposition.domain.entities.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}