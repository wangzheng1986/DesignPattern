public class ObserverTest {
    public static void main(String[] args) {
        MySubject mySubject = new MySubject();
        ObjectObserver1Impl observer1 = new ObjectObserver1Impl();
        ObjectObserver2Impl observer2 = new ObjectObserver2Impl();
        ObjectObserver3Impl observer3 = new ObjectObserver3Impl();

        mySubject.add(observer1);
        mySubject.add(observer2);
        mySubject.add(observer3);

        mySubject.setState(1);
        mySubject.del(observer2);
        mySubject.setState(2);
    }
}
