package promblem;

import org.junit.jupiter.api.Test;

/**
 * @author WangChen
 * @filename EqualsProblemTest
 * @date 2020/1/10 15:25
 * @description ==和equals（）的区别
 */
public class EqualsProblemTest {
    /**
     * == : 它的作用是判断两个对象的地址是不是相等。即，判断两个对象是不是同一个对象(基本数据类型==比较的是值，引用数据类型==比较的是内存地址)。
     * equals() : 它的作用也是判断两个对象是否相等。但它一般有两种使用情况：
     * 情况1：类没有覆盖 equals() 方法。则通过 equals() 比较该类的两个对象时，等价于通过“==”比较这两个对象。
     * 情况2：类覆盖了 equals() 方法。一般，我们都覆盖 equals() 方法来比较两个对象的内容是否相等；若它们的内容相等，则返回 true (即，认为这两个对象相等)。
     */
    static class DemoTest {
        private String name;
        private int id;

        @Override
        public String toString() {
            return "DemoTest{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }

    /**
     * 说明：
     * String 中的 equals 方法是被重写过的，
     * 因为 object 的 equals 方法是比较的对象的内存地址，而 String 的 equals 方法比较的是对象的值。
     * 当创建 String 类型的对象时，虚拟机会在常量池中查找有没有已经存在的值和要创建的值相同的对象
     * 如果有就把它赋给当前引用。如果没有就在常量池中重新创建一个 String 对象。
     */
    @Test
    public void test1() {
        DemoTest a = new DemoTest();
        a.id = 1;
        a.name = "ssss";
        DemoTest b = new DemoTest();
        b.id = 1;
        b.name = "ssss";
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
