package com.xworkz.enums.constant;

public class StringMethod1 {
	public static void main(String[] args) {
//String name="Sapthasagaradacchae yello";
String sentence="Hello I'm Here to meet you";
String sent1="Hey This is Good Time To Go Trip";

//lengthn
System.out.println("Name length is:"+name.length());
System.out.println("sentence length is:"+sentence.length());
//word count
for(int i=0;i<sentence.length();i++) {
System.out.println("word count of sentence is:"+sentence.charAt(i));
}
//character count
char[] ch=sentence.toCharArray();
for(int j=0;j<sentence.length();j++) {
System.out.println("character count of sentence is:"+sentence.charAt(j));
}
//lowercase the sentence
System.out.println("lowecasing the sentence is:"+sentence.toLowerCase());
//uppercase the sentence
System.out.println("Uppercasing the sentence is:"+sentence.toUpperCase());
//startswith (perfix)
System.out.println(sentence.startsWith(sentence));
//endswith (sufix)
System.out.println(sentence.endsWith(sentence));
//substring (int beginindex)
System.out.println(sentence.substring(6));
//substring(int beginindex,int endindex)
System.out.println(sentence.substring(4, 8));
//equals(object obj)
System.out.println("equaling the sentence:"+sentence.equals(ch));
//trim
System.out.println(sentence.trim());
//subsequence
System.out.println(sentence.subSequence(0, 26));
//charAt 
System.out.println(sentence.charAt(16));
//repeating 
System.out.println(sentence.repeat(7));
//isempty
System.out.println(sentence.isEmpty());
//isblank
System.out.println(sentence.isBlank());
//last index
System.out.println(sentence.lastIndexOf(25));
//replacing the char
System.out.println(sentence.replace('H', 'h'));
//comparing
System.out.println(sentence.compareTo(sentence));
//contains
System.out.println(sentence.contains(sentence));
//content equals
System.out.println(sentence.contentEquals(sentence));
//code point before
System.out.println(sentence.codePointBefore(9));
//code point at
System.out.println(sentence.codePointAt(23));
//concat
System.out.println(sentence.concat(sent1));
//reverse the sentence
for(int h=ch.length-1;h>=0;h--) {
	 System.out.println(ch[h]);
}
//replace all	 
System.out.println(sentence.replaceAll(name,sentence));
//value Of
System.out.println(sentence.valueOf(ch));
//toChararray
System.out.println(sentence.toCharArray());
//value of boolean
System.out.println(sentence.valueOf(false));
//value of int
System.out.println(sentence.valueOf(2));
//copyvalue of int
char[] cha="hey guys this is time to go to trip".toCharArray();
for(int g=0;g<cha.length;g++) {
System.out.println(sentence.copyValueOf(cha));
}
//
int count=0;
int index=sentence.indexOf(sentence);
while (index !=-1) {
	count++;
	index=sentence.indexOf(sentence,index + 1);
}
System.out.println("Number of occurances of :"+count);
//
int count1=0;
int index1=name.indexOf(name);
while (index !=-1) {
	count++;
	index=name.indexOf(name,index + 1);
}
System.out.println(count);

//reversing
String name="Sapthasagaradacchae yello";
String wordToReverse="Sapthasagaradacchae";
String[] words=name.split(" ");
String reverse="";

for(int i=0;i<words.length;i++) {
	if(words[i].equalsIgnoreCase(wordToReverse)) {
		for(int w=words[i].length()-1;w>=0;w++) {
			reverse=reverse+words[w].charAt(i);
		}
		words[w]=reverse;
	}
	for(String w:words) {
		System.out.println(w+" ");
	}
}





}


	}

	
	


