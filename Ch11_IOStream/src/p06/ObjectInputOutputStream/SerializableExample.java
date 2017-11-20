package p06.ObjectInputOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * 객체의 직렬화란 -객체의 필드값들이 직렬화 되는것을 말함.
 *              - 객체를 직렬화 하여 파일에 저장.
 * 역직렬화란 - 파일에 저장된 필드값들을 클래스(설계도원본)를
 *            참고해서 새로 객체를 만드는 것.
 * 역직렬화에서 제외되는 필드는
 * - transient로 선언된 필드와 
 *   static으로 선언된 필드 이다.
 * */
public class SerializableExample {
	public static void main(String[] args) {
		File f = new File("c:\\temp\\Object2.dat");
		FileOutputStream fos;
		ObjectOutputStream oos;
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			//파일에 저장할 객체 생성
			ClassA classA = new ClassA();//
			classA.field1=1;
			classA.field2.field1=2;
			classA.field3=3;//static - 직렬화에서 제외!!!
			classA.field4 = 4;//** 직렬화에서 제외!!!
			oos.writeObject(classA);//객체 저장
			System.out.println("객체 저장 성공");
			oos.flush();//밀어내기
			oos.close();   fos.close();
		  System.out.println("----------------------");
		    fis = new FileInputStream(f);
		    ois = new ObjectInputStream(fis);
		    ClassA v = (ClassA)ois.readObject();//객체 읽어들이기 ,new ClassA();
		    System.out.println("field1:"+v.field1);
		    System.out.println("field2:"+v.field2.field1);
		    System.out.println("field3:"+ClassA.field3);
		    System.out.println("field4:"+v.field4);
		} catch (Exception e) {}
	}
}
