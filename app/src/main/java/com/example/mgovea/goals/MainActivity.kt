package com.example.mgovea.goals

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        element1.setOnClickListener({ v -> v.setBackgroundResource(R.drawable.bg_item_click) })

        element2.setOnClickListener({ v -> v.setBackgroundResource(R.drawable.bg_item_click) })

        element3.setOnClickListener({ v -> v.setBackgroundResource(R.drawable.bg_item_click) })

        btn_cancel.setOnClickListener { element1.setBackgroundResource(R.drawable.bg_item)
            element2.setBackgroundResource(R.drawable.bg_item)
            element3.setBackgroundResource(R.drawable.bg_item) }
    }
}
