package racing

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RacingCarTest {
    @Test
    fun `race 수행 시, 기준 값 4보다 작은 값이 입력되면 자동차의 거리 결과는 0으로 이루어진 배열이다`() {
        val tryRound = 3
        val car = RacingCar(tryRound)
        for (round in 0 until tryRound) {
            car.race(createRandom(3))
        }

        val distances = car.getDistances()

        Assertions.assertThat(distances).containsOnly(0)
    }

    @Test
    fun `race 수행 시, 기준 값 4보다 큰 값이 입력되면 자동차의 거리 결과는 1로 이루어진 배열이다`() {
        val tryRound = 3
        val car = RacingCar(tryRound)
        for (round in 0 until tryRound) {
            car.race(createRandom(4))
        }

        val distances = car.getDistances()

        Assertions.assertThat(distances).containsOnly(1)
    }

    @Test
    fun `시도한 횟수만큼 race를 수행하면 자동차의 거리 결과는 0 과 1을 포함한 배열이다`() {
        val tryRound = 5
        val car = RacingCar(tryRound)
        for (round in 0 until tryRound) {
            car.race(createRandom(round))
        }

        val distances = car.getDistances()

        Assertions.assertThat(distances).containsAnyOf(0, 1)
    }

    private fun createRandom(returnValue: Int): Int {
        return returnValue
    }
}