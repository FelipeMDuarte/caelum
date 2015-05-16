package caelum;

import java.io.*;
import java.util.*;

public class PrimeWordMain {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fileReader =  new FileReader("input.txt");
		BufferedReader reader = new BufferedReader(fileReader);

		//Scanner scanner = new Scanner(System.in);
		System.out.println("Alo");
		String read;
		int valueRead;

		try {
			while(reader.readLine() != null){
				System.out.println("entrei no while");
				read = reader.readLine();
				System.out.println("li isso : "+read);
				valueRead = valueTransform(read);
				System.out.println("passei pelo value transform e virou isso " + valueRead);
				isPrime(valueRead);
				System.out.println("Passei pelo isprime");
			}
			reader.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		//scanner.close();
	}

	private static void isPrime(int valueRead) {
		if(valueRead < 2) {	System.out.println("It is not a prime word"); 	}
		if(valueRead == 2 || valueRead == 3) { System.out.println("It is a prime word");}
		if(valueRead%2 == 0 || valueRead%3==0 ){ System.out.println("It is not a prime word");}
		long squareRoot = (long) Math.sqrt(valueRead)+1;
		for(long i = 6L; i<=squareRoot ;i+=6){
			if(valueRead%(i-1)==0 || valueRead%(i+1)==0) {
				System.out.println("It is not a prime word");
			}
		}
		System.out.println("It is a prime word");
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
