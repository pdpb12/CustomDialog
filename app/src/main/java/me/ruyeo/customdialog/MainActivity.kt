package me.ruyeo.customdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "dsa", Toast.LENGTH_SHORT).show()
    }

    override fun onBackPressed() {
        val dialog = ExitDialog("Do yo want to exit!!!")
        dialog.onItemClick = {
            finish()
        }
        dialog.show(supportFragmentManager,"something")
    }

    private fun initViews(){
        Log.d("TAG", "initViews: assalom")
    }
}