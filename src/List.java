public interface List<T> {

    public void add(T value);

    public void add(T value, int index);

    public T get(int index);

    public void remove(T value);

    public void clear();

    public void sort();
}
