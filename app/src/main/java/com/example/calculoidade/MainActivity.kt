package com.example.calculoidade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Calcular(View: View){
        val calculo_idade = Calendar.getInstance().get(Calendar.YEAR);
        textidade.text = "Sua idade é: " + (calculo_idade - inputidade.text.toString().toInt());
    }
}