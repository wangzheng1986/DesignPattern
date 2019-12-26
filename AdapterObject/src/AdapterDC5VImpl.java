import java.lang.reflect.AccessibleObject;

/**
 * 适配器角色
 * */
public class AdapterDC5VImpl implements DC5V {
    private AC220V ac220V;

    public AdapterDC5VImpl(AC220V ac220V) {
        this.ac220V = ac220V;
    }

    @Override
    public int dc5v() {
        int output220v = ac220V.output220v();
        return (output220v/44);
    }
}
