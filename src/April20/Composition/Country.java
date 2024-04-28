package April20.Composition;

public class Country {

    public String name;
    public double population;
    public String language;

    TouristSites sites;

    Country(String name, double population, String language, TouristSites sites){
        this.name = name;
        this.population = population;
        this.language = language;
        this.sites = sites;
    }

    public void printCountryDetails(){
        System.out.println("Name: " + name + "\nPopulation: " + population + "\nLanguage: "
                + language + "\nTourist Sites: " + sites);
    }
}
