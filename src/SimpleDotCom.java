import java.util.ArrayList;

/**
 * Created by korolchuk on 27.08.2018.
 */
public class SimpleDotCom {

    private ArrayList<String> locationCells;
    int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String userInput) {
        String result = "Mimo";
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Potopil";
            } else {
                result = "Popal";
            }
        }
        System.out.println(result);
        return result;
    }
}
