package myappsapps.com.customlistviewadapter;

public class LearnLanguages {
    private String nameOfLang;
    private int imageID;
    private int numberOfTutorials;

    public LearnLanguages(String nameOfLang,  int imageID,int tutorialNuber) {
        this.nameOfLang = nameOfLang;
        this.numberOfTutorials = tutorialNuber;
        this.imageID = imageID;
    }

    public int getNumberOfTutorials() {
        return numberOfTutorials;
    }

    public String getNameOfLang() {
        return nameOfLang;
    }

    public int getImageID() {
        return imageID;
    }
}
