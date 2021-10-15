package top.qiyi.java.basic.oop;

/**
 * @program：JavaStudy
 * @description:
 * @author: qiyi
 * <p>
 * create: 2021-10-15 21:51
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person(23, "zhang");
        Person p1 = null;
        try {
            p1 = (Person) p.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(p);
        System.out.println(p1);
    }
}