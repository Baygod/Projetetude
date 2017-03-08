package com.leo.projetetude;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pasdenfc extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasdenfc);

        Button button = (Button) findViewById(R.id.quitter);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View button) {

                finish();
            }

        });
    }
}
