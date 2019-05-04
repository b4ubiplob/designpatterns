package designpatterns.abstractfactory;

public interface AbstractFactory<T> {

    public T create(String type);
}
