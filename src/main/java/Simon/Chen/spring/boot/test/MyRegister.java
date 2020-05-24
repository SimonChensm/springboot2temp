package Simon.Chen.spring.boot.test;

public abstract class MyRegister {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	abstract public <T> void registerTo(MySubscriber<T> s);
	abstract public <T> void use(MyPublisher<T> p);
}
