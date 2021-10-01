package com.company;
import java.util.Collection;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Collection <String> languages = new ArrayList<>();
        //Set <String> languages= new HashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Ruby");
        languages.add("java");
        languages.add("C++");
        languages.add("C");
        System.out.println(languages);
        //5th
        System.out.println("The size of Array List: "+languages.size());

        //1st

        Iterator it = languages.iterator();
        for(int i=0; i<languages.size();i++){
            System.out.println(((ArrayList<String>) languages).get(i));
        }

        //2nd
        String[] array = new String[languages.size()];
        languages.toArray(array);
        for(int i = 0; i<array.length; i++){
            System.out.println(i+" "+array[i]);
        }
        //3rd
        System.out.println("Does list contain java? :"+languages.contains("Java"));
        System.out.println("Does list contain python? :"+languages.contains("Python"));


    }
}
