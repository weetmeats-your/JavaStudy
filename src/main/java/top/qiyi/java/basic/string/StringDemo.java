package top.qiyi.java.basic.string;

import java.util.Scanner;

/**
 * @program：JavaStudy
 * @description: 字符串练习
 * @author: qiyi
 * <p>
 * create: 2021-09-26 20:54
 **/
public class StringDemo {
    public static void main(String[] args){
      Scanner s1=new Scanner(System.in);
      System.out.println("请给字符串a赋值");
      String a=s1.nextLine();
      Scanner s2=new Scanner(System.in);
        System.out.println("请给字符串b赋值");
        String b=s1.nextLine();
        System.out.println("请给字符串a赋值：" + a);
        System.out.println("请给字符串b赋值：" + b);


        System.out.println("两个字符串的内容是否相同？" + a.equals(b));
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        String c=a+b;
        System.out.println("字符串a与b合并之后的内容为："+c);
      Scanner s3=new Scanner(System.in);
      System.out.println("请输出想要查找的字符串：");
      String d=s3.nextLine();

      boolean con=c.contains(d);
      System.out.println("字符串是被包含在字符串之中："+con);
      System.out.println("包含次数为："+ repetitions (c,d));
      Scanner s4=new Scanner(System.in);
      System.out.println("请选择是否替换字符串：确定（1）/拒绝（2）");
      int e=s4.nextInt();
      switch (e){
        case 1:
          Scanner s5=new Scanner(System.in);
          System.out.println("请输入想要替换的原字符");
          String f=s5.nextLine();
          Scanner s6=new Scanner(System.in);
          System.out.println("请输入想要替换的原字符");
          String g=s6.nextLine();

        String z=c.replace(f,g);
        System.out.println("替换前："+c);
        System.out.println("替换后："+z);
        break;

        case 2:
          System.out.println("最终的字符串内容为：\n"+c);
          break;
        default:
          System.out.println("该字符串有误");
          break;
      }
    }

    public static int repetitions(String c,String d){
      int count =0;
      int fromIndex=0;
      while ((fromIndex=c.indexOf(d,fromIndex))!=-1){
        fromIndex=fromIndex+d.length();
        count++;
      }
      return count;
    }








}
