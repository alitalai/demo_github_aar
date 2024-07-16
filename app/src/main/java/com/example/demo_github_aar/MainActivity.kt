package com.example.demo_github_aar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demo_sdk.add.Add
import com.example.demo_sdk.mainClass
import com.example.demo_sdk.subs.Subs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val lib = mainClass()

        Add().mathAdd(12,3)
        Subs().mathSub(12,3)
        lib.doAddThenSub(12,3)
    }
}