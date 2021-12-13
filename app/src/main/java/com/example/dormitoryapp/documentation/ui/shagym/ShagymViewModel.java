package com.example.dormitoryapp.documentation.ui.shagym;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShagymViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShagymViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}