package hard3;

public abstract class AbstractList<E> {

    protected int size;

    public abstract void add(E element);
    public abstract E get(int index);
    public abstract void remove(int index);

    protected void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", размер: " + size);
        }
    }


}
