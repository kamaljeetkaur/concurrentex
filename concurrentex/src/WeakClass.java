import java.lang.ref.SoftReference;

class XYZ {
	int x;
	public XYZ(int x) {
		this.x=x;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjj" +this.x);
	}
}


public class WeakClass {
	static int counter;
	public static void main(String[] args) {
		XYZ obj = new XYZ(100);
		SoftReference<XYZ> weak = new SoftReference<XYZ>(obj);
		obj = null;
		System.gc();
		
	}
	
	
}
