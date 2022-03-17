package elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import interfaces.ISelectable;

public class Dropdown extends Element implements ISelectable {
    private final SelenideElement dropdown;

    public Dropdown(SelenideElement dropdown) {
        super(dropdown);
        this.dropdown = dropdown;
    }

    @Override
    public void selectOption(String option) {
        dropdown.selectOption(option);
    }

    @Override
    public String getSelectedOption() {
        return dropdown.getSelectedOption().text();
    }

    @Override
    public void selectOptionContainingText(String text) {
        dropdown.selectOptionContainingText(text);
    }

    @Override
    public ElementsCollection getOptions() {
        return dropdown.getSelectedOptions();
    }

}
