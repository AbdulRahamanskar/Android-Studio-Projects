package com.example.demo

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val context:Activity, private val arrayList: ArrayList<DataClass>):
    ArrayAdapter<DataClass>(context,R.layout.item_design,arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater=LayoutInflater.from(context)
        val view=inflater.inflate(R.layout.item_design,null)
        val image=view.findViewById<CircleImageView>(R.id.profile_img)
        val name=view.findViewById<TextView>(R.id.tvName)
        val lstmsg=view.findViewById<TextView>(R.id.tVLastMsg)
        val lstmsgTime=view.findViewById<TextView>(R.id.tVLastMsgTime)

        name.text=arrayList[position].name
        lstmsg.text=arrayList[position].lastMsg
        lstmsgTime.text=arrayList[position].lstMsgTime
        image.setImageResource(arrayList[position].imgId)

        return view
    }
}