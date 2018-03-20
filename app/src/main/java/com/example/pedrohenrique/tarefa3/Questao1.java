package com.example.pedrohenrique.tarefa3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Questao1 extends Activity {

    private EditText nome;
    private RadioGroup grp_radio;
    private RadioButton radio_masculino;
    private RadioButton radio_feminino;
    private TextView nome_view;
    private TextView sexo_view;
    private TextView nome_str;
    private TextView sexo_str;
    private String valor_sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questao1);

        grp_radio = findViewById(R.id.group_sexo);
        radio_feminino = findViewById(R.id.rdo_feminino);
        radio_masculino = findViewById(R.id.rdo_masculino);

        nome = findViewById(R.id.input_nome);
        grp_radio = findViewById(R.id.group_sexo);

        nome_str = findViewById(R.id.nome_input_view);
        nome_view = findViewById(R.id.nome_view_str);
        //nome_view.setVisibility(View.INVISIBLE);

        sexo_view = findViewById(R.id.sexo_view_str);
        //sexo_view.setVisibility(View.INVISIBLE);
        sexo_str = findViewById(R.id.sexo_input_view);
    }

    public void exibir(View view){

        //nome_str.setVisibility(View.VISIBLE);
        //sexo_str.setVisibility(View.VISIBLE);

        //sexo_view.setVisibility(View.VISIBLE);
        //nome_view.setVisibility(View.VISIBLE);

        sexo_view.setText(valor_sexo);
        nome_view.setText(nome.getText());
        
        if(radio_feminino.isChecked()){
            valor_sexo = "Feminino";
        }else if (radio_masculino.isChecked()){
            valor_sexo = "Masculino";
        }else{
            Toast.makeText(this, "Erro", Toast.LENGTH_SHORT).show();
        }


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
