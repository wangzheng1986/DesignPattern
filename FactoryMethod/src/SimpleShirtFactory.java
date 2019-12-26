/**
 * 简单工厂模式
 * */
public class SimpleShirtFactory {

    public ShirtProducer producer(String shirtType){
        if ("t-shirt".equals(shirtType)){
            return new WomenShirtProducerImpl();
        }else{
            return new ManShirtProducerImpl();
        }
    }
}
