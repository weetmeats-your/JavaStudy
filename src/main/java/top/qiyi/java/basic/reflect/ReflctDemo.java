package top.qiyi.java.basic.reflect;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @program：JavaStudy
 * @description: 反射测试
 * @author: qiyi
 * <p>
 * create: 2021-10-07 19:48
 **/
@Slf4j
public class ReflctDemo {
    public static void main(String[] arg) throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
        //获取TargetObject类的Class对象
        Class<?> targetClass = Class.forName("top.qiyi.java.basic.reflect.TargetObject");
        //创建TargetObject类中所有定义的非构造方法
        TargetObject targetObject = (TargetObject) targetClass.getDeclaredConstructor().newInstance();
        //获取中TargetDject 类中所有的定义的构造方法
        Method[] methods = targetClass.getDeclaredMethods();
        for (Method method : methods){
            log.info("all methods:{}",method.getName());
        }
        //获取publicMethod方法并调用（需要传String 类型的参数）
        Method publicMethod = targetClass.getDeclaredMethod("publicMethod",String.class);
        publicMethod.invoke(targetObject,"Java");

        //获取指定参数 value 并进行修改，赋值为JavaStudy
        Field field =  targetClass.getDeclaredField("value");
        //为了对类中的参数并进行修改,取消安全检查
        field.setAccessible(true);
        field.set(targetObject,"JavaStudy");

        //请用  privateMethod 方法（无参），得到value的最新值
        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);

    }
}
