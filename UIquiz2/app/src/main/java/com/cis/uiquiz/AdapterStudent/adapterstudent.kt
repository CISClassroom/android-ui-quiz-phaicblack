package com.cis.uiquiz.AdapterStudent

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.cis.uiquiz.R
import com.cis.uiquiz.student.student


public class StudentAdapter(val mCtx: Context,
                            var resource:Int,
                            var items:List<student>)
    : ArrayAdapter<student>(mCtx,resource,items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //return super.getView(position, convertView, parent)
        val layout: LayoutInflater = LayoutInflater.from(mCtx)

        val v: View = layout.inflate(resource,null)
        val icon : ImageView = v.findViewById(R.id.imageView)
        val name : TextView = v.findViewById(R.id.textView)
        val id: TextView = v.findViewById(R.id.textView2)

        val studen:student = items[position]

        name.text = studen.name
        id.text = studen.id
        try {
            icon.setImageDrawable(mCtx.getDrawable(studen.icon))
        }
        catch (ex:Exception){

        }

        return v
    }
}
