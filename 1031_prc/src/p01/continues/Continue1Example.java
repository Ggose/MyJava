package p01.continues;

import javax.swing.plaf.synth.SynthSpinnerUI;

/*
 * continue��;
 */
public class Continue1Example {

	public static void main(String[] args) {
		int i=1; //main�޼ҵ��� ���ú���
		for(;i<=10;i++) {
			System.out.println("\t i="+i);
			if(i>5)break;	//�ݺ��������� ���������� break;��
			System.out.println("\t i="+i);
		}
		System.out.println("i ="+i);
		System.out.println("---------------------------");
		for(;i<=10;i++) {
			System.out.println("\t i="+i);
			if(i>5)continue; //�ݺ��� �������� continue;�� �Ʒ��� ��ɹ��� skip�ϴ� ��;
			System.out.println("\t i="+i);
			
		}
	}
}
