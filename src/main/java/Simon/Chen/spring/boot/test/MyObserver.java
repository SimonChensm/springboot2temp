package Simon.Chen.spring.boot.test;

public abstract class MyObserver {

	private int a;
	private String name;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
