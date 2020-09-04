package operational.visitor;

public class HTMLValidator implements Visitor {

    @Override
    public void visit(HTMLFile htmlFile) {
        System.out.println("validating html");
    }
}
