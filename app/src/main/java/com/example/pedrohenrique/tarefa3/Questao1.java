package com.example.pedrohenrique.tarefa3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Questao1 extends Activity {

    private EditText nome;
    private RadioGroup grp_radio;
    private RadioButton radio_sexo;
    private TextView nome_view;
    private TextView sexo_view;
    private TextView nome_str;
    private TextView sexo_str;
    private String valor_sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1);

        nome = findViewById(R.id.input_nome);
        grp_radio = findViewById(R.id.group_sexo);
        nome_view = findViewById(R.id.nome_str_view);
        sexo_view = findViewById(R.id.sexo_str_view);
        nome_str = findViewById(R.id.nome_view_str);
        sexo_str = findViewById(R.id.sexo_str_view);
    }

    public void exibir(View view){
        nome_str.setVisibility(View.VISIBLE);
        sexo_str.setVisibility(View.VISIBLE);
        sexo_view.setVisibility(View.VISIBLE);
        sexo_view.setText(valor_sexo);

    }

    public void limpar(View view){

    }

    public void onRadioButtonClicked(View view){
        boolean checar = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.rdo_masculino:
                if (checar){
                    valor_sexo = "Masculino";
                }
                break;
            case R.id.rdo_feminino:
                if (checar){
                    valor_sexo = "Feminino";
                }
                break;
        }
    }
}
