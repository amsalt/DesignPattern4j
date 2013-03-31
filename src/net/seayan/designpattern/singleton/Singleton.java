
package net.seayan.designpattern.singleton;


/**
 * 单例模式<br>
 * 应用场景：<br>
 * 1.消耗资源过多时，如IO/DB<br>
 * 2.访问共享资源<br>
 * 3.需要唯一序列号<br>
 * 4.某些场景的工具类<br>
 * <b>注意：</b>线程安全，一般采用饿汉式单例
 * 
 * @author Yan Meng
 * @since 2013-3-31 下午1:50:06
 */
public class Singleton
{
    private static final Singleton instance = new Singleton();
    private String echoTextString;

    private Singleton()
    {
        // 不能为外界访问,一般做一些初始化操作。
        init();
    }

    public static Singleton getInstance()
    {
        return instance;
    }
    
    private void init()
    {
        echoTextString = "Hello,Singleton!";
    }

    public void someOtherMethod()
    {
        // do sth.
        System.out.println(echoTextString);
    }
}
