package com.example.myfirstapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapplication.databinding.CalculatorBinding
import com.example.myfirstapplication.databinding.SignUpBinding

class Calculator : AppCompatActivity() {

    //
    lateinit var calculator: CalculatorBinding
    lateinit var scrolling: ScrollingActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        calculator = CalculatorBinding.inflate(layoutInflater)
        setContentView(calculator.root)

        //Listener for button
        var defaulValue = 0
        var defaulList = mutableListOf<String>()
        var defaultString = ""
        calculator.outPut.text = ""
        calculator.outputResult.text = ""
//        calculator.outPut.append(calculator.root.toString())
        calculator.button1.setOnClickListener {
//            val intent = Intent(this, ScrollingActivity::class.java)
//            startActivity(intent)
            calculator.outPut.text = calculator.button1.text


        }


        fun add(){
                var inputdata1=calculator.outputResult.text.toString().trim().toBigDecimal()
                var inputdata2=calculator.outputResult.text.toString().trim().toBigDecimal()
                calculator.outputResult.text=calculator.outputResult.text.toString()

        }

        calculator.button2.setOnClickListener {
            calculator.outPut.text = calculator.button2.text

        }
        calculator.button3.setOnClickListener {
            calculator.outPut.text = calculator.button3.text

        }
        calculator.buttonC.setOnClickListener {
            calculator.outPut.text = calculator.buttonC.text
        }

        //row 2
        calculator.button4.setOnClickListener {
            calculator.outPut.text = calculator.button4.text

        }
        calculator.button5.setOnClickListener {
            calculator.outPut.text = calculator.button5.text

        }
        calculator.button6.setOnClickListener {
            calculator.outPut.text = calculator.button6.text

        }
        calculator.buttonMinus.setOnClickListener {
            calculator.outPut.text = calculator.buttonMinus.text


        }
        //row 3
        calculator.button7.setOnClickListener {
            calculator.outPut.text = calculator.button7.text

        }
        calculator.button8.setOnClickListener {
            calculator.outPut.text = calculator.button8.text

        }
        calculator.button9.setOnClickListener {
            calculator.outPut.text = calculator.button9.text

        }

        calculator.buttonPlus.setOnClickListener {
            calculator.outPut.text = calculator.buttonPlus.text
        }
        //row 4
        calculator.buttonDivide.setOnClickListener {
            calculator.outPut.text = calculator.buttonDivide.text

        }
        calculator.button0.setOnClickListener {
            calculator.outPut.text = calculator.button0.text

        }
        calculator.buttonMultiply.setOnClickListener {
            calculator.outPut.text = calculator.buttonMultiply.text

        }
        calculator.buttonEquals.setOnClickListener {
            calculator.outPut.text = calculator.buttonEquals.text

        }

    }


}