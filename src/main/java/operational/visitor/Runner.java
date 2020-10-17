package operational.visitor;

public class Runner {

    public static void main(String[] args) {
        HTMLFile htmlFile = new HTMLFile();
        Visitor visitor = new HTML5Validator();

        htmlFile.accept(visitor);
    }
}
