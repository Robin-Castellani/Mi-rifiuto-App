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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BiodegradableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Carbone", "da legna"));
        words.add(new Word("Carne", ""));
        words.add(new Word("Carta assorbente", ""));
        words.add(new Word("Cenere", "di legna purché spenta"));
        words.add(new Word("Cibi cotti e crudi", ""));
        words.add(new Word("Fazzoletto di carta", "bianco e colorato, sporco o pulito"));
        words.add(new Word("Fiammiferi", ""));
        words.add(new Word("Filtri da tè e caffè", "mustard yellow"));
        words.add(new Word("Fiori secchi e/o recisi", ""));
        words.add(new Word("Fondi di caffè", ""));
        words.add(new Word("Frutta", ""));
        words.add(new Word("Gusci di frutta secca e uova", ""));
        words.add(new Word("Gusci di molluschi e crostacei", ""));
        words.add(new Word("Lische di pesce", ""));
        words.add(new Word("Ossi", "avanzi di cibo"));
        words.add(new Word("Paglia", ""));
        words.add(new Word("Pane", ""));
        words.add(new Word("Pesce", ""));
        words.add(new Word("Piante", ""));
        words.add(new Word("Piatti biodegradabili in mater bi", ""));
        words.add(new Word("Scarti di cucina", ""));
        words.add(new Word("Stuzzicadenti", ""));
        words.add(new Word("Sughero vero", ""));
        words.add(new Word("Tappo", "in sughero vero"));
        words.add(new Word("Terriccio per piante", ""));
        words.add(new Word("Tovagliolo in carta", ""));
        words.add(new Word("Uova", ""));
        words.add(new Word("Vaschetta in mater bi", ""));
        words.add(new Word("Verdura", ""));

        // create an ArrayAdapter, useful to handle data in a RecyclerView
        // it puts every element of words into an Android standard View, the
        //  simple_list_item_1
        // the ArrayAdapter is a concrete implementation of the ListAdapter interface
        WordAdapter adapter = new WordAdapter(
                this, words, R.color.category_umido
        );

        // get the id of the ListView
        ListView listView = (ListView) findViewById(R.id.word_list);

        // attach the ArrayAdapter to the ListView
        listView.setAdapter(adapter);
    }
}
