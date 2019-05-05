public class Novel extends Book implements Orderable {

    private String summary;


    public Novel(String author, String title) {
        super(author, title);
    }

    public Novel(String author, String title, String summary) {
        super(author, title);
        this.summary = summary;
    }

    @Override
    boolean signedByAuthor() {
        return true;
    }


    @Override
    public void order(int a) {
        System.out.println("Rendelni kell " + a + " az alábbiból " + toString());

    }

    @Override
    public String toString() {
        return "Novel{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
