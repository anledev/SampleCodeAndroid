package com.anledev.samplecodeandroid.java.widgets;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class DateDialog {
    private Calendar mCalendar = Calendar.getInstance();
    private Context mContext;

    private static DateDialog instance;

    private DateDialog(Context context) {
        this.mContext = context;
    }

    public static DateDialog getInstance(Context context) {

        synchronized (DateDialog.class) {
            if (instance == null) {
                return new DateDialog(context);
            }
        }
        return instance;
    }

    public void setupClickWithView(final TextView textView) {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(mContext,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                textView.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        },
                        mCalendar.get(Calendar.YEAR),
                        mCalendar.get(Calendar.MONTH) + 1,
                        mCalendar.get(Calendar.DATE));
                datePickerDialog.show();
            }
        });
    }
}
