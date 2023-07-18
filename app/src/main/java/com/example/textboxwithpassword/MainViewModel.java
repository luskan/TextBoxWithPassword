package com.example.textboxwithpassword;

import android.content.Context;
import android.widget.Toast;

import androidx.databinding.ObservableField;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public ObservableField<String> password = new ObservableField<>();

    public void onSubmitPasswordClick(Context context) {
        String enteredPassword = password.get();
        Toast.makeText(context, "Entered password: " + enteredPassword, Toast.LENGTH_SHORT).show();
    }
}
