package lesson_42;

public interface OurMap <E,T>{
    void put( E key, T value);

    T get(E key);

    boolean contains( E key);

    boolean remove( E key );

    int size();
}
