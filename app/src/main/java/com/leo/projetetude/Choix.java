package com.leo.projetetude;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.Random;

public class Choix extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix);


        Intent intent = getIntent();
        String[] liste1 = intent.getStringArrayExtra("Zone 1");
        liste1 = change(liste1);
        String[] liste2 = intent.getStringArrayExtra("Zone 2");
        liste2 = change(liste2);
        String[] liste3 = intent.getStringArrayExtra("Zone 3");
        liste3 = change(liste3);
        String[] liste4 = intent.getStringArrayExtra("Zone 4");
        liste4 = change(liste4);
        String[] liste5 = intent.getStringArrayExtra("Zone 5");
        liste5 = change(liste5);
        String[] liste6 = intent.getStringArrayExtra("Zone 6");
        liste6 = change(liste6);
        String[] listetotale = new String[43];
        for(int i = 0;i<5;i++)
        {
            listetotale[i] = liste1[i];
            listetotale[i+5] = liste2[i];
            listetotale[i+10] = liste3[i];
            listetotale[i+15] = liste4[i];
            listetotale[i+20] = liste5[i];
            listetotale[i+25] = liste6[i];
        }
        for(int i =30;i<43;i++)
        {
            listetotale[i] = "";
        }
        int [] tot = new int[10];
        tot = total(listetotale);
        listetotale[30] = "Nombre total de tags de chaque type : ";
        listetotale[31] = "bleu : " + Integer.toString(tot[0]);
        listetotale[32] = "vert : " + Integer.toString(tot[1]);
        listetotale[33] = "rouge : " + Integer.toString(tot[2]);
        listetotale[34] = "jaune : " + Integer.toString(tot[3]);
        listetotale[35] = "noir : " + Integer.toString(tot[4]);


        int [] obj = new int[5];
        obj = objectif(tot);
        listetotale[36] = "Objectifs :";

        for(int i = 0;i<5;i++)
        {
            listetotale[i+37] = Integer.toString(obj[i]);
        }
        listetotale[42] = Integer.toString(nombre(tot));




        ListView liste = (ListView) findViewById(R.id.liste) ;
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Choix.this,
                android.R.layout.simple_list_item_1, listetotale);

        liste.setAdapter(adapter);

        Button button = (Button) findViewById(R.id.button_choix);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {

                Intent intent2 = new Intent(Choix.this, Ramassage.class);

                startActivity(intent2);
                finish();
            }

        });
    }

    protected String couleur(String s)
    {
        String debut = "NdefMessage[NdefRecordtnf=1type=54payload=02656E";
        String bleu = "626C65753";
        String vert = "766572743";
        String rouge = "726F7567653";
        String jaune = "6A61756E653";
        String noir = "6E6F69723";
        if(s.equals(debut+bleu+"1]"))
        {
            //bleu1
            return "bleu";
        }
        else if(s.equals(debut+bleu+"2]"))
        {
            //bleu2
            return "bleu";
        }
        else if(s.equals(debut+bleu+"3]"))
        {
            //bleu3
            return "bleu";
        }
        else if(s.equals(debut+bleu+"4]"))
        {
            //bleu4
            return "bleu";
        }
        else if(s.equals(debut+bleu+"5]"))
        {
            //bleu5
            return "bleu";
        }
        else if(s.equals(debut+bleu+"6]"))
        {
            //bleu6
            return "bleu";
        }
        else if(s.equals(debut+vert+"1]"))
        {
            //vert1
            return "vert";
        }
        else if(s.equals(debut+vert+"2]"))
        {
            //vert2
            return "vert";
        }
        else if(s.equals(debut+vert+"3]"))
        {
            //vert3
            return "vert";
        }
        else if(s.equals(debut+vert+"4]"))
        {
            //vert4
            return "vert";
        }
        else if(s.equals(debut+vert+"5]"))
        {
            //vert5
            return "vert";
        }
        else if(s.equals(debut+vert+"6]"))
        {
            //vert6
            return "vert";
        }
        else if(s.equals(debut+rouge+"1]"))
        {
            //rouge1
            return "rouge";
        }
        else if(s.equals(debut+rouge+"2]"))
        {
            //rouge2
            return "rouge";
        }
        else if(s.equals(debut+rouge+"3]"))
        {
            //rouge3
            return "rouge";
        }
        else if(s.equals(debut+rouge+"4]"))
        {
            //rouge4
            return "rouge";
        }
        else if(s.equals(debut+rouge+"5]"))
        {
            //rouge5
            return "rouge";
        }
        else if(s.equals(debut+rouge+"6]"))
        {
            //rouge6
            return "rouge";
        }
        else if(s.equals(debut+jaune+"1]"))
        {
            //jaune1
            return "jaune";
        }
        else if(s.equals(debut+jaune+"2]"))
        {
            //jaune2
            return "jaune";
        }
        else if(s.equals(debut+jaune+"3]"))
        {
            //jaune3
            return "jaune";
        }
        else if(s.equals(debut+jaune+"4]"))
        {
            //jaune4
            return "jaune";
        }
        else if(s.equals(debut+jaune+"5]"))
        {
            //jaune5
            return "jaune";
        }
        else if(s.equals(debut+jaune+"6]"))
        {
            //jaune6
            return "jaune";
        }
        else if(s.equals(debut+noir+"1]"))
        {
            //noir1
            return "noir";
        }
        else if(s.equals(debut+noir+"2]"))
        {
            //noir2
            return "noir";
        }
        else if(s.equals(debut+noir+"3]"))
        {
            //noir3
            return "noir";
        }
        else if(s.equals(debut+noir+"4]"))
        {
            //noir4
            return "noir";
        }
        else if(s.equals(debut+noir+"5]"))
        {
            //noir5
            return "noir";
        }
        else if(s.equals(debut+noir+"6]"))
        {
            //noir6
            return "noir";
        }
        else
        {
            return "Pas d'item";
        }

    }

    private String[] change(String[] l)
    {
        for(int i =1;i<5;i++)
        {
            l[i] = couleur(l[i]);
        }
        return l;
    }

    private int[] total (String [] lt)
    {
        int [] t = new int[10];
        for(int i = 0;i<lt.length;i++)
        {
            if(lt[i].equals("bleu"))
            {
                t[0]+=1;
            }
            else if(lt[i].equals("vert"))
            {
                t[1]+=1;
            }
            else if(lt[i].equals("rouge"))
            {
                t[2]+=1;
            }
            else if(lt[i].equals("jaune"))
            {
                t[3]+=1;
            }
            else if(lt[i].equals("noir"))
            {
                t[4]+=1;
            }
        }
        return t;
    }

    private int alea(int min, int max)
    {
        Random r = new Random();
        int valeur = min + r.nextInt(max - min);
        return valeur;
    }

    private int[] objectif(int[] t)
    {
        int [] o = new int[5];
        for(int i=0;i<5;i++)
        {
            o[i] = 0;
        }
        int max = nombre(t);
        int restant;
        if(max < 4)
        {
            restant = max;
        }
        else
        {
            restant = 4;
        }
        int couleur,nombre;

        while(restant != 0)
        {
            couleur = alea(0,4);
            if(t[couleur] != 0)
            {
                if(restant == 1)
                {
                    o[couleur] += 1;
                    restant-=1;
                }
                else
                {
                    nombre = alea(1,restant);
                    if(nombre > t[couleur])
                    {
                        restant-=1;
                    }
                    else
                    {
                        o[couleur] += nombre;
                        restant-=1;

                    }

                }

            }


        }
        return o;
    }

    private int nombre(int[] t)
    {
        int somme = 0;
        for(int i =0;i<t.length;i++)
        {
            somme += t[i];
        }
        return somme;
    }

}
