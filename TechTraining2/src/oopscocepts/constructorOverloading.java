package oopscocepts;

public class constructorOverloading {
	/*
	 * constructorOverloading(){ System.out.println("Default constructor"); }
	 * constructorOverloading(int n1,int n2){
	 * System.out.println("int parameterised  constructor"); }
	 * constructorOverloading(float n1,float n2){
	 * System.out.println("float parameterised constructor"); }
	 */
	constructorOverloading(int n1,float n2){
		System.out.println(" constructor overloadong");
	}
	constructorOverloading(float n1,int n2){
		System.out.println("constructor overloadong");
	}
	
	

	public static void main(String[] args) {
		/*
		 * constructorOverloading n1=new constructorOverloading();
		 * constructorOverloading n2=new constructorOverloading(1,2);
		 * constructorOverloading n3=new constructorOverloading(1.f,2.f);
		 */
		constructorOverloading n4=new constructorOverloading(2,2);//constructor overloading
	}

}
