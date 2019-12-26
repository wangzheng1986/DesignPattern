import java.text.SimpleDateFormat;

/**
 * 凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。
 * ​大多数情况下，选用静态工厂方法模式。
 * */
public class Test {
    public static void main(String[] args) {
        System.out.println("普通工厂模式");
        SimpleShirtFactory simpleShirtFactory = new SimpleShirtFactory();
        ShirtProducer shirtProducer1 = simpleShirtFactory.producer("t-shirt");
        shirtProducer1.produceShirt();

        try {
            System.out.println("普通工厂模式（反射）");
            ReflectSimpleShirtFactory reflectSimpleShirtFactory = new ReflectSimpleShirtFactory();
            ShirtProducer shirtProducer2 = reflectSimpleShirtFactory.producer(ManShirtProducerImpl.class.getName());
            shirtProducer2.produceShirt();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        System.out.println("多工厂方法模式");
        MultiShirtFactory multiShirtFactory = new MultiShirtFactory();
        ShirtProducer shirtProducer3 = multiShirtFactory.manShirt();
        shirtProducer3.produceShirt();

        System.out.println("静态工厂方法模式");
        ShirtProducer shirtProducer4 = StaticMultiShirtFactory.manShirt();
        shirtProducer4.produceShirt();
    }
}
