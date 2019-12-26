/**
 * 对象适配器
 * */
public class Test {

    public static void main(String[] args) {
        AdapterDC5VImpl adapterDC5V = new AdapterDC5VImpl(new AC220V());
        int a = adapterDC5V.dc5v();
        System.out.println("转换后=" + a);
    }
}
