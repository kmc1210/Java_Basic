package java08_abstract.interfaceEx;

interface InterA{
	public abstract void getA();
}

interface InterB{
	public abstract void getB();
}

interface InterC extends InterA, InterB{
	public abstract void getC();
}

class Child03 implements InterC{
//class Child03 implements InterA, InterB, InterC{

	@Override
	public void getA() {
	}

	@Override
	public void getB() {
	}

	@Override
	public void getC() {
	}

	
}


public class InterfaceEx_03 {

}
