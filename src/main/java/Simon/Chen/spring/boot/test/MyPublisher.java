package Simon.Chen.spring.boot.test;

public interface MyPublisher<T> {

	public void register(Subscriber<T> s);
	public void unregister(Subscriber<T> s);
	public void publish(T event);
}
