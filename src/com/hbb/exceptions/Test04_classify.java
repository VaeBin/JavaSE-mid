package com.hbb.exceptions;

import java.util.Scanner;

/**
 * object类
 * throwable类：error类（虚拟机内出错比如内存溢出）和exception类（检查异常和运行时异常）。语法和逻辑不算错误和异常
 * 运行时异常：空指针，数组越界
 * 检查异常：可能会出现错误防患于未然，需要提前处理异常，比如和文件有关
 *
 */

public class Test04_classify {
    public static void main(String[] args) {
        try {
            Class.forName("com.hbb.exceptions.Test01_try_catch").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
