package top.qiyi.java.basic.oop;

/**
 * @program：JavaStudy
 * @description:
 * @author: qiyi
 * <p>
 * create: 2021-10-15 21:49
 **/
public class Person  implements Cloneable{
    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}