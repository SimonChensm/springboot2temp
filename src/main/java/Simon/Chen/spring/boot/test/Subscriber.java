package Simon.Chen.spring.boot.test;

public interface Subscriber<T> {

	public void onEvent(T event);
}
