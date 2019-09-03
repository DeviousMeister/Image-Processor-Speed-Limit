package support.test;

import support.lab3.Model;

public class ModelTest {

	public static void main(String [] args){
		Model ms = new Model(5,5,.2);
		ms.print(false);
		ms.print(true);
	}
}
