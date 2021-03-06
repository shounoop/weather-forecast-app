package data;

public class City {
    private long id;
    private String name;
    private Coord coord;
    private String country;
    private long population;
    private int timezone;
    private long sinrise;
    private long sunset;

    public City() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coord getCoord() {
        return coord;
    }

    public String getCountry() {
        return country;
    }

    public long getPopulation() {
        return population;
    }

    public int getTimezone() {
        return timezone;
    }

    public long getSinrise() {
        return sinrise;
    }

    public long getSunset() {
        return sunset;
    }
}