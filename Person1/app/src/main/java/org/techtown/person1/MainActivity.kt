package org.techtown.person1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createPersonButton.setOnClickListener {
            val name = input1.text.toString()
            val age= input2.text.toString().toInt()
            val address=input3.text.toString()

            val Person1 = Person(name, age, address)
            output1.text="사람 객체 만들어짐 : ${person1.name}"
        }
        createStudentButton.setOnClickListener {
            val name = input1.text.toString()
            val age= input2.text.toString().toInt()
            val address=input3.text.toString()

            val Student1 = Student(name, age, address)
            output1.text="학생 객체 만들어짐 : ${Student1.name}"
        }
    }
}