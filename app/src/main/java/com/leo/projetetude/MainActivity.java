package com.leo.projetetude;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity { // sans oublier l'implémentation de l'interface OnClickListener

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {

                Intent intent1 = new Intent(MainActivity.this, Organisation.class);

                startActivity(intent1);
                finish();
            }

        });
    }

}
