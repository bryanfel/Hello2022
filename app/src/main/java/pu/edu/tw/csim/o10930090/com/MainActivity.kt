package pu.edu.tw.csim.o10930090.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Hello tcyang"

        un TestDEV(){var txv:TextView = findViewById<TextView>(R.id.txv)
            txv.text = "Dev分支"

            fun TestMaster(){var txv:TextView = findViewById<TextView>(R.id.txv)
                txv.text = "Master分支"

    }
}