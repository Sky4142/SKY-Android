package com.sky.assistant

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(28, 28, 28, 28)
            setBackgroundColor(Color.rgb(11, 18, 34))
        }

        val title = TextView(this).apply {
            text = "SKY"
            textSize = 38f
            setTextColor(Color.rgb(110, 157, 255))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Your Personal AI Assistant"
            textSize = 16f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val message = EditText(this).apply {
            hint = "Message SKY..."
            setTextColor(Color.WHITE)
            setHintTextColor(Color.LTGRAY)
        }

        val send = Button(this).apply {
            text = "Send"
            setOnClickListener {
                Toast.makeText(
                    this@MainActivity,
                    "SKY AI connection coming next!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(message)
        layout.addView(send)

        setContentView(layout)
    }
}