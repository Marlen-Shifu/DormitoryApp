package com.example.dormitoryapp.documentation.ui.habar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HabarViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HabarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}