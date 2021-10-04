package top.qiyi.java.basic.array;

import lombok.extern.slf4j.Slf4j;

/**
 * @program：JavaStudy
 * @description: 课堂练习
 * @author: qiyi
 * <p>
 * create: 2021-10-04 09:39
 **/
@Slf4j
public class ClassDemo {
    private static final int ARRAY_SIZE = 10;


    public static void main(String[] args) {
        int[][] arr = {
                {23, 1, 4}, {34, 5, 6}
        };
        int len =arr.length;
        int sum=0;
        for(int i=0;i<len;i++){
            for (int j=0; j<arr[i].length;j++){
                sum +=arr[i][j];
            }
    }
System.out.println (sum);
}

}
