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
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;





public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.neepHelp).setOnClickListener(new HandleClick());
    }

    protected class HandleClick implements OnClickListener {
        public void onClick(View arg0) {
            Button btn = (Button) arg0;  //cast view to a button
            // get a reference to the TextView
            //TextView tv = (TextView) findViewById(R.id.textview1);
            // update the TextView text
            //tv.setText("You pressed " + btn.getText());
        }
    }
}