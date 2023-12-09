package com.edu.voquoctinh.myfoodapp.ui.dailymeal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DailyMealViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DailyMealViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Daily Meal ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}