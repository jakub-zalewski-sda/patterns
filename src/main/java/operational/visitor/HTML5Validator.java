package operational.visitor;

public class HTML5Validator implements Visitor {

    @Override
    public void visit(HTMLFile htmlFile) {
        System.out.println("validating html5");
    }
}
