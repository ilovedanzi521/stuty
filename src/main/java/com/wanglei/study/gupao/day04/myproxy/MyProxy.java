package com.wanglei.study.gupao.day04.myproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;

/**
 * 这个类组要是生成java代理类再编译成class
 */
public class MyProxy {
     static Object newProxyInstance(MyClassLoader classLoader,Class<?>[] clzs,MyInvocationHandler h){
        try{
            //1.生成java字符串
            String src = generateSrc(clzs);

            //2.生成java文件
            String file = MyProxy.class.getResource("").getPath()+"$Proxy0.java";
            File f = new File(file);
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();

            //编译class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manager.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
            task.call();
            manager.close();

            //使用myclassloader加载class文件
            Class proxyclass = classLoader.findClass("$Proxy0");
            Constructor c =proxyclass.getConstructor(MyInvocationHandler.class);
            f.delete();

            return c.newInstance(h);
            //
        }catch(Exception e){
            e.printStackTrace();
        }

         return null;
    }

    /**
     * 整成静态java类，可使用反射替换
     * @param clzs
     * @return
     */
    private static String generateSrc(Class<?>[] clzs){
        StringBuffer sb = new StringBuffer();
        sb.append("package com.wanglei.study.gupao.day04.myproxy;                                  "+
                "                                                                                "+
                "                                                                                "+
                "import java.lang.reflect.Method;                                                "+
                "                                                                                "+
                "public class $Proxy0 implements People {                                    "+
                "    MyInvocationHandler handler;                                                "+
                "    public $Proxy0(MyInvocationHandler handler){                            "+
                "        this.handler = handler;                                                 "+
                "    }                                                                           "+
                "    public void findLover() {                                                   "+
                "        try {                                                                   "+
                "            Method method = People.class.getMethod(\"findLover\", new Class[]{}); "+
                "            handler.invoke(this,method,null );                                  "+
                "        }catch (Throwable e){                                                   "+
                "            e.printStackTrace();                                                "+
                "        }                                                                       "+
                "    }                                                                           "+
                "}");

        return sb.toString();
    }
}
