package p01_references;

public class Arr05Example {
/*
 * arry점수 구하기
 * 타입[][] 2차원배열
 */
	public static void main(String[] args) {
		
		int sum=0;
		double avg=0;
		int kor=0;
	
		int total=0;
		String [] title = {"이름","국어","영어","수학","총점","평균"};
		String [] name = {"일지매","이순신","임꺽정","홍길동"};
		
		int[][] score = {{90,80,70},{76,86,90},{90,78,90},{80,80,80}};//
		System.out.println("성적표\n");
		for(String t:title) {
			System.out.print(t+"\t");
		}
		System.out.println();
		for(int i=0;i<44;i++) {
			System.out.print("=");
		}
		System.out.println();
		for(int i =0;i<score.length;i++) {	//이름 점수 출력시작
			//이름출력
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				
				System.out.print(score[i][j]+"\t");
			
			sum+=score[i][j];
			avg=sum/score[i].length;
			//System.out.println(sum+sum/score[i].length);
			}
			System.out.print(sum);
			sum=0;
			System.out.print("\t"+avg);
			avg=0;
			System.out.println();
		}//이름 점수 출력 끝
		for(int i=0;i<44;i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.print("합계"+"\t");
		
		for(int j=0;j<score[j].length;j++) {
			for(int i=0;i<score.length;i++) {
			kor = kor+score[i][j];
			}
			System.out.print(kor+"\t");
			kor=0;
		}
		for(int i =0;i<score.length;i++) {	//이름 점수 출력시작
			
			for(int j=0;j<score[i].length;j++) {
			
			sum+=score[i][j];
		
			//System.out.println(sum+sum/score[i].length);
			}
		
		}//이름 점수 출력 끝
		System.out.print(sum);
		avg=sum/4;
		System.out.print("\t"+avg);
		System.out.println();
		
			
	}
}
