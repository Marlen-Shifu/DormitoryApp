package com.example.dormitoryapp.kezekshilik.ui.keshigip;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KeshigipViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KeshigipViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}