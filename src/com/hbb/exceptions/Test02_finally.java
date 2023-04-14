package com.hbb.exceptions;

import java.util.Scanner;

/**
 * catch 后不执行：
 * 1，catch异常没正确捕获
 * 2，thow了
 * 3，try中return：先执行finally再执行return
 *
 * 使用finally一定执行
 * 可放资源关闭释放的代码
 * 除了System.exit是终止当前虚拟机不执行finally
 *
 */

public class Test02_finally {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("inout num: ");
            int num = scanner.nextInt();
            return;
        }
        catch (Exception ex){
            // 全限定路径（类名）
            ex.printStackTrace();

        }
    }
}
