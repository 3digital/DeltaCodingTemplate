package com.delta.deltacodingtemplate;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    int levelComplete;
    String[] input;
    private String message;

    public MainActivity() {
        input = new String[] {
                "A","B","C","D", };
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        levelComplete = 0;

        JavaWriting j = new JavaWriting();

        displayCompletionLevel(0 , "Good but you can do better");


    }

    private void displayCompletionLevel(int input , String message){


        String outcomeMessage = "";
        Drawable d = null;
        if(input == 0) {
            d = getResources().getDrawable(R.drawable.dpred);
            outcomeMessage = "Not Complete";
        }else if(input == 1) {
            d = getResources().getDrawable(R.drawable.dpblue);
            outcomeMessage = "Complete";
        }else if(input == 2) {
            d = getResources().getDrawable(R.drawable.dpgreen);
            outcomeMessage = "Excellent";
        }else if(input == 3){
            d = getResources().getDrawable(R.drawable.dpyellow);
            outcomeMessage = "Perfect";
        }


        ImageView logo = (ImageView) findViewById(R.id.imageView);
        logo.setImageDrawable(d);

        TextView myTextView = (TextView) findViewById(R.id.outcomeView);
        myTextView.setText(outcomeMessage);

        TextView myTextView1 = (TextView) findViewById(R.id.messageView);
        myTextView1.setText(message);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
