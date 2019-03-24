package com.example.jan.spell_check_app_jan

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
/*
1. 일단 메인에 리스트뷰를 추가할 수 있는 기능이 필요하다
2. 리스트뷰에 버튼이 있고 타이머 기능이 필요함
 */

/*
코틀린의 특징
1. 스칼라의 특징
2. effective java 의 룰을 따른다
 */
class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item = Array(5,{ i -> "" })

        //baseAdapter로 생성
        listView.adapter = HBaseAdapter(this,item)

    }
}
