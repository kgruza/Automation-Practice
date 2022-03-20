package elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.google.common.base.Strings;
import interfaces.IExpandable;

public class Dropdown extends Element implements IExpandable {

    public Dropdown(SelenideElement element) {
        super(element);
    }

    @Override
    public void selectOption(String option) {
        if (!Strings.isNullOrEmpty(option))
            element.selectOption(option);
    }

    @Override
    public String getSelectedOption() {
        return element.getSelectedOption().text();
    }

    @Override
    public void selectOptionContainingText(String text) {
        if (!Strings.isNullOrEmpty(text))
            element.selectOptionContainingText(text);
    }

    @Override
    public ElementsCollection getOptions() {
        return element.getSelectedOptions();
    }

}
