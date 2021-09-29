package top.qiyi.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * @program：JavaStudy
 * @description: Instanceof操作符示例
 * @author: qiyi
 * <p>
 * create: 2021-09-28 22:49
 **/
@Slf4j
public class InstanceofOperatorDemo {
    public static void main(String [] args){
        Animal animal=new Cat();
        boolean result =animal instanceof Cat;
        log.info(String.valueOf(result));
    }

    static class Animal{

    }
    static  class Cat extends Animal {

    }
}
