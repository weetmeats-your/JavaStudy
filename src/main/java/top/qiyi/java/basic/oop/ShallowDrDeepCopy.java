package top.qiyi.java.basic.oop;

import lombok.extern.slf4j.Slf4j;

/**
 * @program：JavaStudy
 * @description:
 * @author: qiyi
 * <p>
 * create: 2021-10-15 22:04
 **/
@Slf4j
public class ShallowDrDeepCopy {
    public static void  main(String[] args) throws CloneNotSupportedException{
        Student student =new Student();
        student.setId(1);
        student.setName("qy");
        Address address = new Address();
        address.setId(101);
        address.setDescribe("奥黛丽.赫本");
        student.setAddress(address);

        Student cloneStudent = (Student)  student.clone();
        log.info("*********************深拷贝还是浅拷贝**************************");
        log.info("Student == cloneStudent ：{}",student == cloneStudent );
        log.info("  : 及对象内容；{}",student.getAddress() == cloneStudent.getAddress());
        log.info("  :级对象中的内容：{}",student.getAddress().getDescribe()==
                cloneStudent.getAddress().getDescribe());

        log.info("**********************修改前属性*********************************");
        log.info(student.toString());
        log.info(cloneStudent.toString());
        student.setName(" 奥黛丽.赫本");
        address.setDescribe("比利时 布鲁塞尔");
        log.info("********************修改属性后************************");
        log.info(student.toString());
        log.info(cloneStudent.toString());
    }
}
