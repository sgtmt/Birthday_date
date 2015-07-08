package com.kurono.sxil.datepicker;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {


    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

//        return new DatePickerDialog(getActivity(),this,year,month,day);
        return new DatePickerDialog(getActivity(),(MainActivity)getActivity(),year,month,day);
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {
        String text = String.format("%d-%d-%d",year,month+1,day);

        Toast.makeText(getActivity(),text, Toast.LENGTH_LONG).show();
    }
}
