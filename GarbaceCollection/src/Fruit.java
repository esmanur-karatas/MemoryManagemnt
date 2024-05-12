
public class Fruit {
	private String name;

	public Fruit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override 
	public void finalize() throws Throwable {
		System.out.println(name + " isimli meyve objesi silindi!");
	}
}
