public class CD implements Orderable {

    private String musician;
    private String albumTitle;

    @Override
    public void order(int a) {
        System.out.println("Rendelhető: " + a + toString());

    }

    public CD(String musician, String albumTitle) {
        this.musician = musician;
        this.albumTitle = albumTitle;
    }

    public String getMusician() {
        return musician;
    }

    public void setMusician(String musician) {
        this.musician = musician;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    @Override
    public String toString() {
        return "CD{" +
                "musician='" + musician + '\'' +
                ", albumTitle='" + albumTitle + '\'' +
                '}';
    }
}
