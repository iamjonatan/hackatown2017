package com.example.karinemellata.emquick;

/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;





public class MainActivity extends Activity {
    private static Button button_ineed; 
    private static Button button_someone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonINeed();
        OnClickButtonSomeone();

    }

    public void OnClickButtonINeed(){
        button_ineed = (Button)findViewById(R.id.needHelp); //the button button_sub is the needHelp button
        button_ineed.setOnClickListener( //what happens when you click on this button !
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   // double latitude = 0.0;
                    //double longitude = 0.0;

                    Intent intent_ineed = new Intent("com.example.karinemellata.emquick.SecondActivity");
                    startActivity(intent_ineed);

                    //TextView t1 = (TextView)findViewById(R.id.coordinate);
                    //t1.setText(Double.toString(latitude));


                }
            }


            );

    }

     public void OnClickButtonSomeone(){
        button_someone = (Button)findViewById(R.id.someone_need);
        button_someone.setOnClickListener(
            new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent intent_someone = new Intent("com.example.karinemellata.emquick.ScanId");
                    startActivity(intent_someone);

                }
            }
        
        );



    }

    

/*
    protected class HandleClick implements OnClickListener {
        public void onClick(View arg0) {
            Button btn = (Button) arg0;  //cast view to a button
            // get a reference to the TextView
            //TextView tv = (TextView) findViewById(R.id.textview1);
            // update the TextView text
            //tv.setText("You pressed " + btn.getText());
        }
    }

    */


    public void onButtonClick(View v){


    }

}