package com.example.itunes

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


class HomeViewModel(application: Application): AndroidViewModel(application){

    private var homeRepository:HomeRepository?=null
    var postModelListLiveData : LiveData<List<PostModel>>?=null


    init {
        homeRepository = HomeRepository()
        postModelListLiveData = MutableLiveData()

    }

    fun fetchAllPosts(){
        postModelListLiveData = homeRepository?.fetchAllPosts()
    }



}
