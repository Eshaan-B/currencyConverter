package com.example.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var inrValue: EditText
    lateinit var button: Button
    lateinit var usdValue: EditText
    lateinit var euroValue:EditText
    lateinit var dirhamValue: EditText
    lateinit var yenValue:EditText
    lateinit var yuanValue: EditText
    lateinit var hkdValue:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inrValue=findViewById(R.id.inrValue)
        button=findViewById(R.id.button)
        usdValue=findViewById(R.id.dollarField)
        euroValue=findViewById(R.id.euroField)
        dirhamValue=findViewById(R.id.dirhamField)
        yenValue=findViewById(R.id.yenField)
        yuanValue=findViewById(R.id.yuanField)
        hkdValue=findViewById(R.id.hkdField)
    }

    fun convert(view:View){
        var inr=inrValue.text.toString().toInt()
        var usd=inr*0.014
        var eur=inr*0.012
        var aed=inr*0.050
        var jpy=inr*1.151
        var yuan=inr*0.088
        var hkd=inr*0.11
        usdValue.setText(usd.toString())
        euroValue.setText(eur.toString())
        dirhamValue.setText(aed.toString())
        yenValue.setText(jpy.toString())
        yuanValue.setText(yuan.toString())
        hkdValue.setText(hkd.toString())
    }
}