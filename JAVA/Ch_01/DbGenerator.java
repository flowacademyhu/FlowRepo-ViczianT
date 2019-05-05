public class DbGenerator {
  public static void main(String[] args) {
    // System.out.println(
    //   String.format("Az en nevem: %s, korom %s, anyam: %s",
    //   "Peti", "12", "Juli")
    //   );

    // String[] names = {"Feri", "Kata", "Tasi", "Gyorgyi"};
    // for(String name: names) {
    //   System.out.println(
    //     String.format("Kedvenc patasom: %s", name)
    //   );
    // }
    // String[] roles = {"admin", "user", "dementor", "feri"};
    // for(String role: roles) {
    //   System.out.println(
    //     String.format("insert into roles (name) values ('%s');", role)
    //   );
    // }
    int FIX_VALUE = 10;
    // System.out.println(Math.round((Math.random() * FIX_VALUE) + 1));
    
    String[] emails = {"mari@spam4.me", "juli@spam4.me", "karcsi@spam4.me", "feri@spam4.me",
    "edit@spam4.me", "nikol@spam4.me", "heni@spam4.me", "gadzsi@spam4.me",
    "kheeeee@spam4.me", "szottyos@spam4.me"};

    String[] fullnames = {"N/a", "Toth Janos", "Kis Karcsi", "Nagy Feri", "Editke Edit",
    "Black Nikol", "Hencego Heni", "Hááá Gadzsi", "PHP", "Cobol"};

    for (int i = 0; i < FIX_VALUE; i++) {
      var randomNumber = (int) Math.floor(Math.random() * FIX_VALUE);
      System.out.println(
        String.format("insert into users (email, fullname, password, role_id) values ('%s', '%s', '%s', %s);", 
        emails[i], fullnames[i], getRandomPassword(), getRandomRoleId()
        )
      );
    }
  }
  public static String getRandomPassword() {
    return "";
  }
  public static String getRandomRoleId() {
    return "1";
  }
}