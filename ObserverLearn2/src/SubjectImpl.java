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
    }

    @Override
    public void notifyObserver(int state) {
        observers.forEach(observer -> observer.update(state));
    }
}
