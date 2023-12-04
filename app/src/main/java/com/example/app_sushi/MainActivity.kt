package com.example.app_sushi

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var linearLayout1: LinearLayout
    private lateinit var linearLayout2: LinearLayout
    private lateinit var linearLayout3: LinearLayout
    private lateinit var linearLayout4: LinearLayout
    private lateinit var linearLayout5: LinearLayout
    private lateinit var linearLayout6: LinearLayout
    private lateinit var linearLayout7: LinearLayout
    private lateinit var linearLayout8: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Todas as Linear layouts
        linearLayout1 = findViewById(R.id.sushisUm)
        linearLayout2 = findViewById(R.id.sushisDois)
        linearLayout3 = findViewById(R.id.barcasUm)
        linearLayout4 = findViewById(R.id.barcasDois)
        linearLayout5 = findViewById(R.id.sobremesasUm)
        linearLayout6 = findViewById(R.id.sobremesasDois)
        linearLayout7 = findViewById(R.id.bebidasUm)
        linearLayout8 = findViewById(R.id.bebidasDois)


        val buttonTudo = findViewById<Button>(R.id.tudo)
        val buttonSushis = findViewById<Button>(R.id.sushis)
        val buttonPopular = findViewById<Button>(R.id.popular)
        val buttonBarcas = findViewById<Button>(R.id.barcas)
        val buttonSobremesas = findViewById<Button>(R.id.sobremesas)
        val buttonBebidas = findViewById<Button>(R.id.bebidas)


        buttonTudo.setOnClickListener {
            linearLayout1.visibility = View.VISIBLE
            linearLayout2.visibility = View.VISIBLE
            linearLayout3.visibility = View.VISIBLE
            linearLayout4.visibility = View.VISIBLE
            linearLayout5.visibility = View.VISIBLE
            linearLayout6.visibility = View.VISIBLE
            linearLayout7.visibility = View.VISIBLE
            linearLayout8.visibility = View.VISIBLE
        }

        buttonPopular.setOnClickListener {
            linearLayout1.visibility = View.VISIBLE
            linearLayout2.visibility = View.GONE
            linearLayout3.visibility = View.GONE
            linearLayout4.visibility = View.VISIBLE
            linearLayout5.visibility = View.GONE
            linearLayout6.visibility = View.GONE
            linearLayout7.visibility = View.GONE
            linearLayout8.visibility = View.VISIBLE
        }

        buttonSushis.setOnClickListener {
            linearLayout1.visibility = View.VISIBLE
            linearLayout2.visibility = View.VISIBLE
            linearLayout3.visibility = View.GONE
            linearLayout4.visibility = View.GONE
            linearLayout5.visibility = View.GONE
            linearLayout6.visibility = View.GONE
            linearLayout7.visibility = View.GONE
            linearLayout8.visibility = View.GONE
        }

        buttonBarcas.setOnClickListener {
            linearLayout1.visibility = View.GONE
            linearLayout2.visibility = View.GONE
            linearLayout3.visibility = View.VISIBLE
            linearLayout4.visibility = View.VISIBLE
            linearLayout5.visibility = View.GONE
            linearLayout6.visibility = View.GONE
            linearLayout7.visibility = View.GONE
            linearLayout8.visibility = View.GONE
        }

        buttonSobremesas.setOnClickListener {
            linearLayout1.visibility = View.GONE
            linearLayout2.visibility = View.GONE
            linearLayout3.visibility = View.GONE
            linearLayout4.visibility = View.GONE
            linearLayout5.visibility = View.VISIBLE
            linearLayout6.visibility = View.VISIBLE
            linearLayout7.visibility = View.GONE
            linearLayout8.visibility = View.GONE
        }

        buttonBebidas.setOnClickListener {
            linearLayout1.visibility = View.GONE
            linearLayout2.visibility = View.GONE
            linearLayout3.visibility = View.GONE
            linearLayout4.visibility = View.GONE
            linearLayout5.visibility = View.GONE
            linearLayout6.visibility = View.GONE
            linearLayout7.visibility = View.VISIBLE
            linearLayout8.visibility = View.VISIBLE
        }

    }
}

