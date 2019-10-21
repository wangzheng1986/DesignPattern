public class ObjectObserver2Impl implements ObjectObserver {
    @Override
    public void update(int state) {
        System.out.println("observer2");
        this.doSomething();
    }

    private void doSomething(){
        System.out.println("observer2 doSomething !!!");
    }
}
