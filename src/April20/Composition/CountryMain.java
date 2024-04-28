package April20.Composition;

public class CountryMain {

    public static void main(String[] args) {

        Country country = new Country("India", 12000000, "Hindi, Punjabi",
                new TouristSites("Taj Mahal, India Gate"));
        country.printCountryDetails();
    }
}
