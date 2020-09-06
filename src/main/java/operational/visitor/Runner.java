package operational.visitor;

public class Runner {

    public static void main(String[] args) {
        HTMLFile htmlFile = new HTMLFile();

        Visitor visitor = new HTMLLogger();
        Visitor visitor2 = new HTMLValidator();

        htmlFile.accept(visitor);
        htmlFile.accept(visitor2);
    }
}
