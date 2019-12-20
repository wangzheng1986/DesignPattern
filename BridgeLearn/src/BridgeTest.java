/**
 * 桥接模式
 * */
public class BridgeTest {
    public static void main(String[] args) {
        Bridge myBridge = new MyBridge();
        //调用第一个接口
        Sourceable sub1 = new SourceableSub1Impl();
        myBridge.setSourceable(sub1);
        myBridge.method();

        //调用第二个接口
        Sourceable sub2 = new SourceableSub2Impl();
        myBridge.setSourceable(sub2);
        myBridge.method();
    }
}
