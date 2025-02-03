import java.util.*;
import java.util.Map.Entry;
class FirstOccurance{
    public static void main(String[] args) {
        String s= "Leetcode";

        LinkedHashMap<Character,Integer> Lhm=new LinkedHashMap<>();

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);

            if(Lhm.containsKey(ch)){
                int prevVal=Lhm.get(ch);
                Lhm.put(ch,prevVal+1);
            }else{
                Lhm.put(ch,1);
            }
        }
        int reqIndex=-1;
        for(Entry <Character,Integer> entry:Lhm.entrySet()){
            Character key=entry.getKey();
            Integer value=entry.getValue();

            if(value==1){
                reqIndex=s.indexOf(key);
                break;
            }
        }
        System.out.println(reqIndex);
    }
}