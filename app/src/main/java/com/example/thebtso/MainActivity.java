package com.example.thebtso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView TV1, TV2, TV3, TV4, TV5, TV6, TV7, TV8, TV9;
    private EditText edittext;
    private Button add, Ingame;
    String FullTV;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = findViewById(R.id.editT);
        add = findViewById(R.id.Add);
        Ingame = findViewById(R.id.Go_To_Game);
        TV1 = (TextView) findViewById(R.id.TV1);


        Ingame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), The_Bottle.class);
                FullTV = edittext.getText().toString();
                intent.putExtra("TVS", FullTV);
                startActivity(intent);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetTo1();
            }
        });

    }


    private void GetTo1() {
        if (edittext.getText().toString().trim().length() == 0) {
            return;
        }
        TV1.setText(edittext.getText().toString());
        edittext.setText("");

        if (TV1.getText().toString().trim().length() != 0) {
            TV2.setText(edittext.getText());
            edittext.setText("");
        }
    }

    public void init(){
        TV1=(TextView)findViewById(R.id.TV1);


    }
}
