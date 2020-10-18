package com.example.eightalgorithms.AlgorithmUtils;

/**
 * 从小到大排序
 */
public class BubbleSortUtil {
    public static void sort(int arr[]) {
        int temp;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            //当一次排序过程中都没有发生数值交换，说明已经排好序。直接退出
            if (!flag) {
                break;
            } else {
                flag = false;
            }
        }
    }
}
