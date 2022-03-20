package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import interfaces.ISelectable;

public class Checkbox extends Element implements ISelectable {
    public Checkbox(SelenideElement element) {
        super(element);
    }

    @Override
    public boolean isSelected() {
        SelenideElement selectAttributeElement = element
                .ancestor(".checkbox")
                .find("span");
        return selectAttributeElement.has(Condition.attribute("class"))
                && selectAttributeElement.getAttribute("class").equals("checked");
    }

    @Override
    public void click() {
        element.click();
    }

}
