package com.dipanshusharmaapp.myapplication3.ui.theme

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dipanshusharmaapp.myapplication3.R

class dialog_alert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dialog_alert)

        val btn : Button = findViewById(R.id.btn1)
        btn.setOnClickListener {

            val dialog = AlertDialog.Builder(this)


            dialog.setTitle("Delete Files")
            dialog.setMessage("Are you sure you want to delete these files?")
            dialog.setIcon(R.drawable.baseline_delete_24)


            dialog.setPositiveButton("Yes"){dialogInterface, which ->
                Toast.makeText(this, "Files Deleted", Toast.LENGTH_SHORT).show()

            }

            dialog.setNegativeButton("No"){dialogInterface, which ->
                Toast.makeText(this, "Files not Deleted", Toast.LENGTH_SHORT).show()
            }

            dialog.setNeutralButton("Cancel"){dialogInterface, which ->
                Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show()
            }

            val alertdialog : AlertDialog = dialog.create()
            alertdialog.setCancelable(false) // if you want to prevent the dialog from closing when clicked outside anywhere on screen
            alertdialog.show()
        }

    }
}