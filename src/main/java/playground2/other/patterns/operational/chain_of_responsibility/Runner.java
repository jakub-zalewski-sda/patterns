package playground2.other.patterns.operational.chain_of_responsibility;

public class Runner {

    public static void main(String[] args) {
        HelpHandler application = new Application();
        //application.handleHelp();

        HelpHandler form = new Form();

        HelpHandler textField = new TextField(form);

        HelpHandler button = new Button(textField);
        button.handleHelp();
    }
}
