package Simon.Chen.spring.boot.test;

public interface MySubscriber<T> {

	public void onEvent(T event);
}
