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

public class IndifferentiatedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Accendino", ""));
        words.add(new Word("Addobbi natalizi", ""));
        words.add(new Word("Albero di Natale in materiale sintetico", ""));
        words.add(new Word("Assorbenti", ""));
        words.add(new Word("Astuccio", ""));
        words.add(new Word("Appendino", "in legno"));
        words.add(new Word("Batuffolo di cotone", ""));
        words.add(new Word("Bicchiere in vetro", ""));
        words.add(new Word("Bigiotteria", ""));
        words.add(new Word("Biglia in vetro", ""));
        words.add(new Word("Bottoni", ""));
        words.add(new Word("Busta in materiale accoppiato", "carta e alluminio (salvo diversa indicazione sulla confezione)"));
        words.add(new Word("Busta in materiale accoppiato", "carta e plastica"));
        words.add(new Word("Candele di cera", ""));
        words.add(new Word("Capelli", ""));
        words.add(new Word("Capsula in plastica e/o alluminio per macchina del caffè", "piena"));
        words.add(new Word("Carbone", "da altre fonti"));
        words.add(new Word("Carta carbone", ""));
        words.add(new Word("Carta cerata", ""));
        words.add(new Word("Carta per affettati o formaggi", ""));
        words.add(new Word("Carta plastificata o carta accoppiata con alluminio", ""));
        words.add(new Word("Carta unta, sporca di colla o altre sostanze (chimiche)", ""));
        words.add(new Word("Carta vetrata", ""));
        words.add(new Word("Cartongesso", ""));
        words.add(new Word("Cassette audio e video", ""));
        words.add(new Word("CD ROM/DVD", ""));
        words.add(new Word("Cera", ""));
        words.add(new Word("Cerotti", ""));
        words.add(new Word("Chiodi", ""));
        words.add(new Word("Cosmetici", "contenitori pieni"));
        words.add(new Word("Cotone usato", ""));
        words.add(new Word("Cotton fioc", ""));
        words.add(new Word("Crema per viso", "corpo o abbronzanti"));
        words.add(new Word("Cuscino", ""));
        words.add(new Word("Custodie CD musicassette/VHS", ""));
        words.add(new Word("Dischetti per computer/DVD", ""));
        words.add(new Word("Dischi in vinile", ""));
        words.add(new Word("Elastici", ""));
        words.add(new Word("Escrementi di animali domestici", ""));
        words.add(new Word("Etichette adesive e di indumenti", ""));
        words.add(new Word("Evidenziatore", ""));
        words.add(new Word("Feltrini", ""));
        words.add(new Word("Fili elettrici", ""));
        words.add(new Word("Filo interdentale", ""));
        words.add(new Word("Fiori finti", ""));
        words.add(new Word("Floppy disk", ""));
        words.add(new Word("Forbici", ""));
        words.add(new Word("Fotografia", ""));
        words.add(new Word("Gancio per chiudere i sacchetti", ""));
        words.add(new Word("Garze/bende", ""));
        words.add(new Word("Giocattolo", ""));
        words.add(new Word("Gomma da cancellare", ""));
        words.add(new Word("Gomma da masticare", ""));
        words.add(new Word("Gommapiuma", ""));
        words.add(new Word("Grattugia", ""));
        words.add(new Word("Guanti in gomma", ""));
        words.add(new Word("Guarnizioni", ""));
        words.add(new Word("Juta", ""));
        words.add(new Word("Lacci per scarpe", ""));
        words.add(new Word("Lametta usa e getta", ""));
        words.add(new Word("Lampadina a incandescenza", ""));
        words.add(new Word("Lana di roccia", ""));
        words.add(new Word("Lastra di vetro", ""));
        words.add(new Word("Lenti di ingrandimento", ""));
        words.add(new Word("Lenti di occhiali", ""));
        words.add(new Word("Lettiera naturale per animali", ""));
        words.add(new Word("Lettiera sintetica per animali", ""));
        words.add(new Word("Lucidascarpe", ""));
        words.add(new Word("Lumini con candela", ""));
        words.add(new Word("Matita", ""));
        words.add(new Word("Mollette", ""));
        words.add(new Word("Mozziconi di sigaretta", ""));
        words.add(new Word("Musicassette", ""));
        words.add(new Word("Nastro per regali", ""));
        words.add(new Word("Nastro adesivo", ""));
        words.add(new Word("Negativi fotografici", ""));
        words.add(new Word("Occhiali", ""));
        words.add(new Word("Ombrello/ombrellone", ""));
        words.add(new Word("Ovatta", ""));
        words.add(new Word("Palettine del caffè", ""));
        words.add(new Word("Pallone da gioco", ""));
        words.add(new Word("Pannolini", ""));
        words.add(new Word("Peluche", ""));
        words.add(new Word("Penna/pennarello", ""));
        words.add(new Word("Pennello", ""));
        words.add(new Word("Pettini in legno e/o plastica", ""));
        words.add(new Word("Piatti in ceramica", ""));
        words.add(new Word("Porcellana", ""));
        words.add(new Word("Posate in plastica", ""));
        words.add(new Word("Preservativi", ""));
        words.add(new Word("Quadro", ""));
        words.add(new Word("Rafia", ""));
        words.add(new Word("Rasoi usa e getta", ""));
        words.add(new Word("Rullino fotografico", ""));
        words.add(new Word("Sacchetto per alimenti in materiale accoppiato carta-alluminio", "es. sacchetto biscotti (salvo diversa indicazione sulla confezione)"));
        words.add(new Word("Sacchetto per aspirapolvere e polvere raccolta", ""));
        words.add(new Word("Sapone", ""));
        words.add(new Word("Scarpe rotte o spaiate", ""));
        words.add(new Word("Scatola per pizza", "con resti di cibo"));
        words.add(new Word("Scontrino in carta chimica", ""));
        words.add(new Word("Scopa", ""));
        words.add(new Word("Segatura", ""));
        words.add(new Word("Sigarette", ""));
        words.add(new Word("Spazzole - spazzolini", ""));
        words.add(new Word("Spugna", ""));
        words.add(new Word("Stoffa - stracci", ""));
        words.add(new Word("Strumenti musicali", ""));
        words.add(new Word("Sughero finto o trattato", ""));
        words.add(new Word("Sveglia", ""));
        words.add(new Word("Tagliere", "in legno e/o plastica"));
        words.add(new Word("Tappetini auto", ""));
        words.add(new Word("Tappo", "in sughero finto o trattato"));
        words.add(new Word("Tazzina in ceramica", ""));
        words.add(new Word("Telo in nylon", ""));
        words.add(new Word("Tovaglia plastificata usa e getta", ""));
        words.add(new Word("Trucchi", ""));
        words.add(new Word("Tubetti di colore", ""));
        words.add(new Word("Tubo in gomma", ""));
        words.add(new Word("Valigia", ""));
        words.add(new Word("Vaso in plastica", ""));
        words.add(new Word("Vaso in terracotta, vetro o ceramica", ""));
        words.add(new Word("Videocassette", ""));
        words.add(new Word("Zerbino", ""));

        // create an ArrayAdapter, useful to handle data in a RecyclerView
        // it puts every element of words into an Android standard View, the
        //  simple_list_item_1
        // the ArrayAdapter is a concrete implementation of the ListAdapter interface
        WordAdapter adapter = new WordAdapter(
                this, words, R.color.category_indifferenziato
        );

        // get the id of the ListView
        ListView listView = (ListView) findViewById(R.id.word_list);

        // attach the ArrayAdapter to the ListView
        listView.setAdapter(adapter);
    }
}
