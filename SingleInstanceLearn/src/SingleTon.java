/**
 * 懒汉式写法（线程安全）synchronized
 */
public class SingleTon {

    private static SingleTon singleTon;

    public SingleTon() {
    }

    public static synchronized SingleTon getInstance(){
        if(singleTon == null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}
