package main.todo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * Write a program that receives a word A and some texts as input. You need to output the texts (without modifying them) in the ascending order of the number of occurrences of the word A in the texts. The input is as follows: an integer M (between 1 and 100, inclusive), followed by the word A in the next line, and some text in each of the M next lines. 

Note: The texts and the word A contain only lowercase Latin letters (a, b, c, …, z) and blank spaces (“ ”). The maximum size of the texts and the word A is 100 characters. Every text has a different number of occurrences of the word A. 

Note2: You must print one text per line without modifying the texts.

Case 1:

For input given as:

2
java
i hate java
python is a good programing language

The output of the program will be:

python is a good programing language
i hate java

Case 2:

For input given as: 

3
python
i like to code in python
python is named after a show named monty python and not after the snake python
i think python is good i think python is more important than php

The output of the program will be:

i like to code in python
i think python is good i think python is more important than php
python is named after a show named monty python and not after the snake python
 * @author deniz.gul
 *
 */
public class NumberOfOccurences {
	public static void main (String[] args) throws java.lang.Exception 
	{

 	//use the following code to fetch input from console 
 	String line; 
 	BufferedReader inp = new BufferedReader (new InputStreamReader(System.in)); 
 	line=inp.readLine();
  
  	int m = Integer.parseInt(line);
  	
  	String wordA = inp.readLine();
  
  	String[] textInputs = new String[m];

  	HashMap<Integer, Integer> mapOfOccurences = new HashMap<Integer,Integer>();
  
  	for (int i=0; i < m ;i++) {
      textInputs[i] = inp.readLine();
      int occurences = computeOccurences(textInputs[i], wordA);
      mapOfOccurences.put(i,occurences);
    }
 
  	//sort by values
 	mapOfOccurences = mapOfOccurences.entrySet().stream() 
    .sorted(Entry.comparingByValue()).collect(
    Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
  
  	Iterator<Map.Entry<Integer, Integer>> entries = mapOfOccurences.entrySet().iterator();
  
  	while(iterator.hasNext()){
      Map.entry<Integer,Integer> entry = entries.next();
      
     System.out.println(textInputs[entry.key]);
    }
  
 	//Use the following code to print output
 	
}

public static int computeOccurences(String input, String word) {
  String[] splitted = input.split("\\s");
  int counter=0;
  for(int i = 0; i <splitted.length; i++) {

    if(splitted[i].equalsIgnoreCase(word)) {
      counter++;
    }
  }

  return counter;

}
}
