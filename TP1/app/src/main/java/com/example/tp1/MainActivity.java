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

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    boolean submitpressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // creation par le code

        ScrollView sv = new ScrollView(this);

        LinearLayout layout = new LinearLayout(this);
        layout.setId(R.id.la1);
        layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));
        layout.setOrientation(LinearLayout.VERTICAL);
        sv.addView(layout);

        EditText nom = new EditText(this);
        nom.setHint("nom");
        nom.setGravity(Gravity.CENTER);
        layout.addView(nom);

        EditText prenom = new EditText(this);
        prenom.setHint("prenom");
        prenom.setGravity(Gravity.CENTER);
        layout.addView(prenom);

        EditText age = new EditText(this);
        age.setHint("age");
        age.setGravity(Gravity.CENTER);
        layout.addView(age);

        EditText profession = new EditText(this);
        profession.setHint("Profession");
        profession.setGravity(Gravity.CENTER);
        layout.addView(profession);

        Button submit = new Button(this);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit(v);
            }
        });
        submit.setText("Submit");
        submit.setGravity(Gravity.CENTER);
        layout.addView(submit);

        setContentView(sv);
        //setContentView(R.layout.activity_main);

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
