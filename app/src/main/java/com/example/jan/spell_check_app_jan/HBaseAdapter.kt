package com.example.jan.spell_check_app_jan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import android.widget.ImageButton


/**
* Created by JAN on 19. 3. 24.
*/

class HBaseAdapter(context: Context,item : Array<String>) : BaseAdapter(){
    private val mContext = context
    private val mItem = item

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        lateinit var viewHolder : ViewHolder
        var view = convertView
        if (view == null){
            viewHolder = ViewHolder()
            view = LayoutInflater.from(mContext).inflate(R.layout.listview_item,parent,false)
            //리스트뷰에 아이템 넣는 곳
//            viewHolder.textView = view.findViewById(R.id.textView)
            viewHolder.imgbtn = view.findViewById(R.id.button)
            viewHolder.imgbtn = view.findViewById(R.id.button1)
            viewHolder.textView = view.findViewById(R.id.left_time)
            viewHolder.textView= view.findViewById(R.id.left_time1)
            viewHolder.textView= view.findViewById(R.id.player_id)
            view.tag = viewHolder
            viewHolder.textView.text = mItem[position]
            return view
        }else{
            viewHolder = view.tag as ViewHolder
        }
        viewHolder.textView.text = mItem[position]
        return  view
    }

    override fun getItem(position: Int) = mItem[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getCount() = mItem.size

    inner class ViewHolder{
        lateinit var textView : TextView
        lateinit var button : Button
        lateinit var imgbtn : ImageButton
    }
}