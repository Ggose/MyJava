package p05.newinstance;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Controller {
	static private Map<String,Action> map
	    = new HashMap<String,Action>();
	public static void main(String[] args) {
		//command.properties의 정보를 저장할 객체 생성
		Properties props = new Properties();
		//File구분자 "/", "\\"
		File f = new File("src/p05/newinstance/command.properties");
		try {
			//file로 부터 정보를 입력받은 객체 
			FileReader fis = new FileReader(f);
			//통로를 통해서 외부파일의 정보를 ㅣ와 값의 형태로 property객체에 저장
			//load(통로);
			props.load(fis);//입력받은 객체로 부터 property형식으로 값을 저장
			//property객체에는 키와 값으로 저장되어있고
			//키가 중복이 되어 있을수 있기 때문에 
			//중복을 방지하는 Set에 키들만 다시 저장함.
			//Set객체는 자료를 중복저장하지 않고, 순서가 없는 저장객체
			Set keySet = props.keySet();//키들만 set에 저장
			//순서가 없는 객체를 저장한 Set에서
			//값을 처음부터 끝까지 순회하면서 출력하기 위한
			//객체 - Interator
			//Iterator는 객체의 처음,현재,다음 번지값만 저장.
			Iterator keyItor = keySet.iterator();
			while(keyItor.hasNext()) {
				String command = (String)keyItor.next();
				String className = props.getProperty(command);
				Class clazz;
				clazz = Class.forName(className);
				Action action = (Action)clazz.newInstance();
				//map에 저장 put(키,값)
				map.put(command, action);//키와 값의 형태로 자료 저장 put(키,값)
			}
			//인스턴스 저장 작업 완료
			System.out.println("명령어 입력");
			Scanner scanner = new Scanner(System.in);
			String commandStr = scanner.next();
			Action action = map.get(commandStr);
			action.execute();//재정의된 메소드 실행
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
