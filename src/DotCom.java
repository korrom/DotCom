import java.util.ArrayList;

/**
 * Created by korolchuk on 30.08.2018.
 */
public class DotCom {

    private ArrayList<String> locationCells;

    public String getName() {
        return name;
    }

    private String name;

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String userInput) {
        String result = "Mimo";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Potopil";
                System.out.println("Oi! Vyi potopili " + name + " :(");
            } else {
                result = "Popal";
            }
        }
        return result;
    }
}
