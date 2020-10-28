package br.com.animati.entity;

public interface Calculator {

	int sum(int a, int b);

	int subtraction(int a, int b);

	int multiplication(int a, int b);

	int divison(int a, int b) throws Exception;

	boolean equalIntegers(int a, int b);

}
