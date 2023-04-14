 package com.hbb.exceptions;

 import java.util.Scanner;

 /**
 * overload之间的异常没关系
  *
  * override的子类异常类别要《=父类
  * 子类方法抛出的异常类型必须与父类方法声明的异常类型兼容，否则将导致编译错误
 *
 */

public class Test06_overload_override {
    public static void main(String[] args) throws Exception {
    }

    // overload
    public static void run() throws Exception{}
    public static void run(int a){}



}
