package operational.command;

import java.util.ArrayList;
import java.util.List;

public class Desktop {

    private final List<Document> documents = new ArrayList<>();

    public void add(Document document) {
        documents.add(document);
    }

    public List<Document> getDocuments() {
        return documents;
    }
}
