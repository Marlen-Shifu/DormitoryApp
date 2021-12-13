package com.example.dormitoryapp.kezekshilik.ui.apta_koritindi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AptaKoritindiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AptaKoritindiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}