public class ExerciseBook extends Book {

    private int numOfExercises;


    public ExerciseBook(String author, String title, int numOfExercises) {
        super(author, title);
        this.numOfExercises = numOfExercises;
    }

    @Override
    boolean signedByAuthor() {
        return false;
    }

    public int getNumOfExercises() {
        return numOfExercises;
    }

    public void setNumOfExercises(int numOfExercises) {
        this.numOfExercises = numOfExercises;
    }

    @Override
    public String toString() {
        return "ExerciseBook{" +
                "numOfExercises=" + numOfExercises +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
