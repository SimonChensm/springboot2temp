package Simon.Chen.spring.boot.test;

public abstract class MyRegister {

	private int sn;
	private String name;

	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
