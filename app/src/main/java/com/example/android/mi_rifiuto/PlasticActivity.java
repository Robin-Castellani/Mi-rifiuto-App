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

public class PlasticActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Acquaragia e acetone", "contenitore vuoto"));
        words.add(new Word("Alcool", "contenitore vuoto"));
        words.add(new Word("Alluminio", "contenitore"));
        words.add(new Word("Ammoniaca", "contenitore vuoto"));
        words.add(new Word("Appendino", "in plastica e in metallo"));
        words.add(new Word("Barattolo", "in metallo/latta/plastica"));
        words.add(new Word("Bicchiere in plastica", "usa e getta"));
        words.add(new Word("Blister in plastica", ""));
        words.add(new Word("Blister", "plastica e alluminio"));
        words.add(new Word("Bombole del gas vuote", "da campeggio senza valvola"));
        words.add(new Word("Bombolette spray", "vuote"));
        words.add(new Word("Borsa per la spesa in plastica", ""));
        words.add(new Word("Bottiglia in plastica", ""));
        words.add(new Word("Busta in materiale accoppiato", "plastica e alluminio"));
        words.add(new Word("Busta in plastica per alimenti", "pasta, mozzarella"));
        words.add(new Word("Candeggina", "contenitore vuoto"));
        words.add(new Word("Capsula in plastica e/o alluminio per macchina del caffè", "priva di contenuto"));
        words.add(new Word("Carta stagnola", "in alluminio pulita"));
        words.add(new Word("Cassette di plastica", ""));
        words.add(new Word("Cellophane", ""));
        words.add(new Word("Colle e collanti", "contenitore vuoto"));
        words.add(new Word("Contenitore in plastica/acciaio", ""));
        words.add(new Word("Contenitori per bevande", "in cartone poliaccoppiato"));
        words.add(new Word("Cosmetici", "contenitori vuoti"));
        words.add(new Word("Detersivo", "contenitore vuoto"));
        words.add(new Word("Deodoranti per uso personale", "contenitore vuoto"));
        words.add(new Word("Fiala in plastica", ""));
        words.add(new Word("Film in plastica", "cellophane"));
        words.add(new Word("Flacone in plastica", ""));
        words.add(new Word("Imballaggi", "in plastica metallo/alluminio"));
        words.add(new Word("Imballaggi", "polistirolo"));
        words.add(new Word("Lacche", "contenitore vuoto e non pericoloso"));
        words.add(new Word("Lattine", "in alluminio banda stagnata"));
        words.add(new Word("Nylon da imballaggi", ""));
        words.add(new Word("Pellicole in plastica per alimenti", ""));
        words.add(new Word("Piatti in plastica usa e getta", ""));
        words.add(new Word("Polistirolo da imballaggi", ""));
        words.add(new Word("Reggette per legatura pacchi", ""));
        words.add(new Word("Rete per frutta e verdura", ""));
        words.add(new Word("Sacchetto per alimenti in plastica", "pasta, insalata lavata"));
        words.add(new Word("Sacchetto per alimenti in materiale accoppiato plastica e alluminio", "es. caffè, surgelati, patatine e salatini, involucri dei cioccolatini ecc"));
        words.add(new Word("Shopper in plastica", ""));
        words.add(new Word("Stagnola pulita", ""));
        words.add(new Word("Taniche in plastica per uso domestico fino a 20 litri", ""));
        words.add(new Word("Tappo", "di barattolo in metallo e a corona"));
        words.add(new Word("Tubetti di dentifricio", ""));
        words.add(new Word("Tubetti di maionese", ""));
        words.add(new Word("Vaschetta pulita", "per alimenti in plastica o alluminio/latta o in materiale accoppiato come plastica e alluminio"));
        words.add(new Word("Vasetto yogurt vuoto", ""));
        words.add(new Word("Vaso in plastica per piante da trapiantare", ""));

        // create an ArrayAdapter, useful to handle data in a RecyclerView
        // it puts every element of words into an Android standard View, the
        //  simple_list_item_1
        // the ArrayAdapter is a concrete implementation of the ListAdapter interface
        WordAdapter adapter = new WordAdapter(
                this, words, R.color.category_imballaggi
        );

        // get the id of the ListView
        ListView listView = (ListView) findViewById(R.id.word_list);

        // attach the ArrayAdapter to the ListView
        listView.setAdapter(adapter);
    }
}
