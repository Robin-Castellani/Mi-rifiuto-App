/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.example.android.mi_rifiuto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Get the view from its id, specified in the activity_main.xml file
        TextView biodegradable = findViewById(R.id.biodegradable);
        // Get the view from its id, specified in the activity_main.xml file
        TextView indifferentiated = findViewById(R.id.indifferentiated);
        // Get the view from its id, specified in the activity_main.xml file
        TextView paper = findViewById(R.id.paper);
        // Get the view from its id, specified in the activity_main.xml file
        TextView plastic = findViewById(R.id.plastic);
        // Get the view from its id, specified in the activity_main.xml file
        TextView crm = findViewById(R.id.crm);
        // Get the view from its id, specified in the activity_main.xml file
        TextView glass = findViewById(R.id.glass);
        // Get the view from its id, specified in the activity_main.xml file
        TextView pharmacy = findViewById(R.id.pharmacy);
        // Get the view from its id, specified in the activity_main.xml file
        TextView thanks = findViewById(R.id.thanks);

        // Set behaviour when a single tap event is intercepted
        // The behaviour is changing activity from the actual one to the TextView's one
        biodegradable.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to link the MainActivity with the PaperActivity
                Intent biodegradableIntent = new Intent(MainActivity.this, BiodegradableActivity.class);
                // Start the instantiated activity
                startActivity(biodegradableIntent);
            }
        });


        indifferentiated.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent indifferentiatedIntent = new Intent(MainActivity.this, IndifferentiatedActivity.class);
                startActivity(indifferentiatedIntent);
            }
        });


        paper.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paperIntent = new Intent(MainActivity.this, PaperActivity.class);
                startActivity(paperIntent);
            }
        });


        plastic.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent plasticIntent = new Intent(MainActivity.this, PlasticActivity.class);
                startActivity(plasticIntent);
            }
        });


        crm.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent crmIntent = new Intent(MainActivity.this, CRMActivity.class);
                startActivity(crmIntent);
            }
        });


        glass.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent glassIntent = new Intent(MainActivity.this, GlassActivity.class);
                startActivity(glassIntent);
            }
        });


        pharmacy.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pharmacyIntent = new Intent(MainActivity.this, PharmacyActivity.class);
                startActivity(pharmacyIntent);
            }
        });


        thanks.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thanksIntent = new Intent(MainActivity.this, ThanksActivity.class);
                startActivity(thanksIntent);
            }
        });
    }
}
