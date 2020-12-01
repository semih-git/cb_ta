package org.cb.ta.FullTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.base.Predicate;

public class StreamSession {
	public static void main(String[] args) {		
		String[] namesArray = {"Zig-Zag Traversal","Nikola Tesla",
				"Spiderman","Superman","Edison", "Newton", "Timmy", 
				"Archimed", "Einstein"};
		List<String> names = new ArrayList<>(Arrays.asList(namesArray));
		
		for(int j=0; j<names.size(); j++) {
			String string = names.get(j);
			if(string.startsWith("Z")) {
				System.out.println(names);
			}
		}
	
	Integer [] numbersArray = {1,2,3,4,5,6,7,8,9,10};
	List<Integer> numbers = new ArrayList<>(Arrays.asList(numbersArray));
	
	//find even number using for loop.
	for(int i=0; i<numbers.size();i++) {
		Integer integer = numbers.get(i);
		if(integer%2==0) {
			System.out.print("  "+ integer);
		}
	}	
	System.out.println();
	
	//find even numbers using stream API.
	Predicate<Integer> predicate = (Integer number) -> {return number % 2 == 0;};
	List<Integer> evens = numbers.stream().filter(predicate).collect(Collectors.toList());
	System.out.println(evens);
	
	//find even numbers using stream api.
	evens = numbers.stream()
			.filter((Integer number)->(number %2 ==0))
			.collect(Collectors.toList());
	System.out.println(evens);
	System.out.println(numbers);
	
	//assignment
	//of
	Stream.of(numbersArray)
		 	.filter((Integer number)->(number %2==0))
			.collect(Collectors.toList());
	
	//count
	System.out.println("count: " + Stream.of(numbersArray).count());
	
	//sort
	Stream.of(numbersArray).sorted().collect(Collectors.toList());
	
	//sort comparator interface usage.
	Comparator<Integer> comparaObje = (number1,number2)->{
		return -1*number1.compareTo(number2);};
	
	Stream.of(numbersArray).sorted(comparaObje)
			.collect(Collectors.toList());
	
	//sort with lambda.
	Stream.of(numbersArray)
		.sorted((number1,number2)->{return -1*number1.compareTo(number2);})
		.collect(Collectors.toList());
	
	//forEach with functional interface.
	Consumer<Integer> ci = (number) ->{System.out.print(" "+number);};
	Stream.of(numbersArray).forEach(ci);
	System.out.println();
	
	//lambda.
	Stream.of(numbersArray).forEach((number)->{
		int numSquare=number*number;
		System.out.print(" "+numSquare);});
	}
}
