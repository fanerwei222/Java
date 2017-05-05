package Reflection;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by fanwei on 2017/5/5.
 */
public class MainReflection implements InterReflection, Serializable {
    private String hello;
    public String good;
    String yes;

    public static void main(String[] args) throws Exception{
        MainReflection mainReflection = new MainReflection();
        System.out.println(mainReflection.getClass().getName());

        /**
         * 获取一个类
         */
        Class<?> clazz = null;
        clazz = Class.forName("Reflection.MainReflection");

        Class<?> clazzUser = null;
        clazzUser = Class.forName("Reflection.User");
        User user = (User) clazzUser.newInstance();
        user.setName("fanwei");
        user.setAge(18);
        System.out.println("用户：" + user);
        /**
         * 获取一个类的所有构造方法
         */
        Constructor<?> userConstructor[] = clazzUser.getConstructors();
        for (int i = 0 ; i < userConstructor.length; i ++ )
        {
            /**
             * 获取构造参数的类型,构造参数类型也是一个类
             */
            Class<?> clazzCon[] = userConstructor[i].getParameterTypes();
            System.out.println("clazzCon[" + i + "] (");
            for (int j = 0; j < clazzCon.length; j ++)
            {
                /**
                 * 不知道什么意思...
                 */
                if (j == clazzCon.length - 1)
                {
                    System.out.println(clazzCon[j].getName());
                }
                else
                {
                    System.out.println(clazzCon[j].getName() + ",");
                }
            }
            System.out.println(")");
        }
        /**
         * 根据获取到的构造函数参数类型和个数new一个类的实例
         */
        user = (User) userConstructor[0].newInstance(18, "fanwei");
        System.out.println(user);
        user = (User) userConstructor[1].newInstance("fanwei");
        System.out.println(user);

        /**
         * 获取一个类的父类
         */
        Class<?> clazzParent = clazz.getSuperclass();
        /**
         * 获取一个类的实现的方法
         */
        Class<?> imple[] = clazz.getInterfaces();

        System.out.println("clazz 名称:" + clazz.getName());
        System.out.println("clazz 父类名称：" + clazzParent.getName());
        for (int i = 0 ; i < imple.length ; i ++)
        {
            System.out.println("clazz 实现接口: " + imple[i].getName());
        }
        System.out.println("-------------------------");
        /**
         * 获取本类的所有属性
         */
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0 ; i < fields.length; i ++)
        {
            //权限修饰符
            int mo = fields[i].getModifiers();
            String priv = Modifier.toString(mo);
            //属性类型
            Class<?> type = fields[i].getType();
            System.out.println("获取本类的所有属性");
            System.out.println(priv + " " + type.getName() + " " + fields[i].getName() + ";");
        }
        /**
         * 取得实现的接口或者父类的属性
         */
        Field[] fields1 = clazz.getFields();
        for (int j = 0; j < fields1.length ; j ++)
        {
            //权限修饰符
            int mo = fields1[j].getModifiers();
            String priv = Modifier.toString(mo);
            //属性类型
            Class<?> type = fields[j].getType();
            System.out.println("获取父类或者接口的所有属性");
            System.out.println(priv + " " + type.getName() + " " + fields[j].getName() + ";");
        }
        System.out.println("-------------------------");
    }
}
