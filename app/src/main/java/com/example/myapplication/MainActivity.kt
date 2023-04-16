package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btAC: Button
    private lateinit var tvInput: TextView
    private lateinit var cong: Button
    private lateinit var tru: Button
    private lateinit var nhan: Button
    private lateinit var chia: Button
    private lateinit var result: Button
    private lateinit var btNum1: Button
    private lateinit var btNum2: Button
    private lateinit var btNum3: Button
    private lateinit var btNum4: Button
    private lateinit var btNum5: Button
    private lateinit var btNum7: Button
    private lateinit var btNum8: Button
    private lateinit var btNum9: Button
    private lateinit var btNum6: Button
    private lateinit var btNum0: Button

    var input1 = ""
    var input2 = ""
    var method = ""
    val listResult: ArrayList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        anhXa()
        setupUI()
    }

    fun printInputLog() {
        Log.e("MainActivity", "input1: " + input1 + "- method: " + method + " - input2: " + input2)

    }

    fun setupUI() {
        btNum1.setOnClickListener {
            val oldValue = tvInput.text.toString()
            tvInput.text = oldValue + "1"
            if (method == "") {
                input1 = input1 + "1"
            } else {
                input2 = input2 + "1"
            }
            printInputLog()

        }

        btNum2.setOnClickListener {
            val oldValue = tvInput.text.toString()
            tvInput.text = oldValue + "2"
            if (method == "") {
                input1 = input1 + "2"
            } else {
                input2 = input2 + "2"
            }
            printInputLog()
        }

        btNum3.setOnClickListener {
            val oldValue = tvInput.text.toString()
            tvInput.text = oldValue + "3"
            if (method == "") {
                input1 = input1 + "3"
            } else {
                input2 = input2 + "3"
            }
            printInputLog()
        }

        btNum4.setOnClickListener {
            val oldValue = tvInput.text.toString()
            tvInput.text = oldValue + "4"
            if (method == "") {
                input1 = input1 + "4"
            } else {
                input2 = input2 + "4"
            }
            printInputLog()
        }

        btNum5.setOnClickListener {
            val oldValue = tvInput.text.toString()
            tvInput.text = oldValue + "5"
            if (method == "") {
                input1 = input1 + "5"
            } else {
                input2 = input2 + "5"
            }
            printInputLog()
        }

        btNum6.setOnClickListener {
            val oldValue = tvInput.text.toString()
            tvInput.text = oldValue + "6"
            if (method == "") {
                input1 = input1 + "6"
            } else {
                input2 = input2 + "6"
            }
            printInputLog()
        }

        btNum7.setOnClickListener {
            val oldValue = tvInput.text.toString()
            tvInput.text = oldValue + "7"
            if (method == "") {
                input1 = input1 + "7"
            } else {
                input2 = input2 + "7"
            }
            printInputLog()
        }

        btNum8.setOnClickListener {
            val oldValue = tvInput.text.toString()
            tvInput.text = oldValue + "8"
            if (method == "") {
                input1 = input1 + "8"
            } else {
                input2 = input2 + "8"
            }
            printInputLog()
        }

        btNum9.setOnClickListener {
            val oldValue = tvInput.text.toString()
            tvInput.text = oldValue + "9"
            if (method == "") {
                input1 = input1 + "9"
            } else {
                input2 = input2 + "9"
            }
            printInputLog()
        }



        tru.setOnClickListener {
            val oldValue = tvInput.text.toString()
            tvInput.text = oldValue + " - "
            method = "-"
            printInputLog()
        }

        cong.setOnClickListener {
            val oldValue = tvInput.text.toString()
            tvInput.text = oldValue + " + "
            method = "+"
            printInputLog()
        }

        nhan.setOnClickListener {
            val oldValue = tvInput.text.toString()
            tvInput.text = oldValue + " * "
            method = "*"
            printInputLog()
        }

        chia.setOnClickListener {
            val oldValue = tvInput.text.toString()
            tvInput.text = oldValue + " / "
            method = "/"
            printInputLog()
        }

        result.setOnClickListener {
            val value = getResult()
            tvInput.text = value
            listResult.add(value)
        }


        btAC.setOnClickListener {
            input1 = ""
            input2 = ""
            method = ""
            tvInput.text = ""
            printInputLog()
        }

    }

    fun anhXa() {
        tvInput = findViewById<View>(R.id.input) as TextView
        btAC = findViewById<View>(R.id.AC) as Button
        cong = findViewById<View>(R.id.daucong) as Button
        tru = findViewById<View>(R.id.dautru) as Button
        nhan = findViewById<View>(R.id.phepnhan) as Button
        chia = findViewById<View>(R.id.phepchia) as Button
        result = findViewById<View>(R.id.result) as Button
        btNum0 = findViewById<View>(R.id.num0) as Button
        btNum1 = findViewById<View>(R.id.num1) as Button
        btNum2 = findViewById<View>(R.id.num2) as Button
        btNum3 = findViewById<View>(R.id.num3) as Button
        btNum4 = findViewById<View>(R.id.num4) as Button
        btNum5 = findViewById<View>(R.id.num5) as Button
        btNum6 = findViewById<View>(R.id.num6) as Button
        btNum7 = findViewById<View>(R.id.num7) as Button
        btNum8 = findViewById<View>(R.id.num8) as Button
        btNum9 = findViewById<View>(R.id.num9) as Button
    }

    fun getResult(): String {
        var result = 0.0
        if (method == "+") {
            result = input1.toDouble() + input2.toDouble()
        } else if (method == "-") {
            result = input1.toDouble() - input2.toDouble()

        } else if (method == "*") {
        result = input1.toDouble() * input2.toDouble()
        }
        else if (method == "/") {
        result = input1.toDouble() / input2.toDouble()
        }
        val oldValue = tvInput.text.toString()
        return oldValue + " = " + result
    }
}
