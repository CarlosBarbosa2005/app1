package barbosa.souza.eduardo.carlos.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//criando class para Main Activity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //criando o botão de enviar pela ID
        Button btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            //classe para adicionar a funcionalidade para o botão quando clicado
            public void onClick(View view) {
                //criando o edittext pela ID
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                //criando o String textoDigitado para armazenar o que a pessoa escreveu
                String textoDigitado = etDigiteAqui.getText().toString();
                etDigiteAqui.setText("");
                //criando uma intent
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                i.putExtra("Texto", textoDigitado);
                startActivity(i);
            }
        });
    }
}