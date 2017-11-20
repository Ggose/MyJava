package p06.ObjectInputOutputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableVersionUIDExample{
	public static void main(String[] args) throws Exception{
		FileOutputStream fos 
		       = new FileOutputStream("c:/temp/Object3.data");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ClassC classC = new ClassC();//저장할 객체 생성
		classC.field1 = 1;
		System.out.println("저장완료");
		oos.writeObject(classC);
		oos.flush(); oos.close(); fos.close();
	}
}
