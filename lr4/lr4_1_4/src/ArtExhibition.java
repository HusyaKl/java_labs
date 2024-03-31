import java.util.ArrayList;
import java.util.List;

public class ArtExhibition {
    private String exhibitionName;
    private String exhibitionDate;
    private List<Painting> paintings;

    public ArtExhibition(String exhibitionName, String exhibitionDate) {
        this.exhibitionName = exhibitionName;
        this.exhibitionDate = exhibitionDate;
        this.paintings = new ArrayList<>();
    }

    public void addPainting(String title, String artist) {
        Painting newPainting = new Painting(title, artist);
        paintings.add(newPainting);
    }

    public void displayPaintings() {
        System.out.println("Картины на выставке " + exhibitionName + " " + exhibitionDate + ":");
        for (Painting painting : paintings) {
            System.out.println("Название: " + painting.getTitle() + " | Художник: " + painting.getArtist());
        }
    }

    public class Painting {
        private String title;
        private String artist;

        public Painting(String title, String artist) {
            this.title = title;
            this.artist = artist;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }
    }

    public static void main(String[] args) {
        ArtExhibition exhibition = new ArtExhibition("Современное искусство", "29 марта, 2024");
        exhibition.addPainting("Звездная ночь", "Ван Гог");
        exhibition.addPainting("Мона Лиза", "Леонардо да Винчи");
        exhibition.addPainting("Постоянство памяти", "САльвадор Дали");

        exhibition.displayPaintings();
    }
}