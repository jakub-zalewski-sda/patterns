package operational.visitor;

public class HTMLLogger implements Visitor {

    @Override
    public void visit(HTMLFile htmlFile) {
        System.out.println("logging html");
    }
}
