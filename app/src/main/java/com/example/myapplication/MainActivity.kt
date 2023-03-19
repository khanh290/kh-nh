package com.example.myapplication

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R
import java.text.DecimalFormat
import java.util.*
import java.util.regex.Pattern

class MainActivity() : Activity() {
    private var AC: Button? =null
    var input: TextView? = null
    var output: TextView? = null
    var iptemp: TextView? = null
    private var cong: Button? = null
    private var tru: Button? = null
    private var nhan: Button? = null
    private var chia: Button? = null
    private var result: Button? = null
    private var num1: Button? = null
    private var num2: Button? = null
    private var num3: Button? = null
    private var num4: Button? = null
    private var num5: Button? = null
    private var num7: Button? = null
    private var num8: Button? = null
    private var num9: Button? = null
    private var num6: Button? = null
    private var num0: Button? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        AnhXa()
        AC!!.setOnClickListener { v: View? ->
            input!!.text = ""
            output!!.text = "0"
            iptemp!!.text = ""
        }

        AC!!.setOnClickListener { v: View? ->
            val str = StringBuffer(input!!.text)
            if (str.length > 0) {
                str.deleteCharAt(str.length - 1)
                input!!.text = str
                if (str.length > 0) Result() else output!!.text = "0"
            }
        }
        num0!!.setOnClickListener { v: View? ->
            input!!.text = input!!.text.toString() + "0"
            Result()
            iptemp!!.text = ""
        }
        num1!!.setOnClickListener { v: View? ->
            input!!.text = input!!.text.toString() + "1"
            Result()
            iptemp!!.text = ""
        }
        num2!!.setOnClickListener { v: View? ->
            input!!.text = input!!.text.toString() + "2"
            Result()
            iptemp!!.text = ""
        }
        num3!!.setOnClickListener { v: View? ->
            input!!.text = input!!.text.toString() + "3"
            Result()
            iptemp!!.text = ""
        }
        num4!!.setOnClickListener { v: View? ->
            input!!.text = input!!.text.toString() + "4"
            Result()
            iptemp!!.text = ""
        }
        num5!!.setOnClickListener { v: View? ->
            input!!.text = input!!.text.toString() + "5"
            Result()
            iptemp!!.text = ""
        }
        num6!!.setOnClickListener { v: View? ->
            input!!.text = input!!.text.toString() + "6"
            Result()
            iptemp!!.text = ""
        }
        num7!!.setOnClickListener { v: View? ->
            input!!.text = input!!.text.toString() + "7"
            Result()
            iptemp!!.text = ""
        }
        num8!!.setOnClickListener { v: View? ->
            input!!.text = input!!.text.toString() + "8"
            Result()
            iptemp!!.text = ""
        }
        num9!!.setOnClickListener { v: View? ->
            input!!.text = input!!.text.toString() + "9"
            iptemp!!.text = ""
            Result()
        }
        chia!!.setOnClickListener { v: View? ->
            if (input!!.text.length > 0) if (Character.isDigit(
                    input!!.text[input!!.text.length - 1]
                )
            ) input!!.text = input!!.text.toString() + "."
        }

