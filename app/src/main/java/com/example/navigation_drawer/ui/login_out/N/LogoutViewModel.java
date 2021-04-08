package com.example.navigation_drawer.ui.login_out.N;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LogoutViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LogoutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is loginout fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}