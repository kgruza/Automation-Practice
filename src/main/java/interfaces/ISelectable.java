package interfaces;

import com.codeborne.selenide.ElementsCollection;

public interface ISelectable {
    void selectOption(String option);

    String getSelectedOption();

    void selectOptionContainingText(String text);

    ElementsCollection getOptions();

}
