package com.example.dormitoryapp.documentation.ui.nus;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NusViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NusViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}