package designpatterns.builder;

class CarBuildDirector {

    private CarBuilder builder;

    CarBuildDirector(final CarBuilder builder) {
        this.builder = builder;
    }

    Car construct() {
        return builder.setWheels(4)
                .setColor("Red")
                .build();
    }

}
