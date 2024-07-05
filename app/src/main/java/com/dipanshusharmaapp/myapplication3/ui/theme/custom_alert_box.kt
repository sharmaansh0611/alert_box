package com.dipanshusharmaapp.myapplication3.ui.theme

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import cn.pedant.SweetAlert.SweetAlertDialog
import com.dipanshusharmaapp.myapplication3.R

class custom_alert_box : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_alert_box)

        val btn1:Button = findViewById(R.id.button)
        val btn2:Button = findViewById(R.id.button2)
        val btn3:Button = findViewById(R.id.button3)

        btn1.setOnClickListener {
            SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Success Sweet Alert")
                .setContentText("This is a success sweet alert")
                .show()
        }

        btn2.setOnClickListener {
            SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Warning Sweet Alert")
                .setContentText("This is a warning sweet alert")
                .show()
        }

        btn3.setOnClickListener {
            SweetAlertDialog(this, SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Error Sweet Alert")
                .setContentText("This is an error sweet alert")
                .show()
        }

    }
}