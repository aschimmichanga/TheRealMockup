package com.mercury1089.realmockup;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int counter = 1;
    public boolean firstButtonClicked = false;
    public boolean secondButtonClicked = false;
    public boolean thirdButtonClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        // Check whether this app has write external storage permission or not.
        int writeExternalStoragePermission = ContextCompat.checkSelfPermission(ExternalStorageActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        // If do not grant write external storage permission.
        if(writeExternalStoragePermission!= PackageManager.PERMISSION_GRANTED)
        {
            // Request user to grant write external storage permission.
            ActivityCompat.requestPermissions(ExternalStorageActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE_WRITE_EXTERNAL_STORAGE_PERMISSION);
        }
        */

    }



    //displaying and incrementing a counter
    public void displayCounter(View view) {
        String counterString = counter + "";
        TextView textView = findViewById(R.id.textView);
        textView.setText(counterString);
        counter++;
    }

    //displaying user input
    public void displayString (View view) {
        EditText editText = findViewById(R.id.inputBox);
        String EditTextValue = editText.getText().toString();
        TextView textView = findViewById(R.id.displayText);
        textView.setText(EditTextValue);
    }

    //checks group button color and switches it to the other color
    public void changeButtonColor (View btn, boolean isClicked) {
        if (isClicked) {
            btn.setBackgroundColor(getResources().getColor(R.color.bootstrap_brand_success));
        }
        else {
            btn.setBackgroundColor(getResources().getColor(R.color.bootstrap_brand_info));
        }

    }

    //onClick method for each group button
    public void firstButton (View view) {
        firstButtonClicked = !firstButtonClicked;
        changeButtonColor(findViewById(R.id.firstBootstrapButton), firstButtonClicked);
    }
    public void secondButton (View view) {
        secondButtonClicked = !secondButtonClicked;
        changeButtonColor(findViewById(R.id.secondBootstrapButton), secondButtonClicked);
    }
    public void thirdButton (View view) {
        thirdButtonClicked = !thirdButtonClicked;
        changeButtonColor(findViewById(R.id.thirdBootstrapButton), thirdButtonClicked);
    }

    //onClick method for going to HighlightBox screen
    public void goToHighlightBox (View view) {
        Intent intent = new Intent (this, HighlightBox.class);
        startActivity(intent);
    }

    //onClick method for going to QRCode screen
    public void goToQRCodeGenerator (View view) {
        Intent intent = new Intent (this, QRCode.class);
        startActivity(intent);
    }
}
