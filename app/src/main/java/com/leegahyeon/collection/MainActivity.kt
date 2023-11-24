package com.leegahyeon.collection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // List
        // 1. 값으로 컬렉션 생성
        var mutableList = mutableListOf("MON", "TUE", "WED")
        mutableList.add("THU")              //변수에 값 추가
        // 리스트에서 값 꺼내서 사용
        Log.d("Collection", "mutableList의 첫 번째 값은 ${mutableList.get(0)}입니다.")
        Log.d("Collection", "mutableList의 두 번째 값은 ${mutableList[1]}입니다.")

        // 2. 빈 컬렉션 생성
        // 생성
        var stringList = mutableListOf<String>()    // 문자열로 된 빈 컬렉션 생성
        // 값 추가
        stringList.add("월")
        stringList.add("화")
        stringList.add("수")
        // 수정(값 변경)
        stringList.set(1, "요일 변경")
        // 사용
        Log.d("Collection", "StringList에 입력된 두 번째 값은 ${stringList.get(1)}입니다.")
        // 삭제
        stringList.removeAt(1)    // 두 번째 값이 삭제됨
        Log.d("Collection", "stringList에 입력된 두 번째 값은 ${stringList.get(1)}입니다.")
        // 개수 출력
        Log.d("Collection", "stringList에는 ${stringList.size}개의 값이 있습니다.")




        // Set
        // 1. 셋 생성하고 값 추가
        var set = mutableSetOf<String>()
        set.add("MON")
        set.add("FEB")
        set.add("MAR")
        set.add("MON")    // 동일한 값은 입력되지 않음

        // 2. 전체 데이터 출력해보기
        Log.d("Collection", "Set 전체 출력 = ${set}")

        // 3. 특정 값 삭제
        set.remove("FEB")
        Log.d("Collection", "Set 전체 출력 = ${set}")




        // Map
        // 1. 맵 생성
        var map = mutableMapOf<String, String>()
        // 2. 값 넣기
        map.put("키1", "값1")
        map.put("키2", "값2")
        map.put("키3", "값3")
        // 3. 값 사용하기
        var variable = map.get("키2")
        Log.d("Collection", "키2의 값은 ${variable}입니다.")
        // 4. 값 수정하기
        map.put("키2", "수정")
        Log.d("Collection", "키2의 값은 ${map.get("키2")}입니다.")
        // 5. 값 삭제하기
        map.remove("키2")
        // 5.1 없는 값을 불러오면 null 값이 출력된다.
        Log.d("Collection", "키2의 값은 ${map.get("키2")}입니다.")
    }
}