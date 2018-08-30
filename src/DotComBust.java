import java.util.ArrayList;

/**
 * Created by korolchuk on 30.08.2018.
 */
public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuess = 0;

    public void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Vasha cel - potopit 3 saita");
        System.out.println(one.getName() + " " + two.getName() + " " + three.getName());
        System.out.println("potopit za minimum popyitok");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    public void startPlaying() {

        while (!dotComList.isEmpty()) {
            String userGuess = helper.getUserInput("Sdelaite hod");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void finishGame() {
        System.out.println("Vse saityi ushli ko dnu");
        if (numOfGuess <= 18) {
            System.out.println("Eto zanyalo " + numOfGuess + " popyitok");
        } else {
            System.out.println("Eto zanyalo mnogo popyitok" + numOfGuess);
        }
    }

    private void checkUserGuess(String userGuess) {

        numOfGuess++;

        String result = "Mimo";
        for (DotCom dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Popal")) {
                break;
            }
            if (result.equals("Potopil")){
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);

    }

}
