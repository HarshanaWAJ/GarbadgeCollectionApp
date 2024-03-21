package com.example.garbadgecollectionapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Calendar;

public class Register extends AppCompatActivity {
//    private int dbRef;
//    private EditText fName, lName, coutry, email, password, passwordConfirm;
//    private Calendar FirebaseDatabase;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.signup_layout);
//        getSupportActionBar().hide();
//
//        fName = findViewById(R.id.name);
//        lName = findViewById(R.id.address);
//        coutry = findViewById(R.id.phoneNumber);
//        email = findViewById(R.id.register_email);
//        password = findViewById(R.id.register_password);
//        passwordConfirm = findViewById(R.id.register_confirmPassword);
//
//        dbRef = FirebaseDatabase.getInstance().get("Users");
//
//        Button signUpButton = findViewById(R.id.btn_signup);
//        signUpButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (name.getText().toString().isEmpty() || lName.getText().toString().isEmpty() || coutry.getText().toString().isEmpty() ||
//                        email.getText().toString().isEmpty() || password.getText().toString().isEmpty() || passwordConfirm.getText().toString().isEmpty()) {
//                    Toast.makeText(RegisterActivity.this, "All fields required", Toast.LENGTH_LONG).show();
//                } else {
//                    if (!password.getText().toString().equals(passwordConfirm.getText().toString())) {
//                        password.setError("Passwords Not Matching");
//                        passwordConfirm.setError("Passwords Not Matching");
//                        Toast.makeText(RegisterActivity.this, "Passwords not matching", Toast.LENGTH_LONG).show();
//                    } else {
//                        saveUser();
//                    }
//                }
//            }
//        });
//    }
//
//    private void saveUser() {
//        String uFName = fName.getText().toString();
//        String uLName = lName.getText().toString();
//        String uCountry = coutry.getText().toString();
//        String uEmail = email.getText().toString();
//        String uPassword = password.getText().toString();
//
//        String userId = dbRef.push().getKey();
//
//        UserModel user = new UserModel(userId, uFName, uLName, uCountry, uEmail, uPassword);
//
//        dbRef.child(userId).setValue(user).addOnCompleteListener(task -> {
//            Toast.makeText(RegisterActivity.this, "User Registered Successfully", Toast.LENGTH_LONG).show();
//            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
//            intent.putExtra("userId", userId);
//            startActivity(intent);
//        }).addOnFailureListener(e -> Toast.makeText(RegisterActivity.this, "Error " + e.getMessage(), Toast.LENGTH_LONG).show());
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_register);
//
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//
//
//        });
//    }
}