public class Test {
    public static void main(String[] args) {
        Sourceable originalSource = new SourceableImpl();
        Sourceable sourceableDecorator = new SourceableDecoratorImpl(originalSource);
        sourceableDecorator.method();
    }
}
