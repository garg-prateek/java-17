package com.garg.java17.random;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomGeneratorDemo {

	public static void main(String[] args) {

		RandomGenerator randomGenerator = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();
		System.out.println(randomGenerator.getClass());
		
		RandomGeneratorFactory.all().map(factory->factory.group()+":"+factory.name()).sorted().forEach(System.out::println);

		int i = 0;

		while (i <= 10) {
			int num = randomGenerator.nextInt(20);
			System.out.println(num);
			i++;
		}
	}

}
