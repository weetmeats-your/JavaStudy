package top.qiyi.java.basic.array;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

/**
 * @program：JavaStudy
 * @description: 课堂练习
 * @author: qiyi
 * <p>
 * create: 2021-10-04 09:39
 **/
@Slf4j


public class ClassDemo {
    public static void main(String[] args) {
        //1.声明并初始化数组
        int[][] arr = new int[10][];
        //因为行数为10，每列的元素个数不确定，所以需要使用第二维不确定的动态初始化
        //2.根据杨辉三角的构型，找出行与列的关系，并为第二维开辟列空间(给数组元素赋值)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
        }

        //3.使用嵌套for循环，遍历二维数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {    //外层数组元素个数
            for (int j = 0; j < arr[i].length; j++) {    //内层数组元素个数
                //3.1 第一行和第二行和每行的第一列和最后一列都是元素1
                if (i == 0 || i == 1 || j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + "\t");
                    //3.2 其余位置元素值为上一行元素的前一位和上一行元素的前一位的前一位相加而成
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                    System.out.print(arr[i][j] + "\t");
                }
            }
            //每一个内层循环结束，打印一层杨辉三角，追加换行
            System.out.println();
        }
    }
}





