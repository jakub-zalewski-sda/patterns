package operational.command;

public class Document {
    private String content;

    public void paste(String text) {
        this.content = text;
    }

    public String getContent() {
        return content;
    }
}
