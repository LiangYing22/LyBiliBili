package com.innup.lybilibili.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.innup.lybilibili.R
import com.innup.lybilibili.utils.MathUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
//        findViewById<TextView>(R.id.sample_text).text = MathUtil.Add(2 , 3).toString()
        findViewById<TextView>(R.id.sample_text).setOnClickListener {
            val intent = Intent(this, BiliBiliMainActivity::class.java)
            startActivity(intent)
        }
    }

//    /**
//     * A native method that is implemented by the 'native-lib' native library,
//     * which is packaged with this application.
//     */
//    external fun stringFromJNI(): String
//
//    companion object {
//        // Used to load the 'native-lib' library on application startup.
//        init {
//            System.loadLibrary("native-lib")
//        }
//    }
}