package caelum;

import java.io.*;
import java.util.*;

public class PrimeWordMain {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fileReader =  new FileReader("input.txt");
		
		Scanner scanner = new Scanner(fileReader);
		String read;
		int valueRead =0 ;
		while(scanner.hasNextLine()){
			read = scanner.nextLine();
			valueRead = valueTransform(read);
			if(isPrime(valueRead)){
				System.out.println("It is a prime word");
			}else {
				System.out.println("It is not a prime word");
			}
			
			}
		scanner.close();
	}

	private static boolean isPrime(int valueRead) {
		if(valueRead == 2 || valueRead == 3) { return true;}
		if(valueRead%2 == 0 || valueRead%3 == 0){ return false;}
		for(int i = 3; i*i<= valueRead ;i+=2){
			if(valueRead%i == 0) {
				return false;
			}
		}
		return true;
	}

	private static int valueTransform(String read) {
		int i ,totalValue = 0;
		for(i=0; i<read.length() ; i++){
			switch (read.charAt(i)) {
			case 'a': totalValue += 1;	break;
			case 'b': totalValue += 2;	break;
			case 'c': totalValue += 3;	break;
			case 'd': totalValue += 4;	break;
			case 'e': totalValue += 5;	break;
			case 'f': totalValue += 6;	break;
			case 'g': totalValue += 7;	break;
			case 'h': totalValue += 8;	break;
			case 'i': totalValue += 9;	break;
			case 'j': totalValue += 10;	break;
			case 'k': totalValue += 11;	break;
			case 'l': totalValue += 12;	break;
			case 'm': totalValue += 13;	break;
			case 'n': totalValue += 14;	break;
			case 'o': totalValue += 15;	break;
			case 'p': totalValue += 16;	break;
			case 'q': totalValue += 17;	break;
			case 'r': totalValue += 18;	break;
			case 's': totalValue += 19;	break;
			case 't': totalValue += 20;	break;
			case 'u': totalValue += 21;	break;
			case 'v': totalValue += 22;	break;
			case 'w': totalValue += 23; break;
			case 'x': totalValue += 24;	break;
			case 'y': totalValue += 25;	break;
			case 'z': totalValue += 26;	break;
			case 'A': totalValue += 27;	break;
			case 'B': totalValue += 28;	break;
			case 'C': totalValue += 29;	break;
			case 'D': totalValue += 30;	break;
			case 'E': totalValue += 31;	break;
			case 'F': totalValue += 32;	break;
			case 'G': totalValue += 33;	break;
			case 'H': totalValue += 34;	break;
			case 'I': totalValue += 35;	break;
			case 'J': totalValue += 36;	break;
			case 'K': totalValue += 37;	break;
			case 'L': totalValue += 38;	break;
			case 'M': totalValue += 39;	break;
			case 'N': totalValue += 40;	break;
			case 'O': totalValue += 41;	break;
			case 'P': totalValue += 42;	break;
			case 'Q': totalValue += 43;	break;
			case 'R': totalValue += 44;	break;
			case 'S': totalValue += 45;	break;
			case 'T': totalValue += 46;	break;
			case 'U': totalValue += 47;	break;
			case 'V': totalValue += 48;	break;
			case 'W': totalValue += 49;	break;
			case 'X': totalValue += 50;	break;
			case 'Y': totalValue += 51;	break;
			case 'Z': totalValue += 52;	break;

			default:
				break;
			}
		}
		return totalValue;
	}
	

}
