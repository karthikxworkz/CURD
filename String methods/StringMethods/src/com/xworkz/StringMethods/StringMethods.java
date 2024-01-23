package com.xworkz.StringMethods;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String sentence="As a Cubin boy said:We Meet Once Again";
		
		System.out.println(sentence);
		System.out.println(sentence.length());//length()
		System.out.println(sentence.charAt(16));
		System.out.println(sentence.substring(7,11));
		System.out.println(sentence.replace('a', 'A'));//replaced
		System.out.println(sentence.toString());
		System.out.println("---------"+sentence.codePointAt(2));
		System.out.println(sentence.codePointBefore(1));
		System.out.println(sentence.codePointCount(1, 4));
		System.out.println(sentence.compareTo(sentence));
		System.out.println(sentence.compareToIgnoreCase(sentence));
		System.out.println(sentence.concat("b"));
		System.out.println(sentence.contains("y"));
		System.out.println(sentence.contentEquals(sentence));
		System.out.println(sentence.contentEquals(null));
		System.out.println(sentence.endsWith(sentence));
		System.out.println(sentence.equals(sentence));
		System.out.println(sentence.equalsIgnoreCase(sentence));
		System.out.println(sentence.hashCode());
		System.out.println(sentence.indent(35));
		System.out.println(sentence.indexOf(26));
		System.out.println(sentence.indexOf(12, 26));
		System.out.println(sentence.indexOf(sentence, 18));
		System.out.println(sentence.isBlank());
		System.out.println(sentence.isEmpty());
		System.out.println(sentence.lastIndexOf(25));
		System.out.println(sentence.lastIndexOf(sentence));
		System.out.println(sentence.lastIndexOf(10, 20));
		System.out.println(sentence.lastIndexOf(sentence, 22));
		System.out.println(sentence.toCharArray());
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence.toLowerCase(null));
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toUpperCase(null));
		System.out.println(sentence.translateEscapes());
		System.out.println(sentence.trim());
		System.out.println(sentence.regionMatches(11, sentence, 13, 15));
		System.out.println(sentence.regionMatches(false, 9, sentence, 3, 6));
		System.out.println(sentence.repeat(28));
		System.out.println(sentence.replace("said", "Said"));
		System.out.println(sentence.replaceFirst("a", "A"));
		System.out.println(sentence.codePointBefore(24));
		System.out.println(sentence.valueOf(false));
		System.out.println(sentence.valueOf(35));
		System.out.println(sentence.valueOf(23));
		System.out.println(sentence.valueOf(6));
		System.out.println(sentence.startsWith("a"));
		System.out.println(sentence.subSequence(1, 28));
		System.out.println(sentence.substring(27));
		System.out.println(sentence.split(sentence));
		System.out.println(sentence.split(sentence, 17));
		System.out.println(sentence.subSequence(12, 24));
		System.out.println(sentence.formatted(null));
		System.out.println(sentence.matches(sentence));
		System.out.println(sentence.format(sentence, null));
		System.out.println(sentence.codePoints());
	}

}
