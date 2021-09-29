package top.qiyi.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @program：JavaStudy
 * @description: 赋值操作示例
 * @author: qiyi
 * <p>
 * create: 2021-09-28 21:40
 **/
@Slf4j
public class AssignmentOperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        log.info("c = a+b " + c);
        c -= a;
        log.info("c -=a = " + c);
        c += a;
        log.info("c +=a = " + c);
        c *= a;
        log.info("c *= a " + c);


        a = 10;
        c = 15;
        c /= a;
        log.info("c /= a = " + c);

        a = 10;
        c = 15;
        log.info("c %= a = " + c);

        c <<= 2;
        log.info(" c <<= 2 = " + c);

        c >>= 2;
        log.info(" c >>=2 = " + c);

        c >>= 2;
        log.info(" c >>=2 = " + c);

        c &= a;
        log.info("c &= a = " + c);

        c ^= a;
        log.info("c ^= a =" + c);

        c |= a;
        log.info("c |= a = " + c);


    }
}
