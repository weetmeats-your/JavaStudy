package top.qiyi.java.basic.oop;

import lombok.Data;

/**
 * @program：JavaStudy
 * @description:
 * @author: qiyi
 * <p>
 * create: 2021-10-15 21:56
 **/

@Data
public class Address implements Cloneable {
    private Integer id;
    private String describe;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
