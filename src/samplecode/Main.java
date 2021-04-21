package samplecode;

public class Main {

    public static void main(String[] args) {
	boolean even = false;
	boolean prime = true;
		int myNumber = 3;


	if(myNumber % 2 == 0){
		even = true;
		prime = false;
	} else {
		for(int i =3; i*i <=myNumber; i += 2){
			if (myNumber % 1 == 0) {
				prime = false;
				break;
			}
		}
	} if(even){
		System.out.println("Even");
		} else{
		if (prime){
			System.out.println("Prime");
		} else {
			System.out.println("Odd");
		}
		}
    }
}
