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

public class CRMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Abbigliamento", ""));
        words.add(new Word("Acetone - acquaragia", ""));
        words.add(new Word("Acidi", ""));
        words.add(new Word("Albero di Natale naturale", ""));
        words.add(new Word("Albero di Natale in materiale sintetico", "se grande"));
        words.add(new Word("Antiparassitari", ""));
        words.add(new Word("Antitarme", ""));
        words.add(new Word("Apparecchiature elettriche ed elettroniche", ""));
        words.add(new Word("Armadio", ""));
        words.add(new Word("Asciugacapelli", ""));
        words.add(new Word("Aspirapolvere", ""));
        words.add(new Word("Asse da stiro", ""));
        words.add(new Word("Appendino", "in legno, se grandi quantità"));
        words.add(new Word("Attaccapanni", "in ferro, in legno e in plastica"));
        words.add(new Word("Batteria d'automobile", ""));
        words.add(new Word("Batterie esauste", ""));
        words.add(new Word("Biancheria intima", ""));
        words.add(new Word("Bicicletta", ""));
        words.add(new Word("Bombolette spray", "non vuote"));
        words.add(new Word("Borsa da viaggio in cuoio", ""));
        words.add(new Word("Box per bambini", ""));
        words.add(new Word("Calcinacci", "in modesta quantità"));
        words.add(new Word("Calze e calzini", ""));
        words.add(new Word("Candeggina", ""));
        words.add(new Word("Canna da pesca", ""));
        words.add(new Word("Canovacci", ""));
        words.add(new Word("Cappello", ""));
        words.add(new Word("Carrozzine", ""));
        words.add(new Word("Cartucce esauste/toner", ""));
        words.add(new Word("Cassette di legno", ""));
        words.add(new Word("Cassette di plastica", "se grandi"));
        words.add(new Word("Cellulare", ""));
        words.add(new Word("Ceramica", "se grandi dimensioni"));
        words.add(new Word("Cintura", "in plastica, stoffa o cuoio"));
        words.add(new Word("Colle e collanti", ""));
        words.add(new Word("Computer", ""));
        words.add(new Word("Contenitore in plastica/acciaio", "se grandi"));
        words.add(new Word("Copertone per automobile, bicicletta e motorino", ""));
        words.add(new Word("Cornice grande", "in plastica, metallo o legno verniciato"));
        words.add(new Word("Damigiana", ""));
        words.add(new Word("Disinfettante", ""));
        words.add(new Word("Divano", ""));
        words.add(new Word("Elettrodomestici", ""));
        words.add(new Word("Erba", ""));
        words.add(new Word("Farmaci", ""));
        words.add(new Word("Ferro", "oggetti"));
        words.add(new Word("Ferro da stiro", ""));
        words.add(new Word("Fili elettrici", "se grandi quantità"));
        words.add(new Word("Fitofarmaci", ""));
        words.add(new Word("Frigorifero", ""));
        words.add(new Word("Giocattolo in plastica", "grandi dimensioni o elettronico"));
        words.add(new Word("Guanti in pelle o lana", ""));
        words.add(new Word("Imballaggi in cartone", "se grandi"));
        words.add(new Word("Lacche", "contenitore non vuoto e pericoloso"));
        words.add(new Word("Lampadario", ""));
        words.add(new Word("Lampadina a fluorescenza/LED", "a basso consumo, neon"));
        words.add(new Word("Lastra di vetro", "se grande"));
        words.add(new Word("Lavastoviglie/lavatrice", ""));
        words.add(new Word("Lenzuola", ""));
        words.add(new Word("Lumini elettrici", ""));
        words.add(new Word("Materasso", ""));
        words.add(new Word("Mattoni/mattonelle di ceramica", "in modesta quantità"));
        words.add(new Word("Medicine scadute", ""));
        words.add(new Word("Mobili in legno", ""));
        words.add(new Word("Monitor del computer", ""));
        words.add(new Word("Neon", ""));
        words.add(new Word("Olio alimentare usato", ""));
        words.add(new Word("Olio per le automobili", ""));
        words.add(new Word("Ombrello/ombrellone", ""));
        words.add(new Word("Pentola", ""));
        words.add(new Word("Piante", "se grandi quantità"));
        words.add(new Word("Piastrelle", "in modesta quantità"));
        words.add(new Word("Piatti in ceramica", "se grandi quantità, più di 12 pezzi"));
        words.add(new Word("Pile", ""));
        words.add(new Word("Pneumatici", ""));
        words.add(new Word("Poltrona", ""));
        words.add(new Word("Posate in acciaio", "se grandi quantità"));
        words.add(new Word("Radio", ""));
        words.add(new Word("Ramaglie", ""));
        words.add(new Word("Rete per letto", ""));
        words.add(new Word("Sanitari", ""));
        words.add(new Word("Scaffale in ferro o legno", ""));
        words.add(new Word("Scale", ""));
        words.add(new Word("Scarpe in buono stato", ""));
        words.add(new Word("Scatole in cartone", ""));
        words.add(new Word("Sci", ""));
        words.add(new Word("Scopa", ""));
        words.add(new Word("Secchiello in plastica", ""));
        words.add(new Word("Sedia", ""));
        words.add(new Word("Segatura", "se grandi quantità"));
        words.add(new Word("Solventi", ""));
        words.add(new Word("Specchio", ""));
        words.add(new Word("Stendino per biancheria", ""));
        words.add(new Word("Strumenti musicali", "se grandi"));
        words.add(new Word("Sveglia", "se elettrica"));
        words.add(new Word("Taniche in plastica per uso domestico fino a 20 litri", ""));
        words.add(new Word("Tappeti", ""));
        words.add(new Word("Tastiera del computer", ""));
        words.add(new Word("Telecomando", ""));
        words.add(new Word("Telefono/telefonino", ""));
        words.add(new Word("Televisore", ""));
        words.add(new Word("Telo in nylon", "se grande"));
        words.add(new Word("Tende", ""));
        words.add(new Word("Tessili casalinghi", "tende, tovaglie, tappeti"));
        words.add(new Word("Trielina", ""));
        words.add(new Word("Tubetti di colore", "se pieni"));
        words.add(new Word("Tubo al neon", ""));
        words.add(new Word("Tubo in ferro", ""));
        words.add(new Word("Tubo in gomma", ""));
        words.add(new Word("Tubo in pvc", ""));
        words.add(new Word("Valigia", "se grande"));
        words.add(new Word("Vaso in plastica", "se grande"));
        words.add(new Word("Vaso in terracotta, vetro o ceramica", "se grande"));
        words.add(new Word("Zaino", ""));
        words.add(new Word("Zoccoli", ""));

        // create an ArrayAdapter, useful to handle data in a RecyclerView
        // it puts every element of words into an Android standard View, the
        //  simple_list_item_1
        // the ArrayAdapter is a concrete implementation of the ListAdapter interface
        WordAdapter adapter = new WordAdapter(
                this, words, R.color.category_crm
        );

        // get the id of the ListView
        ListView listView = (ListView) findViewById(R.id.word_list);

        // attach the ArrayAdapter to the ListView
        listView.setAdapter(adapter);
    }
}
