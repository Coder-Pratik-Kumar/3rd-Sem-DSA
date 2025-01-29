import java.util.*;
class Vowels{
    public static void main(String[] args) {
        String str="Pratik";
        char[] ch= str.toCharArray();
        int countV=0;
        int countC=0;
        for(int i=0;i<ch.length;i++){
            if(isVowel(ch[i])){
                countV++;
            }else{
                countC++;
            }
        }
        System.out.println(countV);
        System.out.println(countC);
    }
    public static boolean isVowel(char ch){
        ArrayList<Character> list=new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');

        if(list.contains(ch)){
            return true;
        }
        return false;
    }
}