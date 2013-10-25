package com.delta.deltacodingtemplate;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

    int levelComplete;
    final String[] input;

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

//        if(j.reverseString("abc") == "cba")
//        {
//
//        }else if(j == null){
//
//        }else{
//
//        }


        displayCompletionLevel(0);




    }




    private void displayCompletionLevel(int input){



        String outputMessage = "";
        Drawable d = null;
        if(input == 0) {
            d = getResources().getDrawable(R.drawable.dpred);
            outputMessage = "not complete";
        }else if(input == 1) {
            d = getResources().getDrawable(R.drawable.dpblue);
        }else if(input == 2) {
            d = getResources().getDrawable(R.drawable.dpyellow);
        }else if(input == 3){
            d = getResources().getDrawable(R.drawable.dpgreen);
        }


        ImageView logo = (ImageView) findViewById(R.id.imageView);
        logo.setImageDrawable(d);

        //also set a string message


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
