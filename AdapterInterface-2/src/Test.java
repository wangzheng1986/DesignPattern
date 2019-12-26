/**
 * 接口适配器
 * 万能变压器
 * */
public class Test {
    public static void main(String[] args) {
        DC5V dc5V = new DC5VImpl(new AC110V());
        int d = dc5V.dc5v();
        System.out.println("输入为=" + new AC110V().method());
        System.out.println("输出为="+ d);
    }
}
