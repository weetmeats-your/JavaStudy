package top.qiyi.java.basic.reflect;

import lombok.extern.slf4j.Slf4j;

/**
 * @program：JavaStudy
 * @description: 目标类
 * @author: qiyi
 * <p>
 * create: 2021-10-07 19:19
 **/
@Slf4j
public class TargetObject {
     private final String value;

     public TargetObject(){
          this.value = "defult";
     }

     public void publicMethod(String s){
          log.info("I love" + s);
     }

     public void privateMethod(){
          log.info("value is " + value);
     }
}
