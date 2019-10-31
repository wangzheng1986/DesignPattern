public class PeopleExtStrategy extends PeopleActionAbstract {
    private UpFansStrategy upFansStrategy;
    public PeopleExtStrategy(UpFansStrategy upFansStrategy) {
        this.upFansStrategy = upFansStrategy;
    }

    @Override
    public void exc(int a, int b) {
        super.exc(a, b);
        upFansStrategy.up();
    }
}
