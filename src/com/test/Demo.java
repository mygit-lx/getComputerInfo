package com.test;

import com.util.GetComInfoUtil;
import org.junit.Test;

/**
 * Created by LuoX-PC on 2016/8/29.
 */
public class Demo {
    @Test
    public void test01(){
        GetComInfoUtil gciu = null;
        try {
            gciu = new GetComInfoUtil();
            // System信息，从jvm获取
            System.out.println("----------------System信息------------------");
            gciu.property();
            // cpu信息
            System.out.println("-----------------cpu信息-----------------");
            gciu.cpu();
            // 内存信息
            System.out.println("------------------内存信息----------------");
            gciu.memory();
            // 操作系统信息
            System.out.println("------------------操作系统信息----------------");
            gciu.os();
            // 用户信息
            System.out.println("------------------用户信息----------------");
            gciu.who();
            // 文件系统信息
            System.out.println("------------------文件系统信息----------------");
            gciu.file();
            // 网络信息
            System.out.println("-------------------网络信息---------------");
            gciu.net();
            // 以太网信息
            System.out.println("-------------------以太网信息---------------");
            gciu.ethernet();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
    @Test
    public void test02(){
        System.out.println("Hello! World");
        System.out.println(System.getProperty("java.library.path"));
    }
}
