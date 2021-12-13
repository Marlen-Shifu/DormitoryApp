package com.example.dormitoryapp.kezekshilik.ui.kelmegen;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KelmegenViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KelmegenViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}