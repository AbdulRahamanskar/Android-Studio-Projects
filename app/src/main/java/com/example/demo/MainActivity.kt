package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView


class MainActivity : AppCompatActivity() {
    private lateinit var userArrayList:ArrayList<DataClass>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name= arrayOf("Dhoni","Virat","Rohit","Rahul","Arjun","Bumrah","Shami","Allu Arjun","Jr NTR","Ram Charan","SS Rajamouli","Mahesh Babu","Prabahas")
        val lstmsg= arrayOf("Definitely Not","Lets play","No worries im sending a long message to you","Happy days","Good bro","Hey...","Preparing...","Pushpa 2","I have to go","Hello","I'm in sets","Busy","Hi darling...")
        val lstmsgTime= arrayOf("7:00 PM", "8:00 AM","10:00 AM","00:05 AM","04:35 PM","09:35 PM","10:00 AM","05:00 PM","04:00 PM","03:30 PM","08:00 PM","02:00 PM","07:00 PM")
        val phoneNumbers= arrayOf("7777777777","1818181818","4545454545","0101010101","3636363636","9393939393","1111111111","1212121212","1515151515","7989798977","7273727372","7775777571","2131412131")
        val imgId= intArrayOf(R.drawable.dhoni,R.drawable.virat,R.drawable.rohit,R.drawable.rahul,R.drawable.arjun,R.drawable.bumrah,R.drawable.shami,R.drawable.alluarjun,R.drawable.jrntr,R.drawable.ramcharan,R.drawable.rajamouli,R.drawable.mahesh,R.drawable.prabahas)
        userArrayList=ArrayList()
        for (eachIndex in name.indices){
            val data=DataClass(name[eachIndex],lstmsg[eachIndex],lstmsgTime[eachIndex],
                phoneNumbers[eachIndex],imgId[eachIndex])
            userArrayList.add(data)
        }
        val listView =findViewById<ListView>(R.id.listview)
        listView.isClickable=true
        listView.adapter=MyAdapter(this,userArrayList)
    }

}