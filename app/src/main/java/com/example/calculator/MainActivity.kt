package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.calculator_homework.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_homework)

            btnAdd.setOnClickListener {
                if (text1.text.toString().isEmpty() && text2.text.toString().isEmpty()) {
                    Toast.makeText(
                        applicationContext,
                        "! Please insert a number ", Toast.LENGTH_LONG
                    ).show()
                }else
                {
                    var num1: Int = text1.text.toString().toInt()
                    var num2: Int = text2.text.toString().toInt()
                    var num = num1 + num2
                    textView.text = num.toString()
                }
            }

        btnSub.setOnClickListener {
            if (text1.text.toString().isEmpty() && text2.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "! Please insert a number ", Toast.LENGTH_LONG
                ).show()
            } else
            {
                var num1: Int = text1.text.toString().toInt()
                var num2: Int = text2.text.toString().toInt()
                var num = num1 - num2
                textView.text = num.toString()
            }
        }
        btnMul.setOnClickListener {
            if (text1.text.toString().isEmpty() && text2.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "! Please insert a number ", Toast.LENGTH_LONG
                ).show()
            }
            else
            {
                var num1: Int = text1.text.toString().toInt()
                var num2: Int = text2.text.toString().toInt()
                var num = num1 * num2
                textView.text = num.toString()
            }
        }
        btnDiv.setOnClickListener {
            if (text1.text.toString().isEmpty() && text2.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "! Please insert a number ", Toast.LENGTH_LONG
                ).show()
            } else
            {
                var num1: Double = text1.text.toString().toDouble()
                var num2: Double = text2.text.toString().toDouble()
                var num = num1 / num2
                textView.text = num.toString()
            }
        }
        btnMod.setOnClickListener {
            if (text1.text.toString().isEmpty() && text2.text.toString().isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "! Please insert a number ", Toast.LENGTH_LONG
                ).show()
            } else
            {
                var num1: Int = text1.text.toString().toInt()
                var num2: Int = text2.text.toString().toInt()
                var num = num1 % num2
                textView.text = num.toString()
            }
        }
        btnClear.setOnClickListener {
            text1.setText("")
            text2.setText("")
            textView.setText("Result : ")

        }
    }
}


