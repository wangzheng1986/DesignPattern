/**
 * 简单工厂（反射）
 * */
public class ReflectSimpleShirtFactory {

    public ShirtProducer producer(String shirtType)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> ShirProducer = Class.forName(shirtType);
        return (ShirtProducer) ShirProducer.newInstance();
    }
}
