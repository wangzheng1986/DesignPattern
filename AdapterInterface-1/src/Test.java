/**
 * 接口适配器
 * 不用实现所有接口方法
 * */
public class Test {

    public static void main(String[] args) {
        SourceableSub1 sourceableSub1 = new SourceableSub1();
        SourceableSub2 sourceableSub2 = new SourceableSub2();
        sourceableSub1.method1();
        sourceableSub1.method2();
        sourceableSub2.method1();
        sourceableSub2.method2();
    }
}
