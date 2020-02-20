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

public class PaperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Busta corrispondenza", "con e senza finestra"));
        words.add(new Word("Carta", ""));
        words.add(new Word("Cartone", ""));
        words.add(new Word("Detersivo", "scatola in cartone"));
        words.add(new Word("Etichette in carta", ""));
        words.add(new Word("Fogli di carta o cartone", ""));
        words.add(new Word("Giornale", ""));
        words.add(new Word("Imballaggi in cartone", ""));
        words.add(new Word("Libri", ""));
        words.add(new Word("Quaderno", ""));
        words.add(new Word("Rivista", ""));
        words.add(new Word("Sacchetto di carta", "con o senza finestra"));
        words.add(new Word("Scatola per pizza", "senza resti di cibo"));
        words.add(new Word("Shopper in carta", ""));
        words.add(new Word("Tovaglioli in carta", ""));

        // create an ArrayAdapter, useful to handle data in a RecyclerView
        // it puts every element of words into an Android standard View, the
        //  simple_list_item_1
        // the ArrayAdapter is a concrete implementation of the ListAdapter interface
        WordAdapter adapter = new WordAdapter(
                this, words, R.color.category_carta
        );

        // get the id of the ListView
        ListView listView = (ListView) findViewById(R.id.word_list);

        // attach the ArrayAdapter to the ListView
        listView.setAdapter(adapter);
    }
}
