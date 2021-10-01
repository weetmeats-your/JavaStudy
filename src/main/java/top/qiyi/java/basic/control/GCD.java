package top.qiyi.java.basic.control;

import lombok.extern.slf4j.Slf4j;

/**
 * @program：JavaStudy
 * @description: 最大公约数记为 GCD (greatest common divisor)
 * 欧几里德算法，又称辗转相除法
 * @author: qiyi
 * <p>
 * create: 2021-10-01 22:19
 **/
@Slf4j
public class GCD {
    public static void main(String[] args) {
        int resultByLoop = getGCDByLoop(12, 36);
        log.info("12和36的最大公约数为：{}", resultByLoop);
        int resultByRecursion = getGCDByRecursion(35, 21);
        log.info("35和21的最大公约数是：{}",resultByRecursion);


    }

    public static int getGCDByLoop(int a, int b) {
        if (a < 0 || b < 0) {
            //数学上不考虑负数的约数
            return -1;
        }
        if (b == 0) {
            return 0;
        }
        while (a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static int getGCDByRecursion(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0) {
            return a;
        }
        return a % b == 0 ? b : getGCDByRecursion(b, a % b);
    }
}
