package com.example.eightalgorithms

import com.example.eightalgorithms.AlgorithmUtils.BubbleSortUtil
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val arr = IntArray(80000)
    for (i in 0..79999) {
        arr[i] = (Math.random() * 80000).toInt()
    }
    val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    println("排序前：" + sdf.format(Date()))
    BubbleSortUtil.sort(arr)
    println("排序前：" + sdf.format(Date()))
//    println("排序后：${arr.toList()}")
}