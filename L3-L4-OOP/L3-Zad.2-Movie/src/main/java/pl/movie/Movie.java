package pl.movie;

public class Movie {
    private String title;
    private String directorName;
    private int featureLength;
    private int yearOfProduction;

    public Movie(String title, String directorName, int featureLength, int yearProduction) {
        this.title = title;
        this.directorName = directorName;
        this.featureLength = featureLength;
        this.yearOfProduction = yearProduction;
    }

    public String getTitle() {
        return title;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getFeatureLength() {
        return featureLength;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
