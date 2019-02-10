package com.mercury1089.realmockup;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HighlightBox extends AppCompatActivity {
    public boolean isBlue = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highlight_box);
    }
    //checking the rectangle's color and switching it to the other color
    public void setRectangleColor (View v) {
        if (isBlue) {
            v.setBackgroundResource(R.drawable.default_rectangle);
            isBlue = false;
        }
        else {
            v.setBackgroundResource(R.drawable.clicked_rectangle);
            isBlue = true;
        }
    }

    //onClick methods for each rectangles
    public void rectangle0_0 (View view) { setRectangleColor(findViewById(R.id.rectangle0_0)); }
    public void rectangle0_1 (View view) { setRectangleColor(findViewById(R.id.rectangle0_1)); }
    public void rectangle0_2 (View view) { setRectangleColor(findViewById(R.id.rectangle0_2)); }
    public void rectangle1_0 (View view) { setRectangleColor(findViewById(R.id.rectangle1_0)); }
    public void rectangle1_1 (View view) { setRectangleColor(findViewById(R.id.rectangle1_1)); }
    public void rectangle1_2 (View view) { setRectangleColor(findViewById(R.id.rectangle1_2)); }

    //onClick method for go back button
    public void goToHomeScreen (View view) { NavUtils.navigateUpFromSameTask(this); }
}
