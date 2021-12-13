package com.example.dormitoryapp.kezekshilik.ui.juma_kezek;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JumaKezekViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public JumaKezekViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}