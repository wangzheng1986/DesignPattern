/**
 * 单例模式
 * */
public class Test {

    public static void main(String[] args) {
        //懒汉写法（线程安全）
        SingleTon singleTon1 = new SingleTon();
        System.out.println("懒汉写法（线程安全）:" + singleTon1.getInstance());
        SingleTon singleTon2 = new SingleTon();
        System.out.println("懒汉写法（线程安全）:" + singleTon2.getInstance());

        //饿汉写法
        SingleTon1 singleTon11 = new SingleTon1();
        System.out.println("饿汉写法（线程安全）:" + singleTon11.getSingleTon());
        System.out.println("饿汉写法（线程安全）实例引用:" + singleTon11);
        SingleTon1 singleTon12 = new SingleTon1();
        System.out.println("饿汉写法（线程安全）:" + singleTon12.getSingleTon());
        System.out.println("饿汉写法（线程安全）实例引用:" + singleTon12);

        //静态内部类
        SingleTon2 singleTon21 = new SingleTon2();
        System.out.println("静态内部类:" + singleTon21.getInstance());
        SingleTon2 singleTon22 = new SingleTon2();
        System.out.println("静态内部类:" + singleTon22.getInstance());
    }
}
