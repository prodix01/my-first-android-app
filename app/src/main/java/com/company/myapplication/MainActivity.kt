package com.company.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatViewInflater

//메인화면
class MainActivity : AppCompatActivity() {


    //로그 변수정의
    val TAG: String = "log"


    //버튼이 클릭되었을때
    fun buttonClicked(view : View) {
        Log.d("log", "화면출력")

        //두번째 화면 불러오기
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)



    }


    //뷰가 생성되었을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //그릴 xml 파일을 연결 시켜준다 . 즉 설정한다.
        setContentView(R.layout.activity_main)

        //로그
        Log.d(TAG, "로그확인")

    }
}
