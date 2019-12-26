/**
 * 适配器角色
 * */
public class DC5VImpl extends AC220V implements DC5V {

    @Override
    public int dc5v() {
        int output220v = output220v();
        return (output220v / 44);
    }
}
