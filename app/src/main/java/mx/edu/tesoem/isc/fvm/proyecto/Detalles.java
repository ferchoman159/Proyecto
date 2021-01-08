package mx.edu.tesoem.isc.fvm.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Detalles extends AppCompatActivity {
    TextView lblmatricula, lblnombre, lblcorreo, lblpromedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        lblmatricula = findViewById(R.id.textView);
        lblnombre = findViewById(R.id.dlblNombre);
        lblcorreo = findViewById(R.id.textView);
        lblpromedio = findViewById(R.id.textView);

        String nombre = getIntent().getExtras().get("Nombre").toString();
        DatosParcelable dato = getIntent().getParcelableExtra("DatosParcelable");

        lblmatricula.setText(dato.getMatricula());
        lblnombre.setText(dato.getNombre());
        lblcorreo.setText(dato.getCorreo());
        lblpromedio.setText(dato.getPromedio());

        getSupportActionBar().setTitle(nombre);
    }
}