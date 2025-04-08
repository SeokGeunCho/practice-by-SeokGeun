package Generics.Practice;

class Box<T> extends Generics.Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }
    public T get() {
        return item;
    }
}
