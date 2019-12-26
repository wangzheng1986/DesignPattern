public class DC5VImpl implements DC5V {
    private ACV acv;

    public DC5VImpl(AC220V acv) {
        this.acv = acv;
    }

    public DC5VImpl(AC110V acv) {
        this.acv = acv;
    }

    @Override
    public int dc5v() {
        int ac = 0;
        if (acv != null) {
            ac = acv.method();
        }
        int sta = ac / 5;
        return (ac / sta);
    }
}
