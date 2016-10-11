package com.example.saqib.sqlitedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

public class AndroidSQLiteTutorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DatabaseHandler db = new DatabaseHandler(this);

        // Inserting contacts
        Log.d("Insert: ", "Interesting ..");
        db.addContact(new Contact("Ravi","91000000"));
        db.addContact(new Contact("Srinivas","89000000"));
        db.addContact(new Contact("Savi","95000000"));
        db.addContact(new Contact("Ravinivas","89000000"));

        Log.d("Reading", "Reading all contacts...");
        List<Contact> contacts = db.getAllContacts();

        for (Contact cn: contacts){
            String log = "Id: "+cn.getID()+" ,Name: "+ cn.getName()+" ,Phone, "+cn.getPhoneNumber();

            Log.d("Name",log);
        }


    }
}
