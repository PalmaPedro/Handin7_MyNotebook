package com.example.handin_week7_my_notebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String messageKey = "MESSAGE_KEY";
    private String message = "";
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.etMessage);

    }

    // Button saves input text
    public void saveText(View v) {
        message = editText.getText().toString();
        Log.i("all", "saved: " + message);

        // clears text after saved to string
        editText.getText().clear();

    }

    //Button will forward to a new activity where input text is displayed
    public void showText(View v) {
        Intent intent = new Intent(this, ViewNotes.class);
        intent.putExtra(messageKey, message);
        startActivity(intent);


    }


}
