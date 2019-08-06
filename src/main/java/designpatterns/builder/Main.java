package designpatterns.builder;

public class Main {

    public static void main(final String[] arguments) {
        final CarBuilder builder = new CarBuilderImpl();
        final CarBuildDirector carBuildDirector = new CarBuildDirector(builder);
        System.out.println(carBuildDirector.construct());
    }

}
