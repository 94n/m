package designpatterns.abstractfactory;

@FunctionalInterface
public interface GuiFactory {
    Button createButton();
}
