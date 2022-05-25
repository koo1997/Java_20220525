package test;

public interface Calcinterface {
	
	/**
	 * 더하기
	 * @param x 입력값
	 * @param y 입력값
	 * @return 결과값
	 */
	public int add(int x,int y); 
	 /**
	  * 빼기
	  * @param x 입력값
	  * @param y 입력값
	  * @return	결과값
	  */
	public int subtract(int x,int y);
	 /**
	  * 곱하기
	  * @param x 입력값
	  * @param y 입력값
	  * @return 결과값
	  */
	public int multiply(int x,int y);
	 /**
	  * 나누기
	  * @param x 입력값
	  * @param y 입력값
	  * @return 결과값
	  */
	public float divide(int x,int y);
	 /**
	  * 나머지
	  * @param x 입력값
	  * @param y 입력값
	  * @return 결과값
	  */
	public int remainder(int x,int y);
	
	

}
