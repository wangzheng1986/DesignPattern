/**
 * 类适配器
 * */
public class Test {

    public static void main(String[] args) {
        DC5V dc5V = new DC5VImpl();
        int a = dc5V.dc5v();
        System.out.println("转换后="+ a);
    }
}
