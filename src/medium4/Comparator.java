package medium4;

public class Comparator implements java.util.Comparator<String> {

    @Override
    public int compare(String country1, String country2) {
        if (country1.equals("Греция") && !country2.equals("Греция")) {
            return -1;
        }
        if (country2.equals("Греция")) {

            return 1;
        }
        return country1.compareTo(country2);
    }

}
