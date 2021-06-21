package abstaction


class WashingMachine {
    fun wash() { //hiding all methods and validation in wash method
        setTimer()
        takeWater()
        soak()
        washClothes()
        dryClothes()
        // if timer becomes zero
        ringAlarm()
    }

    private fun setTimer() {
        println("start timer")
    }

    private fun takeWater() {
        println("take water")
    }

    private fun soak() {
        println("soak clothes for 15 minutes")
    }

    private fun washClothes() {
        println("wash clothes")
    }

    private fun dryClothes() {
        println("dry clothes")
    }

    private fun ringAlarm() {
        println("ring alarm")
    }
}