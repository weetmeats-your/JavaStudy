package top.qiyi.java.basic.enumeration;

import lombok.extern.slf4j.Slf4j;

/**
 * @program：JavaStudy
 * @description: 利用枚举实现单列
 * 因为枚举的类的构造方法只能被声明为private 权限或不声明权限
 * @author: qiyi
 * <p>
 * create: 2021-09-30 08:54
 **/
@Slf4j
public class SingletonEnumDemo {
    /**
     * 内部私有枚举
     */
    private enum SingletonEnum{
        /**
         * 枚举实例 （单列）
         */
        INSTANCE ;
        private String name;
        public String getName(){
            return name;
        }
        public void setName(String name ){
            this.name =name;

        }
    }
    public static void main(String[] args){
        SingletonEnum.INSTANCE.setName("soft");
        log.info(SingletonEnum.INSTANCE.getName());

    }
}
