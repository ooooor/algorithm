package org.example;

import java.util.Arrays;

/**
 * @Description 冒泡排序
 * @Author ooooor
 * @Date 2019-04-28 16:10
 **/
public class BubbleSort {

    // 冒泡排序，a 表示数组，n 表示数组大小
    private static void bubbleSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j+1]) { // 交换
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;  // 表示有数据交换
                }
            }
            if (!flag) break;  // 没有数据交换，提前退出
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 1, 5, 6, 3, 2};
        bubbleSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }

}
