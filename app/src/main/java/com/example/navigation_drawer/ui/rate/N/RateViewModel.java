package com.example.navigation_drawer.ui.rate.N;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RateViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RateViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is rate fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}