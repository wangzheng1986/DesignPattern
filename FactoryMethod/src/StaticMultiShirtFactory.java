/**
 * 静态工厂方法
 * */
public class StaticMultiShirtFactory {

    public static ShirtProducer manShirt(){
        return new ManShirtProducerImpl();
    }

    public static ShirtProducer womenShirt(){
        return new WomenShirtProducerImpl();
    }
}
