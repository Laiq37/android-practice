package com.example.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmation.adapter.AffirmationAdapter
import com.example.affirmation.data.DataSource
import com.example.affirmation.model.Affirmation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataSet : List<Affirmation> = DataSource().loadAffirmation()

        val recyclerView : RecyclerView = findViewById(R.id.recycler_view)

        recyclerView.adapter = AffirmationAdapter(this, dataSet)

        recyclerView.setHasFixedSize(true)
    }
}