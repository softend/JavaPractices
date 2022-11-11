package Practice_21_22;

public class CreateTextDocument implements ICreateDocument{
    @Override
    public IDocument createNew() {
        System.out.println("New text document created");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println("Opened text document");
        return new TextDocument();
    }
}
