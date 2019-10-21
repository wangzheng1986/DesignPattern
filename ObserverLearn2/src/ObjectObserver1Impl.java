public class ObjectObserver1Impl implements ObjectObserver {
    @Override
    public void update(int state) {
        System.out.println("observer1");
        this.doSomething();
    }

    private void doSomething(){
        System.out.println("observer1 doSomething !!!!");
    }
}
