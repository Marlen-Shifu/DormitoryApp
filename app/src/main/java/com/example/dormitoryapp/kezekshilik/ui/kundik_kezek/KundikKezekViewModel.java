package com.example.dormitoryapp.kezekshilik.ui.kundik_kezek;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KundikKezekViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KundikKezekViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}