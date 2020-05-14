package br.com.osvaldsoza.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {
        List<Frase> frases = new ArrayList<>();
        frases.add(new Frase("\"Tudo o que um sonho precisa para ser realizado é alguém que " +
                "acredite que ele possa ser realizado.\"", "Roberto Shinyashiki"));
        frases.add(new Frase("\"Imagine uma nova história para sua vida e acredite nela.\"",
                "Paulo Coelho"));
        frases.add(new Frase("\"A amizade desenvolve a felicidade e reduz o sofrimento, " +
                "duplicando a nossa alegria e dividindo a nossa dor.\"", "Joseph Addison"));
        frases.add(new Frase("\"Ser feliz sem motivo é a mais autêntica forma de felicidade.\""
                , "Carlos Drummond de Andrade"));
        frases.add(new Frase("\"Não existe um caminho para a felicidade. A felicidade é o " +
                "caminho.\"", "Thich Nhat Hanh"));
        frases.add(new Frase("\"Não espere por uma crise para descobrir o que é importante em " +
                "sua vida.\"", "Platão"));
        frases.add(new Frase("\"Nunca deixe ninguém te dizer que não pode fazer alguma coisa. " +
                "Se você tem um sonho tem que correr atrás dele. As pessoas não conseguem vencer e " +
                "dizem que você também não vai vencer. Se você quer uma coisa corre atrás.\"",
                "À Procura da Felicidade"));
        frases.add(new Frase("\"A alegria de fazer o bem é a única felicidade verdadeira.\"",
                "Leon Tolstói"));
        frases.add(new Frase("\"Desconfie do destino e acredite em você. Gaste mais horas " +
                "realizando que sonhando, fazendo que planejando, vivendo que esperando porque, " +
                "embora quem quase morre esteja vivo, quem quase vive já morreu.\"",
                "Sarah Westphal"));
        frases.add(new Frase("\"Não permito que nenhuma reflexão filosófica me tire a alegria " +
                "das coisas simples da vida\"", "Sigmund Freud"));
        frases.add(new Frase("\"Perder tempo em aprender coisas que não interessam, priva-nos " +
                "de descobrir coisas interessantes.\"", "Carlos Drummond de Andrade"));

        Random random = new Random();
        Frase randomFrase = frases.get(random.nextInt(frases.size()));

        TextView novaFrase = findViewById(R.id.novaFrase);
        novaFrase.setText(randomFrase.getFrase());

        TextView autor = findViewById(R.id.autor);
        autor.setText(randomFrase.getAutor());
    }
}
