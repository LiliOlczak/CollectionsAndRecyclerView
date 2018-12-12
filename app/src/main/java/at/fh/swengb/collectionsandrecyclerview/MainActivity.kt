package at.fh.swengb.collectionsandrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("Student","${list[2].name}")

        Log.i("Student", "${mutableList[2].name}")

        mutableList.add(Student("Tyrion", 28))

        for(studentname in mutableList){
            Log.i("Student", "${studentname.name}")

        }

        for(studentname in set) {
            Log.i("Student", "${studentname.name}")
        }

        mutableSet.add(Student("Tux", 2))
        mutableSet.add(Student("Schnittlauch", 4))

        for(studentname in mutableSet) {
            Log.i("Student", "${studentname.name}")
        }

        for(studentname in mutableSet) { if (studentname.name == "Rob")
            Log.i("Student", "${studentname.name}")
        }

        for ((key, value) in studentMap) {
            for (studentname in value) {
                Log.i("Student", "${key},${studentname.name},${studentname.currentSemester}")
            }
        }


        val newStudentMap = studentMap.toMutableMap()
        newStudentMap.put("IMA16",ima16List)

    }

    val list = listOf<Student>(
        Student("Rob", 3),
        Student("George", 2),
        Student("Gusti", 1),
        Student("Lili", 3),
        Student("Joe", 3)
    )

    val mutableList = mutableListOf<Student>(
        Student("Rob", 3),
        Student("George", 2),
        Student("Friedrich", 1),
        Student("Lili", 3),
        Student("Joe", 3)
    )


    val set = setOf<Student>(
    Student("Rob", 3),
    Student("Lili", 3),
    Student("Friedrich", 1),
    Student("Lili", 3),
    Student("Joe", 3)
    )

    val mutableSet = mutableSetOf<Student>(
        Student("Rob", 3),
        Student("Tux", 2),
        Student("Friedrich", 1),
        Student("Lili", 3),
        Student("Joe", 3)
    )


    val ima18List = listOf(Student("Tyrion", 1), Student("Jon", 1))
    val ima17List = mutableListOf(Student("Sansa", 3), Student("Arya", 3), Student("Bran", 3))
    val studentMap = mapOf<String, List<Student>>("IMA18" to ima18List, "IMA17" to ima17List)


    val ima16List = listOf(Student("Brot", 3),Student("Avocadomann", 4))




}
