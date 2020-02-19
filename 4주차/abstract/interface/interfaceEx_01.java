package java08_abstract.interfaceEx;

abstract class TestClass {
	public abstract void method();
	
}

interface TestInterface{
	//	interface 안에서는 기본적으로 
	//	public static final 이 붙기 때문에 선언과 동시에 초기화를 해줘야함
	public static final int num = 100;
	
	// public static final 을 명시하지 않아도 전부 적용되어있음
	int MAX = 2000;
	static int S = 400;
	final int F = 500;
	
	// abstract 키워드가 없어도 추상메소드로 만들어짐
	public void display();
	
	public abstract void out();
	// 생략이 되기 때문에 추상 메소드는 abstract를 써주는게 헷갈리지 않는다.
}


class Test extends TestClass implements TestInterface{
	
	int t = MAX;
	
	@Override
	public void method() {
	}
	@Override
	public void display() {
	}
	@Override
	public void out() {
	}
	
}




public class interfaceEx_01 {
	public static void main(String[] args) {
		
	}
}
