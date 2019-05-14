package com.techline.rydeshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DashboardDriver extends AppCompatActivity {

    //declare controls
    EditText eTxtFullName, eTxtEmail,eTxtPhone, eTxtPassword, eTxtFirstName, eTxtLastName, eTxtCity;
    private Bundle extras;
    String strUser, strPass, strFullName, strEmail, strPhone, strFName,strLName,strCity,strBalance;
TextView txtBalValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_driver);
        //assign ontrols
        eTxtFirstName = findViewById(R.id.eTxtFirstName);
        eTxtLastName = findViewById(R.id.eTxtLastName);
        eTxtEmail = findViewById(R.id.eTxtEmail);
        eTxtPassword = findViewById(R.id.eTxtPassword);
        eTxtPhone = findViewById(R.id.eTxtPhone);
        eTxtCity = findViewById(R.id.eTxtCity);
        txtBalValue = findViewById(R.id.txtBalValue);

        extras = getIntent().getExtras();
        if (extras != null) {
            strUser = extras.getString("strUser");
            strPass = extras.getString("strPass");
            strFullName = extras.getString("strFullName");
            strFName = extras.getString("strFName");
            strLName = extras.getString("strLName");
            strEmail = extras.getString("strEmail");
            strPhone = extras.getString("strPhone");
            strCity = extras.getString("strCity");
            strBalance = extras.getString("strBalance");

            eTxtFirstName.setText(strFName);
            eTxtLastName.setText(strLName);
            eTxtEmail.setText(strEmail);
            eTxtPhone.setText(strPhone);
            eTxtPassword.setText(strPass);
            eTxtCity.setText(strCity);
            txtBalValue.setText(strBalance);

        } else {

        }

        //get values on click
        //onclick listeners FORbuttons
    }
}
