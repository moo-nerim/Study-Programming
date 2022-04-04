package org.techtown.person1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var person:Person? = null

    // 열거형
    enum class PersonType {
        PERSON, STUDENT // PERSON : 사람, STUDENT : 학생생
   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createPersonBtn.setOnClickListener {
//            val name = input1.text.toString().trim() // trim() -> 공백 제거
//            val age = input2.text.toString().toInt()
//            val address = input3.text.toString()
//
//            person = Person(name, age, address)

            makePerson(PersonType.PERSON)

        }

        createStudentBtn.setOnClickListener {
//            val name = input1.text.toString().trim() // trim() -> 공백 제거
//            val age = input2.text.toString().toInt()
//            val address = input3.text.toString()
//
//            person = Student(name, age, address)
//            output.text = "Create student : ${person?.name}"

            makePerson(PersonType.STUDENT)
        }
    }

    fun makePerson(type:PersonType) { // 열거형 전달
        val name = input1.text.toString().trim() // trim() -> 공백 제거
        val age = input2.text.toString().toInt()
        val address = input3.text.toString()

        when(type) {
            PersonType.PERSON-> {
                person = Person(name, age, address)
                output.text = "Create human : ${person?.name}"
                outputImage.setImageResource(R.drawable.human)

                person?.walk(output)
            }
            PersonType.STUDENT-> {
                person = Student(name, age, address)
                output.text = "Create student : ${person?.name}"
                outputImage.setImageResource(R.drawable.student)

                person?.walk(output)
            }
        }
    }
}