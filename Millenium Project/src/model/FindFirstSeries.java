package model;

import java.util.ArrayList;

public class FindFirstSeries {
	private ArrayList<Integer> firstList;
	private ArrayList<Integer> secondList;
	private ArrayList<Integer> thirdList;
	private ArrayList<Integer> fourthList;
	private String sequence;
	private int sequenceType;
	private int sequenceCount;
	private int no;
	private int yes;
	int numberOfValues;

	public FindFirstSeries() {
		initializeStuff();
		start();
	}

	private void initializeStuff() {
		numberOfValues = 17;
		sequence = "";
		sequenceType = 0;
		sequenceCount = 0;
		no = 0;
		yes = 0;

		firstList = new ArrayList<Integer>();
		secondList = new ArrayList<Integer>();
		thirdList = new ArrayList<Integer>();
		fourthList = new ArrayList<Integer>();
	}

	private void start() {

		for (int currentNumber = 0; currentNumber < Math.pow(2,
				numberOfValues - 1); currentNumber++) {
			int temporaryNumber = currentNumber;

			firstList.clear();
			secondList.clear();

			for (int counter = 1; counter <= numberOfValues; counter++) {
				if (temporaryNumber % 2 == 1)
					secondList.add(counter);
				else
					firstList.add(counter);

				temporaryNumber = temporaryNumber / 2;
			}

			thirdList = new ArrayList<Integer>(firstList);
			fourthList = new ArrayList<Integer>(secondList);
			// sort the lists.

			String outputString = "";
			String outputStringTwo = "";

			for (Integer currentCount : firstList) {
				outputString = currentCount + "," + outputString;
			}

			outputString = outputString.substring(0, outputString.length() - 1);

			outputString += " - ";

			for (Integer currentCount : secondList) {
				outputStringTwo = currentCount + "," + outputStringTwo;
			}

			outputString += outputStringTwo;

			outputString = outputString.substring(0, outputString.length() - 1);

			int something = addPossibility();

			if (something == sequenceType) {
				sequenceCount += 1;
			} else {
				sequence += sequenceCount + "-";
				sequenceCount = 1;
				sequenceType = something;
			}

			outputString += "	" + something;

			if (something == 1) {
				System.out.print(outputString);
				yes += 1;
				// try to do something more!
				doSomethingMore();
				System.out.println(" 1");
			} else {
				no += 1;
				// System.out.println(outputString);
			}

		}
		sequence += sequenceCount;
		System.out.println(sequence);
		System.out.println("Yes:  " + yes);
		System.out.println("No:  " + no);
		int both = yes + no;
		System.out.println("Both:  " + both);
		System.out.println("Other:  " + Math.pow(2,numberOfValues-1)/Math.pow(numberOfValues-1, 3));
		double percent = (double)yes/both;
		System.out.println("Percent:  " + percent);
		

	}

	private void doSomethingMore() {

		thirdList.get(0);

	}

	private int addPossibility() {
		boolean stillLooping = false;
		boolean continuing = true;
		while (continuing == true) {

			stillLooping = true;
			for (int j = secondList.size() - 1; j >= 0; j -= 1) {
				if (firstList.size() > 0)
					if (firstList.get(firstList.size() - 1) > secondList.get(j)) {
						firstList.remove(firstList.size() - 1);

						secondList.remove(j);
						stillLooping = false;
						j = 0;
					}

			}
			if (stillLooping == true) {

				continuing = false;

			}
		}
		if (secondList.size() == 0)
			return 0;
		else
			return 1;
	}

	private void replaceArray(int numberOne, int numberTwo, int numberThree) {
		for (Integer currentCount : firstList) {
			if (firstList.get(currentCount) == numberOne) {
				firstList.remove(currentCount);
				firstList.add(numberTwo);
				firstList.add(numberThree);
			}
		}
	}

}
