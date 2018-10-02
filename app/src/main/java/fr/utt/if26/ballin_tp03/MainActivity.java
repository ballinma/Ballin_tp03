package fr.utt.if26.ballin_tp03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String message = "Bonjour IF26 !​";

    /**
     * Test de la JavaDoc: Est-ce que ça fonctionne ?
     * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tx = (TextView) findViewById(R.id.textview);
        tx.setText(message);

        Button bt = (Button) findViewById(R.id.bouton); bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tx.setBackgroundColor(Color.RED);
            } });

    }
}
