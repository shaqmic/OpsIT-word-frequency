package com.ubs.opsit.interviews.wordfrequency;

import java.util.HashMap;
import java.util.Map;

public interface WordFrequency {

    Map<String, Integer> countOccurrencesOfWordsWithin(String stringToEvaluate);

}

class Interview implements WordFrequency{
    
    public static void main(String[] arg){
//         HashMap<String, numOfData> Map2;
//         Interview shaquille = new Interview();
//         Map2 = shaquille.countOccurrencesOfWordsWithin("the man in the moon");
//         System.out.println(Map2.toString());
//         Map2 = shaquille.countOccurrencesOfWordsWithin("the man on the moon");
//         System.out.println(Map2.toString());  
//         Map2 = shaquille.countOccurrencesOfWordsWithin("The Man left.\n The moon!");
//         System.out.println(Map2.toString());
     }
    
    HashMap<String, numOfData> Map = new HashMap();    
     public HashMap countOccurrencesOfWordsWithin(String stringToEvaluate){
         //Try-catch block to handle runtime errors
         try
         {
            String [] arr = stringToEvaluate.split(" ");
            for(int i = 0;i < arr.length; i++)
             {
                 if(arr[i].isEmpty()){
                     continue;
                 }
                 while (checkString(arr[i])){
                     arr[i]= trimString(arr[i]);
                 }
                 if(arr[i].contains("\t"))
                 {
                     String [] temparr = arr[i].split("\t");
                     for (String x : temparr){
                         x.trim();
                         while (checkString(x)){
                            x = trimString(x);
                            }
                         if(Map.get(x.toLowerCase()) != null)
                         {
                            Map.get(x.toLowerCase()).increment();
                         }
                        else
                         {
                            Map.put(x.toLowerCase(), new numOfData());
                        } 
                     }
                     continue;
                 }
                 if(arr[i].equals("\n"))
                 {
                     String [] temparr = arr[i].split("\n");
                     for (String x : temparr){
                         x.trim();
                         while (checkString(x)){
                            x = trimString(x);
                            }
                         if(Map.get(x.toLowerCase()) != null)
                         {
                            Map.get(x.toLowerCase()).increment();
                         }
                        else
                         {
                            Map.put(x.toLowerCase(), new numOfData());
                        } 
                     }
                     continue;
                 }
                 if(arr[i].contains("/"))
                 {
                     String [] temparr = arr[i].split("/");
                     for (String x : temparr){
                         x.trim();
                         while (checkString(x)){
                            x = trimString(x);
                            }
                         if(Map.get(x.toLowerCase()) != null)
                         {
                            Map.get(x.toLowerCase()).increment();
                         }
                        else
                         {
                            Map.put(x.toLowerCase(), new numOfData());
                        } 
                     }
                     continue;
                 }
                //If the data is in the hashmap
                if(Map.get(arr[i].toLowerCase()) != null){
                    Map.get(arr[i].toLowerCase()).increment();
                    }
                //If the data is not in the hashmap
                else{
                    Map.put(arr[i].toLowerCase(), new numOfData());
                    } 
             }
         }
         catch(NullPointerException e)
         {
             System.out.println("Null Input Entered "+"\n"+e);
             
         }
         
         return Map;
     }
     public static boolean checkString(String x){
        if(x.endsWith(" "))
             {
                 return true;
             }
        if(x.endsWith("\n"))
             {
                 return true;
             }
        if(x.endsWith("\t"))
             {
                 return true;
             }
        if(x.endsWith("."))
             {
                 return true;
             }
        if(x.endsWith("!"))
             {
                 return true;
             }
        if(x.endsWith("%"))
             {
                 return true;
             }
        if(x.endsWith("/"))
             {
                 return true;
             }
        if(x.endsWith("\""))
             {
                 return true;
             }
        if(x.endsWith("\\"))
             {
                 return true;
             }
        if(x.endsWith(","))
             {
                 return true;
             }
        if(x.endsWith("?"))
             {
                 return true;
             }
        if(x.endsWith(")"))
             {
                 return true;
             }
        if(x.endsWith("("))
             {
                 return true;
             }
        if(x.substring(0, 1).equalsIgnoreCase(".")){
                 return true;
             }
        if(x.substring(0, 1).equalsIgnoreCase("!")){
                return true;
             }
        if(x.substring(0, 1).equalsIgnoreCase("%")){
                 return true;
             }
        if(x.substring(0, 1).equalsIgnoreCase("/")){
                return true;
             }
        if(x.substring(0, 1).equalsIgnoreCase("\"")){
                 return true;
             }
        if(x.substring(0, 1).equalsIgnoreCase("\\")){
                 return true;
             }
        if(x.substring(0, 1).equalsIgnoreCase(",")){
                 return true;
             }
        if(x.substring(0, 1).equalsIgnoreCase("?")){
                 return true;
             }
        if(x.substring(0, 1).equalsIgnoreCase("(")){
                 return true;
             }
        if(x.substring(0, 1).equalsIgnoreCase(")")){
                 return true;
             }
        if(x.substring(0, 1).equalsIgnoreCase("\n")){
                 return true;
             }
        if(x.substring(0, 1).equalsIgnoreCase(" ")){
                 return true;
             }
        if(x.substring(0, 1).equalsIgnoreCase("\t")){
                 return true;
             }
             
         
         //passed
         return false;
     }
     public static String trimString(String x){
        while(x.endsWith(" "))
             {
                 x = x.substring(0, x.length()-1);
             }
        while(x.endsWith("\t"))
             {
                 x = x.substring(0, x.length()-1);
             }
        while(x.endsWith("\n"))
             {
                 x = x.substring(0, x.length()-1);
             }
        while(x.endsWith("."))
             {
                 x = x.substring(0, x.length()-1);
             }
        while(x.endsWith("!"))
             {
                 x = x.substring(0, x.length()-1);
             }
        while(x.endsWith("%"))
             {
                 x = x.substring(0, x.length()-1);
             }
        while(x.endsWith("/"))
             {
                 x = x.substring(0, x.length()-1);
             }
        while(x.endsWith("\""))
             {
                 x = x.substring(0, x.length()-1);
             }
        while(x.endsWith("\\"))
             {
                 x = x.substring(0, x.length()-1);
             }
        while(x.endsWith(","))
             {
                 x = x.substring(0, x.length()-1);
             }
        while(x.endsWith("?"))
             {
                 x = x.substring(0, x.length()-1);
             }
        while(x.endsWith(")"))
             {
                 x = x.substring(0, x.length()-1);
             }
        while(x.endsWith("("))
             {
                 x = x.substring(0, x.length()-1);
             }
        while(x.substring(0, 1).equalsIgnoreCase(".")){
                 x = x.substring(1);
             }
        while(x.substring(0, 1).equalsIgnoreCase("!")){
                 x = x.substring(1);
             }
        while(x.substring(0, 1).equalsIgnoreCase("%")){
                 x = x.substring(1);
             }
        while(x.substring(0, 1).equalsIgnoreCase("/")){
                 x = x.substring(1);
             }
        while(x.substring(0, 1).equalsIgnoreCase("\"")){
                 x = x.substring(1);
             }
        while(x.substring(0, 1).equalsIgnoreCase("\\")){
                 x = x.substring(1);
             }
        while(x.substring(0, 1).equalsIgnoreCase(",")){
                 x = x.substring(1);
             }
        while(x.substring(0, 1).equalsIgnoreCase("?")){
                 x = x.substring(1);
             }
        while(x.substring(0, 1).equalsIgnoreCase("(")){
                 x = x.substring(1);
             }
        while(x.substring(0, 1).equalsIgnoreCase(")")){
                 x = x.substring(1);
             }
        while(x.substring(0, 1).equalsIgnoreCase(" ")){
                 x = x.substring(1);
             }
        while(x.substring(0, 1).equalsIgnoreCase("\t")){
                 x = x.substring(1);
             }
        while(x.substring(0, 1).equalsIgnoreCase("\n")){
                 x = x.substring(1);
             }
        
        return x;
     } 
     
}
class numOfData{
    private int data = 1;
    public void increment(){
        data ++;
    }
    public int getData(){
        return data;
    }
    public String toString(){
        return ""+data;
    }
    
}