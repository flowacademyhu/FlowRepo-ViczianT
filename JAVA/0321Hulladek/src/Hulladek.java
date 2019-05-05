public abstract class Hulladek {

    private final String HULLADEK_FEM = "fem";
    private final String HULLADEK_UVEG = "uveg";
    private String alapanyag;
    private  String leiras = "";
    private int tomeg = 1;

    public Hulladek(String alapanyag, String leiras, int tomeg) {
        this.alapanyag = alapanyag;
        this.leiras = leiras;
        this.tomeg = tomeg;
    }
}
