package com.example.fragmentoscursada2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), PrimerFragmentoInterfaz {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val primerFragmento = supportFragmentManager
            .findFragmentById(R.id.contenedor_primer_fragmento) as? PrimerFragmento
        primerFragmento?.listener = this

    }

    override fun mostrarContenido() {
        val segundoFragmento = SegundoFragmento()
        supportFragmentManager.beginTransaction()
            .replace(R.id.contenedor_segundo_fragmento, segundoFragmento)
            .addToBackStack(null)
            .commit()

    }
}