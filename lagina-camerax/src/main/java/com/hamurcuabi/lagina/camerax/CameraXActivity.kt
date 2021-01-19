package com.hamurcuabi.lagina.camerax

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class CameraXActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camerax)
        findViewById<Button>(R.id.btnCapture).setOnClickListener {
            val intent=Intent(this, MainActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode === 1 && resultCode === RESULT_OK) {
            var test = data?.getStringExtra("CameraXFilePath");
              print(test);
        }
    }
}
