
public class Single {
	
	private volatile static Single single;
	//threadlocal      
	
	// eager initialisation
	private Single() { }

	// lazy initialisation
	public static Single getSingle() {
		if(single == null) {
			System.out.println("More then once");
			single = new Single();
		}
		return single;
	}
	
	public Resource getResource(){
		return new Resource();
	}
	
	public synchronized void create() {
		getResource().createFile();
	}
	
	public synchronized void write(String content) {
		getResource().writeFile(content);
	}
	
	public synchronized void read() {
		getResource().readFile();
	}
}
