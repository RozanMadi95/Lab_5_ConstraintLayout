package com.example.constraintlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // التطبيق يدعم العربية والانجليزية
        //تعريف obj  من كل عنصر سوف يستخدم برمجيا باستخدتم id

        // Lookup EditText reference
        EditText Fllname = (EditText) findViewById(R.id.et_fllname);
        TextView reg_done =(TextView)  findViewById(R.id.done);
        // Lookup Button reference
        Button btnreg = (Button) findViewById(R.id.btn_reg);


        //اضافة خاصة عند الضغط ونقر على الزر شو يعمل

        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = Fllname.getText().toString() ;
                String done = reg_done.getText().toString() ;

                // here we handle the event

                Toast.makeText(MainActivity.this, done + " " +name +" ✔💯",Toast.LENGTH_LONG).show();
            }
        });


    }
}