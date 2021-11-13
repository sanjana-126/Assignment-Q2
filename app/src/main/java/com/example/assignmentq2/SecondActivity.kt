package com.example.assignmentq2
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var fname: String? = intent.getStringExtra("fname")
        var lname: String? = intent.getStringExtra("lname")

        var textview: TextView = findViewById<TextView>(R.id.sTextview)
        textview.setText(fname + " " + lname + " your form is submitted successfully")
    }
}
