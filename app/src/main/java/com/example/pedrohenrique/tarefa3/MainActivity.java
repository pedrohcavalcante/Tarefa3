package com.example.pedrohenrique.tarefa3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button questao1;
    private Button questao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questao1 = findViewById(R.id.questao1_btn);
        questao2 = findViewById(R.id.questao2_btn);
    }

    public void funcQuestao1(View view) {
        Intent questao1 = new Intent(getApplicationContext(), Questao1.class);
        startActivity(questao1);
    }

    public void funcQuestao2(View view){
        Intent questao2 = new Intent(getApplicationContext(), Questao2.class);
        startActivity(questao2);

    }
}
