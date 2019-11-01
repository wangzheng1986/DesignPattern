public class SourceableDecoratorImpl implements Sourceable {
    private Sourceable sourceable;

    public SourceableDecoratorImpl(Sourceable sourceable) {
        super();
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        System.out.println("before doSomeThing~~~~");
        //原始逻辑方法
        sourceable.method();
        System.out.println("after doSomeThing~~~");
    }
}
