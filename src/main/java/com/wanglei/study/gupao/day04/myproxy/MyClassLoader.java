package com.wanglei.study.gupao.day04.myproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyClassLoader extends  ClassLoader{

    private File classPathFile;

    public MyClassLoader(){
        String classpath = MyClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classpath);
    }
    protected  Class<?> findClass(String name) throws ClassNotFoundException {
        String className = MyClassLoader.class.getPackage().getName()+"."+name;
        if(classPathFile!=null){
            String filename = "\\"+name+".class";
            File classFile = new File(classPathFile,filename);
            if(classFile.exists()){
                FileInputStream in = null;
                ByteArrayOutputStream os = null;
                try {
                    in = new FileInputStream(classFile);
                    os = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while((len=in.read(buff))!=-1){
                        os.write(buff,0,len);
                    }
                    return defineClass(className,os.toByteArray(),0,os.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {

                }

            }
        }
        return null;
    }
}
