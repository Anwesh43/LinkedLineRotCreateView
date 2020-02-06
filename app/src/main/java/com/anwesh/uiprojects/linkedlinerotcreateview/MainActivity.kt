package com.anwesh.uiprojects.linkedlinerotcreateview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.linerotcreateview.LineCreateRotStepView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LineCreateRotStepView.create(this)
    }
}
