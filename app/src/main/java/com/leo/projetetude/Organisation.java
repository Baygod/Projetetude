package com.leo.projetetude;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Organisation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organisation);

        Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {

                Intent intent2 = new Intent(Organisation.this, TagViewer.class);

                startActivity(intent2);
            }

        });
    }
}
