package com.selenium.practice.main;

class ReverseString {
	
	public static void main(String[] args) {
        
        String name = "My name is senthilkumar";
        String words[] = name.split("\\s");
        String reverseWords="";
        for (String w:words){
            
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWords+=sb.toString()+"";
        }
          reverseWords.trim();
          System.out.println(reverseWords);        
    }   

}
