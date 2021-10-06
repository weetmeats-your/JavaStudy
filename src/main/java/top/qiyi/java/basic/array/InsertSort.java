package top.qiyi.java.basic.array;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @program：JavaStudy
 * @description: 直接插入排序
 * @author: qiyi
 * <p>
 * create: 2021-10-05 19:35
 **/
@Slf4j
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {23, 1, 4, 5, 7,5};
        log.info("排序之前：{}",Arrays.toString(arr));
        //调用直接插入排序
        insertSort(arr);
        log.info("排序后：{}",Arrays.toString(arr ));
    }

    private static void insertSort(int[] arr) {
        //已排序数组的下标
        int j;
        //未排序数组的下标
        int t;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                //赋值给待排序元素
                t = arr[i];
                for (j = i - 1; j >= 0 && arr[j] > t; j--) {
                    //后面往前遍历，逐个和待排序的元素比较，如果已排序,元素较大则往后移
                    arr[j + 1] = arr[j];
                }
                //将待排序的元素插入到正确位置
                 arr[j + 1] = t;
            }
        }
    }
}
