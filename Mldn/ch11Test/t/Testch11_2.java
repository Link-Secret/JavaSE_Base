package t;

import java.util.Random;

public class Testch11_2 {

	public static void main(String args[]){
		Random r = new Random();
		for(int i=0;i<5;i++){
			System.out.println(r.nextInt(30)+"\t");
		}
	}
	
}
