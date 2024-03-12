package unityTests

sealed class State {
    object On : State()
    object Off : State()
}

class PowerSwitch {
    var state: State = State.Off


    fun trigger() {
        state = when (state) {
            is State.On -> State.Off
            is State.Off -> State.On
        }
    }
}