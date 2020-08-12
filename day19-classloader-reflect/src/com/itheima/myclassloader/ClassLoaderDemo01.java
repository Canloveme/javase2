package com.itheima.myclassloader;

/**
 * @author csq
 * @date 2020/8/10 9:31
 */
public class ClassLoaderDemo01 {
    public static void main(String[] args) {
        //获取系统加载器 systemClassLoader
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("systemClassLoader = " + systemClassLoader);
        //获取平台类加载器   PlatformClassLoader
        ClassLoader platformClassLoader = ClassLoader.getPlatformClassLoader();
        System.out.println("platformClassLoader = " + platformClassLoader);
        //获取不到启动类加载器

        
        //系统类加载器 父类 上一层 平台类加载器PlatformClassLoader
        ClassLoader systemClassLoaderParent = systemClassLoader.getParent();
        System.out.println("systemClassLoaderParent = " + systemClassLoaderParent);
        //PlatformClassLoader 上一层 启动类加载器 为null  BootstrapClassLoader
        ClassLoader systemClassLoaderParentParent = systemClassLoaderParent.getParent();
        System.out.println("systemClassLoaderParentParent = " + systemClassLoaderParentParent);
        /**
         * systemClassLoader = jdk.internal.loader.ClassLoaders$AppClassLoader@1f89ab83
         * platformClassLoader = jdk.internal.loader.ClassLoaders$PlatformClassLoader@21bcffb5
         * systemClassLoaderParent = jdk.internal.loader.ClassLoaders$PlatformClassLoader@21bcffb5
         * systemClassLoaderParentParent = null
         */
    }
}
