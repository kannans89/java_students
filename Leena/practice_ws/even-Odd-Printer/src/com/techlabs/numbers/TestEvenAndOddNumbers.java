package com.techlabs.numbers;
import com.techlabs.numbers.NumberSeries;
import com.teclabs.printer.SeriesPrinter;

public class TestEvenAndOddNumbers {

	public static void main(String[] args) {
		NumberSeries numberSeriesObject=new NumberSeries();
		SeriesPrinter seriesPrinterObject=new SeriesPrinter();
		
		for(int number=0;number<=200;number++){
			numberSeriesObject.checkNumber(number);
		}
	
		
		System.out.print("Even numbers :- ");
		seriesPrinterObject.printNumbers(numberSeriesObject.getevenNumbersList());
		System.out.print("Odd numbers :- ");
		seriesPrinterObject.printNumbers(numberSeriesObject.getoddNumbersList());

	}

}
