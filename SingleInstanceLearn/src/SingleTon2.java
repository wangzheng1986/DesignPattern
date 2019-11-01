/**
 * 静态内部类
 * */
public class SingleTon2 {
    private static class SingleTonHolder{
        private static final SingleTon2 instance = new SingleTon2();
    }

    public SingleTon2() {
    }

    public static final SingleTon2 getInstance(){
        return SingleTonHolder.instance;
    }
}
