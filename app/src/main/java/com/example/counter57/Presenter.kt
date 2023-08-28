package com.example.counter57

import android.graphics.Color
import com.example.counter57.model.CounterModel
import com.example.counter57.view.CounterView

class Presenter (var counterView: CounterView){

    var model = CounterModel()
    lateinit var view: CounterView

    fun increment(){
        model.increment()
        counterView.showCount(model.number)
        if(model.number == 10){
            counterView.showToast()
        }
        if(model.number == -15 || model.number == 15){
            counterView.changeCountColor(Color.GREEN)
        }else{
            counterView.changeCountColor(Color.BLACK)
        }

    }

    fun decrement(){
        model.decrement()
        counterView.showCount(model.number)
        if(model.number == -10){
            counterView.showToast()
        }
        if(model.number == -15 || model.number == 15){
            counterView.changeCountColor(Color.GREEN)
        }else{
            counterView.changeCountColor(Color.BLACK)
        }
    }
}