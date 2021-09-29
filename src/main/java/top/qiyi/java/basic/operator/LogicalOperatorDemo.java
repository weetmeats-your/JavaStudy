package top.qiyi.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @program：JavaStudy
 * @description: 逻辑操作符示例
 * @author: qiyi
 * <p>
 * create: 2021-09-28 22:16
 **/
@Slf4j
public class LogicalOperatorDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        log.info("a && b =" + (a && b));
        log.info("a || b =" + (a || b));
        log.info("!(a && b) = " + !(a && b));

    }

}
