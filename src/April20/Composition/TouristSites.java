package April20.Composition;

public class TouristSites {

    public String places;

    TouristSites(String places){
        this.places = places;
    }

    @Override
    public String toString() {
        return "TouristSites{" +
                "places='" + places + '\'' +
                '}';
    }
}
