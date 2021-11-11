package com.example.mycalculatorapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var process = ""

    var checkBracket = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnClear(v: View) {
        findViewById<TextView>(R.id.tvInput).text = ""
        findViewById<TextView>(R.id.tvOutput).text = ""
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btn0(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = process + "0"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btn1(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = process + "1"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btn2(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = process + "2"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btn3(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = process + "3"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btn4(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = process + "4"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btn5(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = process + "5"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btn6(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = process + "6"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btn7(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = process + "7"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btn8(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = process + "8"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btn9(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = process + "9"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btnPlus(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = "$process+"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btnMinus(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = "$process-"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btnMultiply(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = "$process*"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btnDivision(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = "$process/"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btnPercent(v: View) {
        process = findViewById<TextView>(R.id.tvInput).text.toString()
        findViewById<TextView>(R.id.tvInput).text = "$process%"
    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btnBracket(v: View) {

        if (checkBracket) {
            process = findViewById<TextView>(R.id.tvInput).text.toString()
            findViewById<TextView>(R.id.tvInput).text = "$process)"
            checkBracket = false
        } else {
            process = findViewById<TextView>(R.id.tvInput).text.toString()
            findViewById<TextView>(R.id.tvInput).text = "$process("
            checkBracket = true
        }

    }

    @SuppressLint("CutPasteId", "SetTextI18n")
    fun btnEqual(v: View) {

    }
}