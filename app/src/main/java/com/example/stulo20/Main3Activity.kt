package com.example.stulo20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main_two.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_three)

        val entry = findViewById<TextView>(R.id.entry)
        val brutto = findViewById<TextView>(R.id.brutto)
        val netto = findViewById<TextView>(R.id.netto)

        //Mit der Methode getStringExtra werden die Daten aus dem empfangenen Intent herausgelesen.
        val name = intent.getStringExtra("Name")
        val stunden = intent.getStringExtra("Stunden")
        val lohn = intent.getStringExtra("Lohn")
        val steuer = intent.getStringExtra("Steuer")
        val sum = intent.getStringExtra("Brutto")
        val kalender = intent.getStringExtra("Datum")
        val sum_2 = intent.getStringExtra("Netto")

        //Die Daten werden im drei TextView angezeigt
        entry.text = "Name des Arbeitgebers: " + name + "\nStundenanzahl: " + stunden +
                "\nStundenlohn: " + lohn + "\nSteuerklasse: " + steuer + "\nDatum: " + kalender

        brutto.text = "\nBRUTTO: " + sum

        netto.text = "\nNETTO: " + sum_2
    }
}
