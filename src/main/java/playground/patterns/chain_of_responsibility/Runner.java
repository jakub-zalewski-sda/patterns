package playground.patterns.chain_of_responsibility;

public class Runner {

    public static void main(String[] args) {
        HelpProvider window = new Window();

        HelpProvider form = new Form(window);

        HelpProvider button = new Button(form);

        button.showHelp();

        HelpProvider buttonDirectInWindow = new Button(window);
        buttonDirectInWindow.showHelp();
    }
}
