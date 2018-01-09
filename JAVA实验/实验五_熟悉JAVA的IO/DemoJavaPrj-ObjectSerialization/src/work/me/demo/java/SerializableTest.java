package work.me.demo.java;

public class SerializableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DataInputHandle handle = new DataInputHandle();
	    handle.readData();
	    handle.flattenStudent();
	    handle.inflateStudent();
	}

}
