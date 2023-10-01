package mx.edu.isc.tesoem.CEJZ.p2_7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent lanzar = new Intent(PrincipalActivity.this,SegundaActivity.class);
            startActivity(lanzar);
            finish();
            }
        },4000);
    }
}