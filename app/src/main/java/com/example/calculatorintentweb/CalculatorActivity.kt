package com.example.calculatorintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var ButtonAdd:Button
    lateinit var ButtonSub:Button
    lateinit var ButtonMult:Button
    lateinit var ButtonDiv:Button
    lateinit var ButtonMod:Button
    lateinit var Edt_Fnum:EditText
    lateinit var Edt_Snum:EditText
    lateinit var Txt_Answer:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        ButtonAdd=findViewById(R.id.Btn_Add)
        ButtonSub=findViewById(R.id.Btn_Sub)
        ButtonMult=findViewById(R.id.Btn_Mol)
        ButtonDiv=findViewById(R.id.Btn_Div)
        ButtonMod=findViewById(R.id.Btn_Mod)
        Edt_Fnum=findViewById(R.id.Edt_Fnum)
        Edt_Snum=findViewById(R.id.Edt_Snum)
        Txt_Answer=findViewById(R.id.txt_text)

        ButtonAdd.setOnClickListener {
            var firstnum= Edt_Fnum.text.toString()
            var secondnum= Edt_Snum.text.toString()

            if (firstnum.isEmpty() && secondnum.isEmpty()){
                Txt_Answer.text="Invalid Input"
            }else{
               var answer= firstnum.toDouble() + secondnum.toDouble()
               Txt_Answer.text= answer.toString()
            }
        }

        ButtonSub.setOnClickListener {
            var firstnum= Edt_Fnum.text.toString()
            var secondnum= Edt_Snum.text.toString()

            if (firstnum.isEmpty() && secondnum.isEmpty()){
                Txt_Answer.text="Invalid Input"
            }else{
                var answer= firstnum.toDouble() - secondnum.toDouble()
                Txt_Answer.text= answer.toString()
            }
        }

        ButtonMult.setOnClickListener {
            var firstnum= Edt_Fnum.text.toString()
            var secondnum= Edt_Snum.text.toString()

            if (firstnum.isEmpty() && secondnum.isEmpty()){
                Txt_Answer.text="Invalid Input"
            }else{
                var answer= firstnum.toDouble() * secondnum.toDouble()
                Txt_Answer.text= answer.toString()
            }
        }

        ButtonDiv.setOnClickListener {
            var firstnum= Edt_Fnum.text.toString()
            var secondnum= Edt_Snum.text.toString()

            if (firstnum.isEmpty() && secondnum.isEmpty()){
                Txt_Answer.text="Invalid Input"
            }else{
                var answer= firstnum.toDouble() / secondnum.toDouble()
                Txt_Answer.text= answer.toString()
            }
        }

        ButtonMod.setOnClickListener {
            var firstnum= Edt_Fnum.text.toString()
            var secondnum= Edt_Fnum.text.toString()

            if (firstnum.isEmpty() && secondnum.isEmpty()){
                Txt_Answer.text="Invalid Input"
            }else{
                var answer=firstnum.toDouble() % secondnum.toDouble()
                Txt_Answer.text=answer.toString()
            }
        }

    }
}