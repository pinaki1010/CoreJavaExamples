import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccuranceEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Map<Character,Integer> character = new HashMap<>();

        char charCount[] = str.toCharArray();

        for(char c:charCount){

            Integer integer = character.get(c);

            if(integer==null){
                character.put(c,1);
            }else{
                character.put(c,integer+1);
            }


        }
        System.out.println(character);




    }
}
