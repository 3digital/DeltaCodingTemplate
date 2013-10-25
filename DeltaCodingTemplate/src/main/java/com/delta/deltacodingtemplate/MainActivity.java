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

        ImageView logo = (ImageView) findViewById(R.id.imageView);
//        logo.setImageResource(R.drawable.dpgreen);
//        logo.setImageResource(R.drawable.dpblue);
//        logo.setImageResource(R.drawable.dpred);
//        logo.setImageResource(R.drawable.dpyellow);









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


        displayCompletionLevel(1);




    }




    private int displayCompletionLevel(int input){

        if(input == 0) {
            Drawable d = getResources().getDrawable(R.drawable.dpred);
        }else if(input == 1) {
            Drawable d = getResources().getDrawable(R.drawable.dpblue);
        }else if(input == 2) {
            Drawable d = getResources().getDrawable(R.drawable.dpyellow);
        }else if(input == 3){
            Drawable d = getResources().getDrawable(R.drawable.dpgreen);
        }

        return levelComplete;




        //if the level is 0 , display a red logo
        //if the level is 1, display a green logo
        //if the level is 2, display blue logo
        //if the level is 3, display yellow logo


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
