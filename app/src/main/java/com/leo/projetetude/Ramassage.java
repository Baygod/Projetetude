package com.leo.projetetude;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;




public class Ramassage extends Activity {
    ListView liste = null;
    TextView txt = null;
    ImageView img = null;
    Button btn = null;
    String operation = "Attente";
    int etat = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramassage);
        liste = (ListView) findViewById(R.id.lv);
        txt = (TextView) findViewById(R.id.texte);
        img = (ImageView) findViewById(R.id.image);
        btn = (Button)findViewById(R.id.etape);
        btn.setOnClickListener(handler);

        List<String> contenu = new ArrayList<String>();




        if(etat == 0) {

            affichage(operation);
            affichage_liste(contenu);
            etat = 1;
            operation = "Stop";
        }
        else if(etat == 1)
        {


                affichage(operation);
                affichage_liste(contenu);
        }



    }


    protected void affichage(String op)
    {
        txt.setText(op);
        if(op == "Stop")
        {
            img.setImageResource(R.drawable.stop);
        }
        else if(op == "Avancer")
        {
            img.setImageResource(R.drawable.avancer);
        }
        else if(op == "Droite")
        {
            img.setImageResource(R.drawable.droite);
        }
        else if(op == "Gauche")
        {
            img.setImageResource(R.drawable.gauche);
        }
        else if(op == "Attente")
        {
            img.setImageResource(R.drawable.attente);
        }
    }

    protected void affichage_liste(List<String> contenu){


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contenu);

        liste.setAdapter(adapter);
    }

    View.OnClickListener handler = new View.OnClickListener() {
        public void onClick(View v) {
            etat=etat+1;

            Intent intent = getIntent();
            finish();
            startActivity(intent);

        }
    };
}
