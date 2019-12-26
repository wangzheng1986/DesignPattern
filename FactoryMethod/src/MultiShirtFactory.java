/**
 * 多个工厂方法模式
 * */
public class MultiShirtFactory {

    public ShirtProducer manShirt(){
        return new ManShirtProducerImpl();
    }

    public ShirtProducer womenShirt(){
        return new WomenShirtProducerImpl();
    }
}