        tru!!.setOnClickListener { v: View? ->
            iptemp!!.text = ""
            if (output!!.text !== "0" && input!!.text === "") {
                input!!.text = output!!.text.toString() + "-"
            }
            if (input!!.text.length == 0) input!!.text =
                input!!.text.toString() + "-" else if (Character.isDigit(
                    input!!.text[input!!.text.length - 1]
                ) || input!!.text[input!!.text.length - 1] == '/' || input!!.text[input!!.text.length - 1] == 'x'
            ) input!!.text = input!!.text.toString() + "-"
        }
        cong!!.setOnClickListener { v: View? ->
            if (input!!.text.length > 0) if (Character.isDigit(
                    input!!.text[input!!.text.length - 1]
                )
            ) input!!.text = input!!.text.toString() + "+"
            if (output!!.text !== "0" && input!!.text === "") {
                input!!.text = output!!.text.toString() + "+"
            }
        }
        nhan!!.setOnClickListener { v: View? ->
            if (input!!.text.length > 0) if (Character.isDigit(
                    input!!.text[input!!.text.length - 1]
                )
            ) input!!.text = input!!.text.toString() + "x"
            if (output!!.text !== "0" && input!!.text === "") {
                input!!.text = output!!.text.toString() + "x"
            }
        }
        chia!!.setOnClickListener { v: View? ->
            if (input!!.text.length > 0) if (Character.isDigit(
                    input!!.text[input!!.text.length - 1]
                )
            ) input!!.text = input!!.text.toString() + "/"
            if (output!!.text !== "0" && input!!.text === "") {
                input!!.text = output!!.text.toString() + "/"
            }
        }
        result!!.setOnClickListener { v: View? ->
            if (input!!.text.length > 1) Result()
            iptemp!!.text = input!!.text as String + " ="
            input!!.text = ""
        }
    }

    private var arrOperation: ArrayList<String>? = null
    private var arrNumber: ArrayList<Double>? = null
    fun addOperation(input: String) {
        arrOperation = ArrayList()
        addNumber(this.input!!.text.toString())
        if (this.input!!.text.toString()) arrNumber!![0] = -arrNumber!![0]
        val cArray = input.toCharArray()
        git remote add origin https://github.com/khanh290/kh-nh.git
        git branch -M main
                git push -u origin main   var i = 1
        while (i < cArray.size) {
            when (cArray[i]) {
                '+', '-' -> arrOperation!!.add(cArray[i].toString() + "")
                'x', '/' -> {
                    arrOperation!!.add(cArray[i].toString() + "")
                    if (i < cArray.size - 1) if (cArray[i + 1] == '-' && i + 1 < cArray.size - 1) {
                        arrNumber!![arrOperation!!.size] = -arrNumber!![arrOperation!!.size]
                        i++
                    }
                }
                else -> {}
            }
            i++
        }
    }

    fun addNumber(stringInput: String?) {
        arrNumber = ArrayList()
        val regex = Pattern.compile("(\\d+(?:\\.\\d+)?)")
        val matcher = regex.matcher(stringInput)
        while (matcher.find()) {
            arrNumber!!.add(java.lang.Double.valueOf(Objects.requireNonNull(matcher.group(1))))
        }
    }

    @SuppressLint("SetTextI18n")
    fun Result() {
        val df = DecimalFormat("###.#######")
        var result: Double
        addOperation(input!!.text.toString())
        arrNumber!!.size
        if (arrOperation!!.size > arrNumber!!.size) {
            output!!.text = "Input error!!"
        } else {
            arrOperation!!.size
            run {
                var i = 0
                while (i < arrNumber!!.size -1) {
                    when (arrOperation!![i]) {
                        "x" -> {
                            arrNumber!![i] = arrNumber!![i] * arrNumber!![i + 1]
                            arrNumber!!.removeAt(i + 1)
                            arrOperation!!.removeAt(i)
                            i--
                        }
                        "/" -> {
                            arrNumber!![i] = arrNumber!![i] / arrNumber!![i + 1]
                            arrNumber!!.removeAt(i + 1)
                            arrOperation!!.removeAt(i)
                            i--
                        }
                        else -> {}
                    }
                    i++
                }
            }
            result = arrNumber!![0]
            for (i in 0 until arrNumber!!.size - 1) {
                when (arrOperation!![i]) {
                    "+" -> result = result + arrNumber!![i + 1]
                    "-" -> result = result - arrNumber!![i + 1]
                    else -> {}
                }
            }
            output!!.text = df.format(result) + ""
        }
    }

    fun AnhXa() {
        input = findViewById<View>(R.id.iptemp) as TextView
        output = findViewById<View>(R.id.output) as TextView
        AC = findViewById<View>(R.id.AC) as Button
        cong = findViewById<View>(R.id.daucong) as Button
        tru = findViewById<View>(R.id.dautru) as Button
        nhan = findViewById<View>(R.id.phepnhan) as Button
        chia = findViewById<View>(R.id.phepchia) as Button
        result = findViewById<View>(R.id.result) as Button
        num0 = findViewById<View>(R.id.num0) as Button
        num1 = findViewById<View>(R.id.num1) as Button
        num2 = findViewById<View>(R.id.num2) as Button
        num3 = findViewById<View>(R.id.num3) as Button
        num4 = findViewById<View>(R.id.num4) as Button
        num5 = findViewById<View>(R.id.num5) as Button
        num6 = findViewById<View>(R.id.num6) as Button
        num7 = findViewById<View>(R.id.num7) as Button
        num8 = findViewById<View>(R.id.num8) as Button
        num9 = findViewById<View>(R.id.num9) as Button
        iptemp = findViewById<View>(R.id.iptemp) as TextView
    }
}