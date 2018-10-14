package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
public static int findBrokenEgg(List<String> eggs) {
		
		for (int i = 0; i < eggs.size(); i++) {
			
			if(eggs.get(i)=="cracked") {
				return i;
			}
			
		}
		return 0;	
	}
	static int oysterCount = 0;
	public static int countPearls(List<Boolean> oysters) {
		
		for (int i = 0; i < oysters.size(); i++) {
			
			if(oysters.get(i)==true) {
				oysterCount +=1;
			}
			
		}
		return oysterCount;
	}
	
	public static double findTallest(List<Double> peeps) {
		double value = 0;
		for (int i = 0; i < peeps.size(); i++) {
			
			if(peeps.get(i) > value){
			value = peeps.get(i);
		}
		}
		return value;
	}
	
	static int place = 0;
	static int length = 0;
	public static String findLongestWord(List<String> words) {
		
		for (int i = 0; i < words.size(); i++) {
	
			if(words.get(i).length()>length) {
				place = i;
				length = words.get(i).length();
			}
		}		
		return words.get(place);
	}
	
	public static boolean containsSOS(List<String> list) {
		
		System.out.println(list);
		
			if(list.contains(" ... --- ... ")) {
				
				return true;
				
			}else {

				return false;
			}
	}
	static double t = 0;
	static double p = 0;
	static double q = 0;
	public static List<Double> sortScores(List<Double> results) {
		
		for (int x = 0; x < results.size(); x++) {
			for (int y = 0; y < x+1; y++) {
				p = results.get(x);
				q = results.get(y);
				if(q>p) {
					
					t = results.get(x);
					results.set(x, results.get(y));
					results.set(y, t);
					
				}
				
			}
			
		}
		return results;
		
	}
	public static List<String> sortDNA(List<String> array) {
		for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < array.size(); j++) {
				if(array.get(j).length()>array.get(i).length()) {
				String temp = array.get(j);
				array.set(j, array.get(i));
				array.set(i, temp);
			}
			}
		}
		for (int j = 0; j < array.size(); j++) {
			System.out.println(array.get(j));
		}
		return array;
	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.size(); j++) {
				if(words.get(j).compareTo(words.get(i))>0) {
					String temp = words.get(j);
					words.set(j, words.get(i));
					words.set(i, temp);
				}
			}
		}
		return words;
		
	}

}
