package finaltest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

	public static void main(String[] args) {

		System.out.println("put your number");
		Scanner userdata = new Scanner(System.in);
		int c = userdata.nextInt();
		System.out.println(c);

		// create instance of Random class
		List<Integer> data= new ArrayList<Integer>();
		Random rand = new Random();
		for (int i = c; i <= 500; i++) {
			// Generate random integers in range 0 to 500
			int rand_int1 = rand.nextInt(500);
			data.add(rand_int1);
			System.out.println("Random Integers: " + rand_int1);
		}
		// Print random integers
		Arrays.sort(data.toArray());
		//data.sort(Comparator<T>.comparing(Integer::valueOf));
		System.out.println("Minnimum Number is :"+data.toArray()[0]);
		userdata.close();

	}

	private static int comparing(Object object) {
		// TODO Auto-generated method stub
		return 0;
	}

}
