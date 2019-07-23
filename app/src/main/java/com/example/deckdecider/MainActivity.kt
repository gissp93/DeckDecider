package com.example.deckdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val deckList = arrayListOf("Prossh", "Mayael","Aminatou","Brudiclad", "Xenagos","Trostani","Atraxa", "Gisela")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomDeck = random.nextInt(deckList.count())
            decidedTxt.text = deckList[randomDeck]
        }

        addDeckBtn.setOnClickListener {
            val newDeck = addDeckTxt.text.toString()
            deckList.add(newDeck)
            addDeckTxt.text.clear()
        }


    }
}
