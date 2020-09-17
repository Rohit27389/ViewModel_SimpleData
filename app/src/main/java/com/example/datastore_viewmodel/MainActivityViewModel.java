package com.example.datastore_viewmodel;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    int count=0;
    public int updateScore(){
        count++;
        return count;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        System.out.println(">>>>>>>>>>>onCleared");
    }
}
