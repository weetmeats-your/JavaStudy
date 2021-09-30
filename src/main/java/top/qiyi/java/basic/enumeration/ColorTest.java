package top.qiyi.java.basic.enumeration;

import lombok.extern.slf4j.Slf4j;

import java.awt.*;

/**
 * @program：JavaStudy
 * @description: 颜色枚举测试，注意枚举中的属性要用doc注释      新建文件的时候。新建ColorTest类即可，一个文件夹包含多个类，只能一个public
 * @author: qiyi
 * <p>
 * create: 2021-09-30
 **/
@Slf4j
public class ColorTest {
    public static void main(String[] agrs) {
        //访问枚举值
        Color color = Color.RED;
        log.info(String.valueOf(color));
        //枚举类中所有的值
        Color[] arr = Color.values();
        //遍历枚举
        for (Color c : arr) {
            log.info("枚举的索引{}，枚举的值{}", c.ordinal(), c);
        }
    }
}

enum Color {
    /**
     * 红色
     */
    RED, YELLOW, GREEN
}