import java.util.ArrayList;

public abstract class SubjectImpl implements Subject {
    private ArrayList<ObjectObserver> observers;
    public SubjectImpl(){
        observers = new ArrayList<>();
    }
    @Override
    public void add(ObjectObserver observer) {
        observers.add(observer);
    }

    @Override
    public void del(ObjectObserver observer) {
        observers.remove(observer);
        System.out.println("remove observer:" + observer.getClass().getName());
    }

    @Override
    public void notifyObserver(int state) {
        observers.forEach(observer -> {
            observer.update(state);
            System.out.println("通知观察者：" + observer.getClass().getName() + "，执行update方法");});
    }
}
