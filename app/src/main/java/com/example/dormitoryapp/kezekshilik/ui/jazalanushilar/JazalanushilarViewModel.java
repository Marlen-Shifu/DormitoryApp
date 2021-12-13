package com.example.dormitoryapp.kezekshilik.ui.jazalanushilar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JazalanushilarViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public JazalanushilarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}