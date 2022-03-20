package elements;

import com.codeborne.selenide.SelenideElement;

public abstract class Element {
    protected final SelenideElement element;

    public Element(SelenideElement element) {
        this.element = element;
    }

}
