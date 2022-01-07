package com.justnik.numbercomposition.domain.usecases

import com.justnik.numbercomposition.domain.entities.GameSettings
import com.justnik.numbercomposition.domain.entities.Level
import com.justnik.numbercomposition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}