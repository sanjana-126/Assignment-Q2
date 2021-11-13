package com.example.assignmentq2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var fname: EditText
    lateinit var lname: EditText
    lateinit var checkbox1: CheckBox
    lateinit var checkbox2: CheckBox
    lateinit var checkbox3: CheckBox
    lateinit var checkbox4: CheckBox
    lateinit var radiobutton1: RadioButton
    lateinit var radiobutton2: RadioButton
    lateinit var radiobutton3: RadioButton
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fname = findViewById<EditText>(R.id.fname)
        lname = findViewById<EditText>(R.id.lname)
        button = findViewById<Button>(R.id.mSubmit)
        button.setOnClickListener {
            if(fname.text.toString() == "" || lname.text.toString() == "")
            {
                Toast.makeText(this@MainActivity, "Please enter valid details", Toast.LENGTH_SHORT).show()
            }
            else {
                var intent = Intent(this@MainActivity, SecondActivity::class.java)
                intent.putExtra("fname", fname.text.toString())
                intent.putExtra("lname", lname.text.toString())
                startActivity(intent)
            }
        }
    }
    fun isCBselected(view: android.view.View) {
        checkbox1 = findViewById<CheckBox>(R.id.checkbox1)
        checkbox2 = findViewById<CheckBox>(R.id.checkbox2)
        checkbox3 = findViewById<CheckBox>(R.id.checkbox3)
        checkbox4 = findViewById<CheckBox>(R.id.checkbox4)
        when(view.id){
            R.id.checkbox1 ->
                if(checkbox1.isChecked())
                    Toast.makeText(this@MainActivity, checkbox1.text.toString() + " is selected", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this@MainActivity, checkbox1.text.toString() + " is deselected", Toast.LENGTH_SHORT).show()
            R.id.checkbox2 ->
                if(checkbox2.isChecked())
                    Toast.makeText(this@MainActivity, checkbox2.text.toString() + " is selected", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this@MainActivity, checkbox2.text.toString() + " is deselected", Toast.LENGTH_SHORT).show()
            R.id.checkbox3 ->
                if(checkbox3.isChecked())
                    Toast.makeText(this@MainActivity, checkbox3.text.toString() + " is selected", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this@MainActivity, checkbox3.text.toString() + " is deselected", Toast.LENGTH_SHORT).show()
            R.id.checkbox4 ->
                if(checkbox4.isChecked())
                    Toast.makeText(this@MainActivity, checkbox4.text.toString() + " is selected", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this@MainActivity, checkbox4.text.toString() + " is deselected", Toast.LENGTH_SHORT).show()
        }
    }

    fun isRBselected(view: android.view.View) {
        radiobutton1 = findViewById<RadioButton>(R.id.radiobutton1)
        radiobutton2 = findViewById<RadioButton>(R.id.radiobutton2)
        radiobutton3 = findViewById<RadioButton>(R.id.radiobutton3)

        when(view.id){
            R.id.radiobutton1 ->
                Toast.makeText(this@MainActivity, radiobutton1.text.toString() + " is selected", Toast.LENGTH_SHORT).show()
            R.id.radiobutton2->
                Toast.makeText(this@MainActivity, radiobutton2.text.toString() + " is selected", Toast.LENGTH_SHORT).show()
            R.id.radiobutton3 ->
                Toast.makeText(this@MainActivity, radiobutton3.text.toString() + " is selected", Toast.LENGTH_SHORT).show()
        }
    }
}