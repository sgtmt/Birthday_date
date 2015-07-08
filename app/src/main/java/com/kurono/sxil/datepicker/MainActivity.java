package com.kurono.sxil.datepicker;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends FragmentActivity implements DatePickerDialog.OnDateSetListener {
    TextView seinen;
    TextView kekka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seinen = (TextView) findViewById(R.id.textView);
        kekka = (TextView) findViewById(R.id.kekka);
    }
    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        seinen.setText(" " + year + "/" + (monthOfYear + 1) + "/" + dayOfMonth);
        kekka.setText("小学校入学"+(year+7)+"年４月\n"+"小学校卒業"+(year+13)+"年３月\n"
        +"中学校入学"+(year+13)+"年４月\n"+"中学校卒業"+(year+16)+"年３月\n"
        +"高等学校入学"+(year+16)+"年４月\n"+"高等学校卒業"+(year+19)+"年３月\n"
        +"専門学校・短期大学入学"+(year+19)+"年４月\n"+"専門学校・短期大学卒業"+(year+21)+"年３月\n"
        +"大学入学"+(year+19)+"年４月\n"+"大学卒業"+(year+23)+"年３月");
    }
    public void showDatePickerDialog(View v) {
   DialogFragment newFragment = new BlankFragment();
        newFragment.show(getFragmentManager(), "datePicker");

    }


}
