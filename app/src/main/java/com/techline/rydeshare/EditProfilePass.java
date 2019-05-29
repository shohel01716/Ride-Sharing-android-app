package com.techline.rydeshare;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditProfilePass extends AppCompatActivity {
    //declare controls
    EditText eTxtFullName, eTxtEmail,eTxtPhone, eTxtPassword, eTxtFirstName, eTxtLastName;
    private Bundle extras;
    String strUser, strPass, strFullName, strEmail, strPhone, strFName,strLName,strBalance;

    TextView txtBalValue, btnContinue;
    public static final String MyPREFERENCES = "MyPrefs";

    SharedPreferences SP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile_pass);
        //assign ontrols
        eTxtFirstName = findViewById(R.id.eTxtFirstName);
        eTxtLastName = findViewById(R.id.eTxtLastName);
        eTxtEmail = findViewById(R.id.eTxtEmail);
        eTxtPassword = findViewById(R.id.eTxtPassword);
        eTxtPhone = findViewById(R.id.eTxtPhone);
        txtBalValue = findViewById(R.id.txtBalValue);
        btnContinue = findViewById(R.id.btnContinue);



        extras = getIntent().getExtras();
        if (extras != null) {
            strUser = extras.getString("strUser");
            strPass = extras.getString("strPass");
            strFullName = extras.getString("strFullName");
            strFName = extras.getString("strFName");
            strLName = extras.getString("strLName");
            strEmail = extras.getString("strEmail");
            strPhone = extras.getString("strPhone");
            strBalance = extras.getString("strBalance");


            eTxtFirstName.setText(strFName);
            eTxtLastName.setText(strLName);
            eTxtEmail.setText(strEmail);
            eTxtPhone.setText(strPhone);
            eTxtPassword.setText(strPass);
            txtBalValue.setText(strBalance);


        } else {

        }


        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(EditProfilePass.this, DashboardPass.class);
                startActivity(it);
            }
        });
    }



    private void logoutUser(){
        SP = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor editor = SP.edit();
        editor.clear().commit();
        editor.apply();
        Intent itLogout = new Intent(EditProfilePass.this, signin.class);
        startActivity(itLogout);
        finish();
    }

    @Override
    public void onBackPressed() {

    }
}
