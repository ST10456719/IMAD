package za.ac.iie.weather

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import za.ac.iie.weather.R.*
import za.ac.iie.weather.R.id.*


class MainActivity3 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main3)

        val evTemp = findViewById<EditText>(R.id.evTemp)
        val tvConditions = findViewById<TextView>(R.id.tvConditions)
        val tvLocation = findViewById<TextView>(R.id.tvLocation)
        val btnGoBack = findViewById<Button>(R.id.btnGoBack)

        btnGoBack.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }



    }



}
