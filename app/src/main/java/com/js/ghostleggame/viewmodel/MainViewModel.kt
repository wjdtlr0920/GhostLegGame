package com.js.ghostleggame.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.js.ghostleggame.data.dto.User

enum class ActionType {
    PLUS, MINUS
}

class MainViewModel : ViewModel() {

    companion object {
        const val TAG: String = "로그"
    }

    private val _currentValue = MutableLiveData<Int>()

    private val currentValue : LiveData<Int>
        get() = _currentValue

    init {
        Log.d(TAG, "MyNumberViewModel - 생성자 호출")
        _currentValue.value = 0
    }

    fun updateValue(actionType: ActionType, input: Int){
        when(actionType){
            ActionType.PLUS ->
                _currentValue.value = _currentValue.value?.plus(input)
            ActionType.MINUS ->
                _currentValue.value = _currentValue.value?.minus(input)
        }
    }
}