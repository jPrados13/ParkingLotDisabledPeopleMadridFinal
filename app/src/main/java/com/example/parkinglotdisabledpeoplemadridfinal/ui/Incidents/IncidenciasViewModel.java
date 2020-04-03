package com.example.parkinglotdisabledpeoplemadridfinal.ui.Incidents;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IncidenciasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IncidenciasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}