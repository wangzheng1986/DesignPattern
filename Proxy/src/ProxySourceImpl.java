public class ProxySourceImpl implements Source {
    private SourceImpl source;

    public ProxySourceImpl() {
        this.source = new SourceImpl();
    }

    @Override
    public void method() {
        beforeFunc();
        source.method();
        afterFunc();
    }

    private void beforeFunc(){
        System.out.println("before func---------");
    }

    private void afterFunc(){
        System.out.println("after func-----------");
    }
}
