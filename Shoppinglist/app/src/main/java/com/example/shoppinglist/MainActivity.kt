package com.example.shoppinglist

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import com.example.shoppinglist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lookup the RecyclerView in activity layout
        val itemsRv = findViewById<>(R.id.itemsRv)

        // link the item name to its edit text
        val itemname = findViewById<EditText>(R.id.item_name)

        // link the item price to its edit text
        val itemprice = findViewById<EditText>(R.id.item_price)
        // button to add item to recyclerview
        val button = findViewById<Button>(R.id.add_button).button.setOnClickListener {
            itemname=
            itemprice=

            // Set layout manager to position the items

        }

    }
    itemsRv.layoutManager = LinearLayoutManager()

}
