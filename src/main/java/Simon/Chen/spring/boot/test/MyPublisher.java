package Simon.Chen.spring.boot.test;

public interface MyPublisher<T> {

	public void register(MySubscriber<T> s);
	public void unregister(MySubscriber<T> s);
	public void publish(T event);
}
