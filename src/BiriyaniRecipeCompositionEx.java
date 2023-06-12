import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiriyaniRecipeCompositionEx {
    //Composition Class Example
    private String ingreatesName;
    private int amount;

    public String getIngreatesName() {
        return ingreatesName;
    }

    public void setIngreatesName(String ingreatesName) {
        this.ingreatesName = ingreatesName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BiriyaniRecipeCompositionEx(String ingreatesName, int amount) {

        this.ingreatesName = ingreatesName;
        this.amount = amount;
    }
    public BiriyaniRecipeCompositionEx(){

    }
    public void calculateBiriyaniinkilo(Map<String,Integer> req){
        double totalKilo=0;

        for(Map.Entry<String,Integer> it : req.entrySet()){
            totalKilo += it.getValue();
        }
        System.out.println("Total Biriyani Kilo--->"+totalKilo);

    }
}
class Rice extends BiriyaniRecipeCompositionEx{
    BiriyaniRecipeCompositionEx biriyaniRecipeCompositionEx = new BiriyaniRecipeCompositionEx("Rice",200);
}
class Chicken extends BiriyaniRecipeCompositionEx{
    BiriyaniRecipeCompositionEx biriyaniRecipeCompositionEx = new BiriyaniRecipeCompositionEx("Chiken",220);
}
class Masala extends BiriyaniRecipeCompositionEx{
    BiriyaniRecipeCompositionEx biriyaniRecipeCompositionEx = new BiriyaniRecipeCompositionEx("Masala",220);
}
