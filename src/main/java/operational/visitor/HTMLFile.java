package operational.visitor;

public class HTMLFile {
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
