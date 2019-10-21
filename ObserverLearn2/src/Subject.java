public interface Subject {

    void add(ObjectObserver observer);
    void del(ObjectObserver observer);
    void notifyObserver(int state);
}
