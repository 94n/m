package designpatterns.abstractfactory;

class AbstractFactory {

    static GuiFactory factory(String appearance) {
        switch (appearance) {
            case "osx":
                return OsxButton::new;
            case "win":
                return WinButton::new;
            default:
                throw new IllegalArgumentException("unknown ");
        }
    }

}
