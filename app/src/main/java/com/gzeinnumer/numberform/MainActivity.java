package com.gzeinnumer.numberform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

import com.gzeinnumer.nf.NumberForm;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "afsagaas";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumberForm ed = findViewById(R.id.ed_data);

        ed.requestFocus();

        ed.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d(TAG, "beforeTextChanged: "+s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d(TAG, "beforeTextChanged: "+s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d(TAG, "beforeTextChanged: "+s.toString());
            }
        });
    }
}