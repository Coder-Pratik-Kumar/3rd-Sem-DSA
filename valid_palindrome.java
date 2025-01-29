import java.util.*;
class valid{
    public static void main(String[] args) {
        String str="IceCreAm";

        int start=0;
        int end=str.length()-1;
        char[] ch=str.toCharArray();
        
        while(start<=end){
            

            for (int i=0;i<ch.length-1;i++){
                for(int j=ch.length-1;j>0;j--){
                    if(isVowel(ch[i])&& isVowel(ch[j])){
                        char temp=ch[j];
                        ch[j]=ch[i];
                        ch[i]=temp;
                    }else if(isVowel(ch[i])){
                        end--;
                    }else{
                        start++;
                    }
                }
            }
        }
        String result=new String(ch);
        System.out.println(result);

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