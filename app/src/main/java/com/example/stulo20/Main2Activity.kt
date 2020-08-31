package com.example.stulo20

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main_two.*
import kotlinx.android.synthetic.main.activity_main_two.view.*
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStreamReader
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_two)

        val brutto_netto = findViewById<Button>(R.id.brutto_netto)
        val save = findViewById<Button>(R.id.save)
        val load = findViewById<Button>(R.id.load)

        //Die Funktion wird mit Klick auf Button ausgeführt
        brutto_netto.setOnClickListener{
            show_netto()
        }
        save.setOnClickListener{
            save_data()
        }
        load.setOnClickListener{
            load_data()
        }
    }
    private fun show_netto() {
        //Zuweisung von Id der Variablen
        val name_of_employer = findViewById<EditText>(R.id.name_of_employer)
        val hours = findViewById<EditText>(R.id.hours)
        val salary = findViewById<EditText>(R.id.salary)
        val tax = findViewById<EditText>(R.id.tax)
        val calendar = findViewById<CalendarView>(R.id.calendar)

        //Umwandlung von Daten aus Feldern in String
        val name = name_of_employer.text.toString()
        val stunden = hours.text.toString()
        val lohn = salary.text.toString()
        val steuer = tax.text.toString()
        val kalender = calendar.date.toString()

        //Damit das Datum korrekt angezeigt wird, muss man in das richtige Format umwandeln
        //Mit SimpleDateFormat wird das Format erstellt
        val format = SimpleDateFormat("dd/MM/yyyy")
        //
        val kalender_format = format.format(Date(calendar.date))

        //Die Eigabefelder müssen ausgefüllt sein
        if (name > "" && stunden > "" && lohn > "" && steuer > "") {
            //Umwandlung von String in Float
            val a = stunden.toFloat()
            val b = lohn.toFloat()
            val c = steuer.toInt()

            //Berechnung von Brutto
            if (c == 1) {
                val sum = a * b
                //Berechnung von Netto
                val sum_: Float = (sum * 20) / 100
                val sum__: Float = sum - sum_

                //Umwandlung in String
                val sum_string = sum.toString()
                val sum__string = sum__.toString()

                //Mit intent wird dritte Activity aufgerufen
                val intent = Intent(this, Main3Activity::class.java)
                //mit putExtra werden die Daten als Extra im Intent abgelegt
                intent.putExtra("Name", name)
                intent.putExtra("Stunden", stunden)
                intent.putExtra("Lohn", lohn)
                intent.putExtra("Steuer", steuer)
                intent.putExtra("Brutto", sum_string)
                intent.putExtra("Netto", sum__string)
                intent.putExtra("Datum", kalender_format)
                startActivity(intent)
            } else if (c == 2) {
                val sum = a * b
                val sum_: Float = (sum * 22) / 100
                val sum__: Float = sum - sum_

                //Umwandlung in String
                val sum_string = sum.toString()
                val sum__string = sum__.toString()
                //Mit intent wird dritte Activity aufgerufen
                val intent = Intent(this, Main3Activity::class.java)
                intent.putExtra("Name", name)//mit putExtra werden die Daten als Extra im Intent abgelegt
                intent.putExtra("Stunden", stunden)
                intent.putExtra("Lohn", lohn)
                intent.putExtra("Steuer", steuer)
                intent.putExtra("Brutto", sum_string)
                intent.putExtra("Netto", sum__string)
                intent.putExtra("Datum", kalender_format)
                startActivity(intent)
            } else if (c == 3) {
                val sum = a * b
                val sum_: Float = (sum * 23) / 100
                val sum__: Float = sum - sum_

                //Umwandlung in String
                val sum_string = sum.toString()
                val sum__string = sum__.toString()
                //Mit intent wird dritte Activity aufgerufen
                val intent = Intent(this, Main3Activity::class.java)
                intent.putExtra("Name", name)//mit putExtra werden die Daten als Extra im Intent abgelegt
                intent.putExtra("Stunden", stunden)
                intent.putExtra("Lohn", lohn)
                intent.putExtra("Steuer", steuer)
                intent.putExtra("Brutto", sum_string)
                intent.putExtra("Netto", sum__string)
                intent.putExtra("Datum", kalender_format)
                startActivity(intent)
            } else if (c == 4) {
                val sum = a * b
                val sum_: Float = (sum * 25) / 100
                val sum__: Float = sum - sum_

                //Umwandlung in String
                val sum_string = sum.toString()
                val sum__string = sum__.toString()
                //Mit intent wird dritte Activity aufgerufen
                val intent = Intent(this, Main3Activity::class.java)
                intent.putExtra("Name", name)//mit putExtra werden die Daten als Extra im Intent abgelegt
                intent.putExtra("Stunden", stunden)
                intent.putExtra("Lohn", lohn)
                intent.putExtra("Steuer", steuer)
                intent.putExtra("Brutto", sum_string)
                intent.putExtra("Netto", sum__string)
                intent.putExtra("Datum", kalender_format)
                startActivity(intent)
            } else if (c == 5) {
                val sum = a * b
                val sum_: Float = (sum * 28) / 100
                val sum__: Float = sum - sum_

                //Umwandlung in String
                val sum_string = sum.toString()
                val sum__string = sum__.toString()
                //Mit intent wird dritte Activity aufgerufen
                val intent = Intent(this, Main3Activity::class.java)
                intent.putExtra("Name", name)//mit putExtra werden die Daten als Extra im Intent abgelegt
                intent.putExtra("Stunden", stunden)
                intent.putExtra("Lohn", lohn)
                intent.putExtra("Steuer", steuer)
                intent.putExtra("Brutto", sum_string)
                intent.putExtra("Netto", sum__string)
                intent.putExtra("Datum", kalender_format)
                startActivity(intent)
            } else if (c == 6) {
                val sum = a * b
                val sum_: Float = (sum * 30) / 100
                val sum__: Float = sum - sum_

                //Umwandlung in String
                val sum_string = sum.toString()
                val sum__string = sum__.toString()

                //Mit intent wird dritte Activity aufgerufen
                val intent = Intent(this, Main3Activity::class.java)
                intent.putExtra("Name", name)//mit putExtra werden die Daten als Extra im Intent abgelegt
                intent.putExtra("Stunden", stunden)
                intent.putExtra("Lohn", lohn)
                intent.putExtra("Steuer", steuer)
                intent.putExtra("Brutto", sum_string)
                intent.putExtra("Netto", sum__string)
                intent.putExtra("Datum", kalender_format)
                startActivity(intent)
            } else if (c == 7) {
                val sum = a * b
                val sum_: Float = (sum * 31) / 100
                val sum__: Float = sum - sum_

                //Umwandlung in String
                val sum_string = sum.toString()
                val sum__string = sum__.toString()

                //Mit intent wird dritte Activity aufgerufen
                val intent = Intent(this, Main3Activity::class.java)
                intent.putExtra("Name", name)//mit putExtra werden die Daten als Extra im Intent abgelegt
                intent.putExtra("Stunden", stunden)
                intent.putExtra("Lohn", lohn)
                intent.putExtra("Steuer", steuer)
                intent.putExtra("Brutto", sum_string)
                intent.putExtra("Netto", sum__string)
                intent.putExtra("Datum", kalender_format)
                startActivity(intent)
            } else {
                Toast.makeText(this, "FALSCHE STEUERKLASSE!", Toast.LENGTH_LONG).show()
            }
        }else{
            Toast.makeText(this, "KEINE EINGABE!", Toast.LENGTH_LONG).show()
        }
    }
    private fun save_data(){
        val name_of_employer = findViewById<EditText>(R.id.name_of_employer)
        val hours = findViewById<EditText>(R.id.hours)
        val salary = findViewById<EditText>(R.id.salary)
        val tax = findViewById<EditText>(R.id.tax)

        val name = name_of_employer.text.toString()
        val stunden = hours.text.toString()
        val lohn = salary.text.toString()
        val steuer = tax.text.toString()
        //Mit FileOutputStream werden die Daten in File abgelegt
        val fileOutputStream: FileOutputStream
        val fileOutputStream_1: FileOutputStream
        val fileOutputStream_2: FileOutputStream
        val fileOutputStream_3: FileOutputStream
        if (name > "" && stunden > "" && lohn > "" && steuer > "") {
            try {
                //Mit Mode_Private haben andere Apps keinen Zugriff zu diesem File
                //Mit openFileOutput wird die Datei geöffnet
                fileOutputStream = openFileOutput("name.txt", Context.MODE_PRIVATE)
                fileOutputStream_1 = openFileOutput("stunden.txt", Context.MODE_PRIVATE)
                fileOutputStream_2 = openFileOutput("lohn.txt", Context.MODE_PRIVATE)
                fileOutputStream_3 = openFileOutput("steuer.txt", Context.MODE_PRIVATE)
                //Mit Methode write wird der bereits im Feld eingegebene Text gespeichert
                fileOutputStream.write(name.toByteArray())
                fileOutputStream_1.write(stunden.toByteArray())
                fileOutputStream_2.write(lohn.toByteArray())
                fileOutputStream_3.write(steuer.toByteArray())
                //Mit setText wird der Text im Eingabefeld entfernt
                name_of_employer.setText("")
                hours.setText("")
                salary.setText("")
                tax.setText("")
            } catch (e: Exception) {
                e.printStackTrace()
            }//Das zeigt, dass die Eingabe gespeichert ist
            Toast.makeText(this, "EINGABE IST GESPEICHERT!", Toast.LENGTH_LONG).show()
        } else {
            //Das zeigt, dass in die Eingabefeld nichts eingegeben ist
            Toast.makeText(this, "KEINE EINGABE!", Toast.LENGTH_LONG).show()
        }
    }
    private fun load_data(){
        val name_of_employer = findViewById<EditText>(R.id.name_of_employer)
        val hours= findViewById<EditText>(R.id.hours)
        val salary = findViewById<EditText>(R.id.salary)
        val tax = findViewById<EditText>(R.id.tax)

        var fileInputStream: FileInputStream? = null
        var fileInputStream_1: FileInputStream? = null
        var fileInputStream_2: FileInputStream? = null
        var fileInputStream_3: FileInputStream? = null
        //Mit fileInputStream wird die vorher gespeicherte Datei geöffnet.
        fileInputStream = openFileInput("name.txt")
        fileInputStream_1 = openFileInput("stunden.txt")
        fileInputStream_2 = openFileInput("lohn.txt")
        fileInputStream_3 = openFileInput("steuer.txt")
        //Mit inputStreamReader wird der Text aus dem File genommen
        val inputStreamReader: InputStreamReader = InputStreamReader(fileInputStream)
        val inputStreamReader_1: InputStreamReader = InputStreamReader(fileInputStream_1)
        val inputStreamReader_2: InputStreamReader = InputStreamReader(fileInputStream_2)
        val inputStreamReader_3: InputStreamReader = InputStreamReader(fileInputStream_3)
        //Mit bufferedReader wird der Text aus dem File ausgelesen
        val bufferedReader: BufferedReader = BufferedReader(inputStreamReader)
        val bufferedReader_1: BufferedReader = BufferedReader(inputStreamReader_1)
        val bufferedReader_2: BufferedReader = BufferedReader(inputStreamReader_2)
        val bufferedReader_3: BufferedReader = BufferedReader(inputStreamReader_3)
        //Mit StringBuilder werden die leere Objekte erstellt, um diese später auszufüllen
        val stringBuilder: StringBuilder = StringBuilder()
        val stringBuilder_1: StringBuilder = StringBuilder()
        val stringBuilder_2: StringBuilder = StringBuilder()
        val stringBuilder_3: StringBuilder = StringBuilder()
        var text: String? = null
        var text_1: String? = null
        var text_2: String? = null
        var text_3: String? = null
        //in text wird eine Zeile des Textes geschrieben, solange diese Zeile nicht gleich null ist
        while ({ text = bufferedReader.readLine(); text }() != null) {
            //in StringBuilder mit append werden die Texte platziert
            stringBuilder.append(text)
        }
        while ({ text_1 = bufferedReader_1.readLine(); text_1 }() != null) {
            stringBuilder_1.append(text_1)
        }
        while ({ text_2 = bufferedReader_2.readLine(); text_2 }() != null) {
            stringBuilder_2.append(text_2)
        }
        while ({ text_3 = bufferedReader_3.readLine(); text_3 }() != null) {
            stringBuilder_3.append(text_3)
        }
        //Mit setText wird der Text aus dem File im Eigabefeld angezeigt, nachdem er in String umgewandelt ist
        name_of_employer.setText(stringBuilder.toString())
        hours.setText(stringBuilder_1.toString())
        salary.setText(stringBuilder_2.toString())
        tax.setText(stringBuilder_3.toString())
    }
}
