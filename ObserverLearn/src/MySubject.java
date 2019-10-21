public class MySubject extends AbstractSubjectImpl {
    @Override
    public void operation() {
        System.out.println("update self~~~");
        notifyObserver();
    }
}
