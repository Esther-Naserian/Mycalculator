package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.concurrent.atomic.DoubleAdder

class
MainActivity : AppCompatActivity() {
    lateinit var etNum1: EditText
    lateinit var etNum2:EditText
    lateinit var btnAdd: Button
    lateinit var btnSubstract:Button
    lateinit var btnMultiply:Button
    lateinit var btnDivide:Button
    lateinit var tvResult: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()



        btnAdd.setOnClickListener {
            val num1 = etNum1.text.toString().toInt()
            val num2 = etNum2.text.toString().toInt()

        }
        btnSubstract.setOnClickListener{}
        btnDivide.setOnClickListener{}
        btnMultiply.setOnClickListener{}

    }
    fun castViews(){
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubstract =findViewById(R.id.btnSubstract)
        btnMultiply = findViewById(R.id.btnmultiply)
        btnDivide =findViewById(R.id.btnDivide)
        tvResult =findViewById(R.id.tvResult)
    }
    fun  add(num1: Int,num2: Int){
        val sum = num1+ num2
        tvResult.text = sum.toString()
    }

}