public class PhonebookEntry {

    private int id;
    private String telno;
    private String name;
    private String description;

    public PhonebookEntry(int id, String telno, String name, String description) {
        this.id = id;
        this.telno = telno;
        this.name = name;
        this.description = description;
    }

    public PhonebookEntry(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PhonebookEntry --> " +
                "id:" + id +
                ", telno: " + telno +
                ", name: " + name +
                ", description: " + description
                + '\n';

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
