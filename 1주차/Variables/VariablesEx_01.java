//소스코드가 포함된 패키지
package java01_variables;

//클래스 정의하는 코드(자바 프로그램의 기본 구성요소, 객체지향파트에서 자세히 다룸)
public class VariablesEx_01 {

	//메인 메소드 정의 - 프로그램의 시작점(Entry Point, EP)
	public static void main(String[] args) {
		
		System.out.println("하이!"); //모니터의 "하이!를 출력하는 코드
		
		char number; /*int:Data Type 자료 유형, 
		변수 선언 - 변수 공간 생성하기(할당)
		*/
		number = 65; // 변수에 값 대입하기 - 변수 공간에 데이터 저장하기
		
		System.out.println( number ); //모니터에 변수에 저장된 값을 출력하기
		
	} // main end - 프로그램 종료점
	
} //end class 



// 한 줄 주석 - //의 오른쪽 한 줄을 주석으로 처리한다.

/*문장 주석

여러 줄이더라도 시작부분부터 끝까지 주석처리한다. 
-웬만해서는 안쓰는 쪽이 좋다
*/

//ctrl + shift + C 드래그한 부분까지 주석 처리
