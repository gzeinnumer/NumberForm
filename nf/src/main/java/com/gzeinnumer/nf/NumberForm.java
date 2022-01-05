package com.gzeinnumer.nf;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class NumberForm extends androidx.appcompat.widget.AppCompatEditText implements TextWatcher {
    public NumberForm(@NonNull Context context) {
        super(context);
        initView(this);
    }

    public NumberForm(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(this);
    }

    boolean first = true;

    private void initView(NumberForm ed) {
        ed.setOnFocusChangeListener((view, hasFocus) -> {
            if (!first) {
                if (ed.getText().toString().length() == 0) {
                    ed.setText("0");
                    ed.setSelection(ed.getText().toString().length());
                }
            } else {
                first = false;
            }
        });

        ed.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                NumberForm.this.beforeTextChanged(s, start, count, after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                NumberForm.this.onTextChanged(s, start, before, count);
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 1 && s.toString().charAt(0) == '0') {
                    final String newText = s.toString().substring(1);
                    ed.setText(newText);
                    ed.setSelection(newText.length());
                } else if (s.toString().length() > 0) {
                    NumberForm.this.afterTextChanged(s);
                } else {
                    NumberForm.this.afterTextChanged(s);
                }
            }
        });
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}

