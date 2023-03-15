package barbosa.souza.eduardo.carlos.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//criando uma classe NextActivity
public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setando o content view ao layout da app
        setContentView(R.layout.activity_next);
        //capturando o intent
        Intent i = getIntent();
        //pegando o textoDigitado utilizando getStringExtra
        String textoDigitado = i.getStringExtra("Texto");
        TextView tvText = findViewById(R.id.tvTexto);
        //setando o texto digitado a app
        tvText.setText(textoDigitado);
    }
}