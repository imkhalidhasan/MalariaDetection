package com.malariadetection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import javax.annotation.Nullable;

public class MainActivity extends AppCompatActivity {
    TextView fullName,email,phone;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();//logout
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }
}