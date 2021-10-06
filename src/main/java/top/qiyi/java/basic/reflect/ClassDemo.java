package top.qiyi.java.basic.reflect;

import lombok.extern.slf4j.Slf4j;

/**
 * @program：JavaStudy
 * @description: JAVAFAN反射之class类的练习
 * 类的类型是Class
 * 反射机制。与获取一个类或者调用某个类的方法，首先要获得取到该类的 CLass 对象
 * @author: qiyi
 * <p>
 * create: 2021-10-06 21:42
 **/
@Slf4j
public class ClassDemo {
    public static void main(String[] args) {
        //在JAVA API 中提供了获取Class类的对象的三种方法
        // 第一种，使用获取Class.ForName静态方法。前提：已明确类的全路径名
        Class clazz1 = null;
        try {
            clazz1 = Class.forName("top.qiyi.java.basic.reflect.User");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //第二种使用 .class 方法 。  说明：仅适合在编译前就已经明确要操作的 class
        Class clazz2 = User.class;

        //第三种，使用类对象的 getClass() 方法，适合有对象示例的情况下

        User user = new User();
        Class clazz3 = user.getClass();

        //结果
        log.info("clazz1-clazz2-clazz3:{},{],{}", clazz1, clazz2, clazz3);
        log.info(String.valueOf(clazz1 == clazz2));
        log.info(String.valueOf(clazz3 == clazz2));


    }
}
