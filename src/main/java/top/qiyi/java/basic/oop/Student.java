package top.qiyi.java.basic.oop;

import lombok.Data;

/**
 * @program：JavaStudy
 * @description:
 * @author: qiyi
 * <p>
 * create: 2021-10-15 22:04
 **/
@Data
public class Student implements Cloneable {
    private Integer id;
    private String name;
    private Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //    return super.clone();
        //}
        //
        //}
        Student s = (Student) super.clone();
        s.address = (Address) this.address.clone();
        return s;
    }
}

