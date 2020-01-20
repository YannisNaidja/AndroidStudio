package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean submitpressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // creation par le code
        ScrollView sv = new ScrollView(this);
        LinearLayout layout = new LinearLayout(this);
        layout.setId(R.id.la1);
        sv.addView(layout);
        EditText nom = new EditText(this);
        nom.setHint("nom");
        layout.addView(nom);
        EditText prenom = new EditText(this);
        prenom.setHint("prenom");
        layout.addView(prenom);
        EditText age = new EditText(this);
        age.setHint("age");
        layout.addView(age);
        EditText profession = new EditText(this);
        profession.setHint("Profession");
        layout.addView(profession);
        Button submit = new Button(this);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit(v);
            }
        });

        setContentView(R.layout.activity_main);
        //
    }

    public void submit(View view) {

        LinearLayout layout = (LinearLayout)findViewById(R.id.la1);
        TextView reussi = new TextView(this);
        reussi.setText("Formulaire rempli");
        reussi.setGravity(Gravity.CENTER);
        if(!this.submitpressed){
            this.submitpressed=true;
            layout.addView(reussi);
        }
    }
}
