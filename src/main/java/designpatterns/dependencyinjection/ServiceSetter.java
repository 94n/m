package designpatterns.dependencyinjection;

public interface ServiceSetter {
    public void setService(Service service);

    Service getService();
}
