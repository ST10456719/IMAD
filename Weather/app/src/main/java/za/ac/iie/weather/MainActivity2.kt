package za.ac.iie.weather

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.Days
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.FRIDAY
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.MONDAY
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.SATURDAY
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.SUNDAY
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.THURSDAY
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.TUESDAY
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.WEDNESDAY
import kotlin.math.E

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main2)


            val tvLocation = findViewById<TextView>(R.id.tvLocation)
            val tvConditions = findViewById<TextView>(R.id.tvConditions)
            val evTemp = findViewById<EditText>(R.id.evTemp)
            val btnEnter = findViewById<Button>(R.id.btnEnter)
            val btnBack = findViewById<Button>(R.id.btnBack)
            val btnClear = findViewById<Button>(R.id.btnClear)

            btnEnter.setOnClickListener {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)

                if (tvLocation.text.toString().isEmpty() || tvConditions.text.toString()
                        .isEmpty() ||
                    evTemp.text.toString().isEmpty()
                )

                    Toast.makeText(
                        this,
                        "Please enter details to view the current weather conditions",
                        Toast.LENGTH_SHORT
                    ).show()
            }
            btnBack.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

            btnClear.setOnClickListener {
                btnClear.toString()
            }
            data class Weather(
                val location: String,
                val conditions: String,
                val temperature: String,
                val weather: List<Weather>
            )

            data class Main(
                val temperature: Double
            )

            val ia = tvLocation
            val ib = tvConditions
            val ic = evTemp

            var arrayList = arrayListOf<String>()

            arrayList == (tvLocation)
            arrayList.add(MONDAY)
            arrayList.add(TUESDAY)
            arrayList.add(WEDNESDAY)
            arrayList.add(THURSDAY)
            arrayList.add(FRIDAY)
            arrayList.add(SATURDAY)
            arrayList.add(SUNDAY)


            arrayList == (evTemp)
            arrayList.add(12, 24.toString())
            arrayList.add(8, 29.toString())
            arrayList.add(11, 14.toString())
            arrayList.add(7, 27.toString())
            arrayList.add(5, 22.toString())
            arrayList.add(2, 20.toString())
            arrayList.add(1, 18.toString())

            arrayList == (tvConditions)
            arrayList.add("Sunny")
            arrayList.add("Sunny")
            arrayList.add("Cloudy")
            arrayList.add("Clear Skies")
            arrayList.add("Sunny")
            arrayList.add("Cloudy")
            arrayList.add("Cloudy")

            if (true) {
                evTemp.text.toString()
            } else
                Toast.makeText(this, "Please enter temperature", Toast.LENGTH_SHORT).show()
        }

    }

