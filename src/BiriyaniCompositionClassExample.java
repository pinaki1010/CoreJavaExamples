import java.util.HashMap;

public class BiriyaniCompositionClassExample extends BiriyaniRecipeCompositionEx {
    public static void main(String[] args) {

        BiriyaniRecipeCompositionEx bc = new BiriyaniRecipeCompositionEx();
        HashMap<String,Integer> map = new HashMap<>();
        map.put("rice",500);
        map.put("chiken",100);
        map.put("Masala",100);

        bc.calculateBiriyaniinkilo(map);



    }
}
