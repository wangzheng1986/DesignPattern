/**
 *饿汉式写法
 * */
public class SingleTon1 {
    private static SingleTon singleTon = new SingleTon();

    public SingleTon1() {
    }

    public static SingleTon getSingleTon(){
        return singleTon;
    }
}
