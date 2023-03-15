package com.example.phisics

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.result)
        val text1: EditText = findViewById(R.id.num1)
        val text2: EditText = findViewById(R.id.num2)
        val resultTV: TextView = findViewById(R.id.resultview)
        var flag: String = "current"
        val spinnerVal: Spinner = findViewById(R.id.spinner)
        var options = arrayOf("current", "voltage")
        spinnerVal.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        button.setOnClickListener {
            var x: Float = text1.text.toString().toFloat();
            var y: Float = text2.text.toString().toFloat();
            if (flag == "current"){
                resultTV.text = divide(x,y).toString();
            }

            else{
                resultTV.text = multiply(x,y).toString();
            }


        }
    }
}


public fun divide(x:Float,y:Float):Float
{
    return x/y;
}
public fun multiply(x:Float,y:Float):Float
{
    return x*y;
}