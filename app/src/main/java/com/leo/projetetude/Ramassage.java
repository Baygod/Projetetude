package com.leo.projetetude;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.leo.projetetude.R.drawable.attente;
import static com.leo.projetetude.R.drawable.reculer;


public class Ramassage extends Activity {
    ListView liste = null;
    TextView txt = null;
    ImageView img = null;
    Button btn = null;
    String operation = "Attente";
    String etat = "depart";
    int Position_item = 0;
    int Position = 0;
    int click;
    boolean dernier = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramassage);
        liste = (ListView) findViewById(R.id.lv);
        txt = (TextView) findViewById(R.id.texte);
        img = (ImageView) findViewById(R.id.image);
        btn = (Button)findViewById(R.id.etape);
        final List<String> contenu = new ArrayList<String>();

        Position_item = 1;
        dernier = true;

        if(Position_item != 0)
        {
            affichage("Avancer");
            affichage_liste(contenu);
            Position = 1;
            if(Position_item == 1)
            {
                item_pos_1(contenu);
            }
            else if(Position_item == 2)
            {
                affichage("Droite");
                Position = 5;
                affichage("Prendre l'item");
                contenu.add("Item 1");
                affichage_liste(contenu);
            }
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
        else if(op == "Prendre l'item")
        {
            img.setImageResource(attente);
        }
        else if(op == "Reculer")
        {
            img.setImageResource(reculer);
        }
    }

    protected void affichage_liste(List<String> contenu){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contenu);
        liste.setAdapter(adapter);
    }

    protected void item_pos_1(final List<String> c)
    {
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                affichage("Gauche");
                btn.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View button) {
                        Position = 4;
                        affichage("Prendre l'item");
                        c.add("Item 1");
                        affichage_liste(c);
                        btn.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View button) {
                                affichage("Reculer");
                                btn.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View button) {
                                        Position = 1;
                                        if(dernier == true)
                                        {
                                            affichage("Droite");
                                            btn.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View button) {
                                                    Position = 0;
                                                    affichage("Stop");
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }



}
