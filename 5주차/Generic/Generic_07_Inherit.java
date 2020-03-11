package java11_generic;


//제네릭 클래스
class Parent<T>{
	T data1;
}

class Child01 extends Parent{ // T -> Object
	
	
}

class Child02 extends Parent<String>{ // T -> String
	
}

class Child03<K> extends Parent<K>{ // T -> K
	//상속받은 타입 파라미터를 결정하는 것을 미룬다.
	
}

class Child04<M, N> extends Parent<M> {
	N data2;
	
	// M data1 : 상속받을 제네릭 M을 이용한 멤버필듯, 타입 미결정
	// N data2 : 자식 클래스의 고유한 제네릭 N 멤버필드, 타입 미결정
}



public class Generic_07_Inherit {
	public static void main(String[] args) {
		
		Child03<Integer> c = new Child03<>(); // T-> K -> Integer
	}
}
