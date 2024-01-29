package sorter;
import java.util.Arrays;
import java.util.Scanner;

public class numbersorter {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Podaj liczbę");
		
		int input = scanner.nextInt();
		int[] array = new int[input];
		int[]zdobyteLiczby = getNumbers(input);
		System.out.println("Twoje posortowane liczby to "+ Arrays.toString(bubbleSort(zdobyteLiczby)));

	}
	
	public static int[] bubbleSort(int[]b) {
		for(int i =0; i<b.length -1; i++)
			for(int j =0; j<b.length -1 -i ; j++) {
				int next = j+1;
				if(b[j]>b[next]) {
					int tmp = b[j];
					b[j]=b[next];
					b[next]=tmp;}		
				}
			return b;
		
	}
	
	public static int[] getNumbers(int x) {
		int [] wynik = new int[x];
		for(int i = 0;i<x;i++) {
			System.out.println("Podaj liczbę numer " + (i+1) );
			int y = scanner.nextInt();
			wynik[i] +=y;
		}
		return wynik;
	}
	
	
	
	
}