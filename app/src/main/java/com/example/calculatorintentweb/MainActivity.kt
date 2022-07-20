package com.example.calculatorintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var Buttoncalc: Button? = null
    var ButtonIntent: Button? = null
    var ButtonWeb: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Buttoncalc = findViewById(R.id.Btn_Cal)
        ButtonIntent = findViewById(R.id.Btn_intent)
        ButtonWeb = findViewById(R.id.Btn_web)

        Buttoncalc!!.setOnClickListener {
            val Intent = Intent(this, CalculatorActivity::class.java)
            startActivity(Intent)
        }
        ButtonIntent!!.setOnClickListener {
            val Int = Intent(this, IntentActivity::class.java)
            startActivity(Int)
        }
        ButtonWeb!!.setOnClickListener {
            val web = Intent(this, WebActivity::class.java)
            startActivity(web)
        }
    }
}
