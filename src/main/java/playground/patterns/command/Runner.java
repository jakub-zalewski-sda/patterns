package playground.patterns.command;

public class Runner {

    public static void main(String[] args) {
        MenuItem menuItem = new Button(new OpenDocumentCommand());
        MenuItem menuItem2 = new Button(new CloseAllDocumentsCommand());

        menuItem.click();
        menuItem2.click();
    }
}
