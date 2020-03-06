package com.cis.uiquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.cis.uiquiz.AdapterStudent.StudentAdapter
import com.cis.uiquiz.student.student


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var students = mutableListOf<student>()

        students.add(student("นายกฤษฎา ท่าสะอาด","603410032-9",R.drawable.m))
        students.add(student("นายกัมพล โชติทอง","603410034-5",R.drawable.m))
        students.add(student("นายณัฐนนท์ ทาไธสง","603410041-8",R.drawable.m))
        students.add(student("นายนฤเบศร์ พระโรจน์","603410047-6",R.drawable.m))
        students.add(student("นายพรหมพัฒน์ ชาญโชคประเสริฐ","603410052-3",R.drawable.m))
        students.add(student("นายเมธาวี สารีผล","603410057-3",R.drawable.m))
        students.add(student("นายรัฐเขต สีเหลือง","603410059-9",R.drawable.m))
        students.add(student("นายรุ่งโรจน์ พลเยี่ยม","603410060-4",R.drawable.m))
        students.add(student("นายวิธาน วงษาบุตร","603410061-2",R.drawable.m))
        students.add(student("นางสาวศศิกร กอเสนาะรส","603410063-8",R.drawable.w))
        students.add(student("นางสาวอนันตยา โคตรศรี","603410070-1",R.drawable.w))
        students.add(student("นายอภิเดช นารอง","603410071-9",R.drawable.m))
        students.add(student("นายอุทัยพันธ์ เที่ยงโคตร","603410073-5",R.drawable.m))
        students.add(student("นางสาวพัชรี แอแป","603410155-3",R.drawable.w))
        students.add(student("นางสาวศศิธร พิมมะทา","603410156-1",R.drawable.w))


        var listview: ListView = findViewById(R.id.customlistview)

        listview.adapter = StudentAdapter(this,
            R.layout.listitem_student,students)

        listview.setOnItemClickListener { parent, view, position, id ->
            //Toast.makeText(this,position.toString(),Toast.LENGTH_SHORT).show()
            if(position==0){
                var i = Intent(this,m1::class.java)
                startActivity(i)
            }
            else if(position==1){
                var i = Intent(this,m2::class.java)
                startActivity(i)
            }
            else if(position==2){
                var i = Intent(this,m3::class.java)
                startActivity(i)
            }
            else if(position==3){
                var i = Intent(this,m4::class.java)
                startActivity(i)
            }
            else if(position==4){
                var i = Intent(this,m5::class.java)
                startActivity(i)
            }
            else if(position==5){
                var i = Intent(this,m6::class.java)
                startActivity(i)
            }
            else if(position==6){
                var i = Intent(this,m7::class.java)
                startActivity(i)
            }
            else if(position==7){
                var i = Intent(this,m8::class.java)
                startActivity(i)
            }
            else if(position==8){
                var i = Intent(this,m9::class.java)
                startActivity(i)
            }
            else if(position==9){
                var i = Intent(this,w10::class.java)
                startActivity(i)
            }
            else if(position==10){
                var i = Intent(this,w11::class.java)
                startActivity(i)
            }
            else if(position==11){
                var i = Intent(this,m12::class.java)
                startActivity(i)
            }
            else if(position==12){
                var i = Intent(this,m13::class.java)
                startActivity(i)
            }
            else if(position==13){
                var i = Intent(this,w14::class.java)
                startActivity(i)
            }
            else if(position==14){
                var i = Intent(this,w15::class.java)
                startActivity(i)
            }


        }
    }
}
