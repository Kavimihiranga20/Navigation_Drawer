package com.example.navigation_drawer.ui.policy.N;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PolicyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PolicyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Privacy Policy");
    }

    public LiveData<String> getText() {
        return mText;
    }
}