package racingcar.domain.condition

import racingcar.util.RandomNumberGenerator

class RandomMoveCondition : MoveCondition {
    override fun isAvailable(): Boolean {
        val randomNumber = RandomNumberGenerator.generate(MIN_NUMBER..MAX_NUMBER)
        return randomNumber >= THRESHOLD_NUMBER
    }

    companion object {
        private const val MIN_NUMBER = 0
        private const val MAX_NUMBER = 9
        private const val THRESHOLD_NUMBER = 4
    }
}