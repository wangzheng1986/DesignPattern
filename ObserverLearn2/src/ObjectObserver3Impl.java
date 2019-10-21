public class ObjectObserver3Impl implements ObjectObserver {
    @Override
    public void update(int state) {
        System.out.println("observer3");
        this.doSomething();
    }

    private void doSomething(){
        System.out.println("observer3 doSomething !!!");
    }
}
