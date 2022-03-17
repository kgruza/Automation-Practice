package interfaces;

public interface IEditable extends IReadable {
    void clearText();

    void setText(String text);

    void appendText(String text);
    void setTextIfNotNullOrEmpty(String text);
}
