package com.example.planningpoker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Button btn_register, btn_login;
    EditText et_loginName, et_password;
    String name, password;
    DatabaseReference databaseUsers;
    FirebaseAuth mFirebaseAuth;
    FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_register = findViewById(R.id.button_register);
        btn_login = findViewById(R.id.button_login);
        et_loginName = findViewById(R.id.editText_loginName);
        et_password = findViewById(R.id.editText_password);
        databaseUsers = FirebaseDatabase.getInstance().getReference("users");

        /*User u = new User();
        if(databaseUsers.child("userName").equals(name))
        {

        }*/

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        name = et_loginName.getText().toString().trim();
        password = et_password.getText().toString().trim();
        

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;


            }
        });
    }

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference("registration");


}
