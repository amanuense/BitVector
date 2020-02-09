// Java program to print all Duplicates in array 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

// A class to represent array of bits using 
// array of integers 
class BitArray 
{ 
	int[] arr_glo; 

	// Constructor 
	public BitArray(int n) 
	{ 
		// Devide by 32. To store n bits, we need 
		// n/32 + 1 integers (Assuming int is stored 
		// using 32 bits) 
		arr_glo = new int[(n>>5) + 1]; 
	} 

	// Get value of a bit at given position 
	boolean get_value(int pos) 
	{ 
		// Divide by 32 to find position of 
		// integer. 
		int index = (pos >> 5); 

		// Now find bit number in arr[index] 
		int bit_no = (pos & 0x1F); 

		// Find value of given bit number in 
		// arr[index] 
		return (arr_glo[index] & (1 << bit_no)) != 0; 
	} 

	// Sets a bit at given position 
	void set_value(int pos) 
	{ 
		// Find index of bit position 
		int index = (pos >> 5); 

		// Set bit number in arr[index] 
		int bit_no = (pos & 0x1F); 
		arr_glo[index] |= (1 << bit_no); 
	} 

	// Main function to print all Duplicates 
	static void checkDuplicates(int[] arr) 
	{ 
		// create a bit with 32000 bits 
		BitArray ba = new BitArray(32000); 

    int num, i;
		// Traverse array elements 
		for (i=0; i<arr.length; i++) 
		{ 
			// Index in bit array 
			 num = arr[i] - 1; 

			// If num is already present in bit array 
			if (ba.get_value(num)) 
				System.out.println(num +" "); 

			// Else insert num 
			else
				ba.set_value(num); 
		} 
	} 

	// Driver code 
	public static void main(String[] args) throws
							java.lang.Exception 
	{ 
    
		int[] arr = {1, 5, 1, 10, 12, 10}; 
		checkDuplicates(arr); 
	} 
} 

