package com.xworkz.list.runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProgrammingLanguage {
	
	public static void main(String[] args) {
		
		List languageList=new ArrayList();
		languageList.add("C++");
		languageList.add("C");
		languageList.add("Java");
		languageList.add("Python");
		languageList.add("Sql");
		languageList.add("MySql");
		languageList.add("JAvascript");
		languageList.add("Html");
		languageList.add("Css");
		languageList.add("js");
		
		languageList.add("frameWork");
		languageList.add("Jdbc");
		languageList.add("Orcale");
		languageList.add("fff");
		languageList.add("ddd");
		languageList.add("sss");
		languageList.add("aaa");
		languageList.add("hhg");
		languageList.add("www");
		languageList.add("rrr");
		
		languageList.add("qqq");
		languageList.add("eeee");
		languageList.add("ttt");
		languageList.add("aaa");
		languageList.add("ddd");
		languageList.add("hhh");
		languageList.add("kkkk");
		languageList.add("lll");
		languageList.add("ccc");
		languageList.add("nnn");
		
		System.out.println("Listed are:"+languageList);
		System.out.println("Size of the Lists:"+languageList.size());
		//for each
		languageList.forEach((ggg)->System.out.println(ggg));
		System.out.println("For each:"+languageList);
		//One List
		List<List<String>> list=new ArrayList();
		list.add(languageList);
		
		//iterator
		Iterator<String> iterator=languageList.iterator();
		System.out.println(iterator);
		
		//has next
		while(iterator.hasNext()) {
			System.out.println("Has next:"+iterator.next());
		}
		
		//next
		while(iterator.next()!=null) {
			System.out.println("Next:"+iterator.next());
		}
		
		//foreachremaining
//		(iterator.forEachRemaining(s->System.out.println(s));
			
		}
	}


