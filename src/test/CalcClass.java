package test;

public class CalcClass implements Calcinterface {

	@Override
	public int add(int x, int y) {
		int a = x+y;
		return a;
	}

	@Override
	public int subtract(int x, int y) {
		int a= x-y;
		return a;
	}

	@Override
	public int multiply(int x, int y) {
		// TODO Auto-generated method stub
		int a=x*y;
		return a;
	}

	@Override
	public float divide(int x, int y) {
		// TODO Auto-generated method stub
		float a =(float)x/y;
		return a;
	}

	@Override
	public int remainder(int x, int y) {
		// TODO Auto-generated method stub
		int a= x%y;
		return a;
	}

	
	
	

}
