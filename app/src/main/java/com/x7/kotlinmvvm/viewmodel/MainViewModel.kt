package com.x7.kotlinmvvm.viewmodel

import androidx.lifecycle.ViewModel
import com.x7.kotlinmvvm.model.MainRepository
import com.x7.kotlinmvvm.view.MainActivity

class MainViewModel constructor(
    val mainRepository: MainRepository,
    val mainActivity: MainActivity
): ViewModel() {


    fun change(){
        mainActivity.updateui(mainRepository.name)
    }
}