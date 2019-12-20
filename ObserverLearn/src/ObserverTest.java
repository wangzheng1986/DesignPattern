/**
 * 观察者模式
 * */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new MySubject();
        subject.add(new Observer1Impl());
        subject.add(new Observer2Impl());

        subject.operation();
    }
}
