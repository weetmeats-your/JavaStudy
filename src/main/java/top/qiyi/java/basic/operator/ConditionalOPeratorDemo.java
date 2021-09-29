package top.qiyi.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @program：JavaStudy
 * @description: 三目运算
 * @author: qiyi
 * <p>
 * create: 2021-09-28 22:41
 **/
@Slf4j
public class ConditionalOPeratorDemo {
    public static void main(String[] args) {

        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        log.info("Value of b is : " + b);

        b = (a == 10) ? 20 : 30;
        log.info("Value of b is : " + b);


    }
}
