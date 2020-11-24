public class Application {
    String name;
    double age;
    int height;

    public Application(String name, double age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void checkApplication () {
        if (this.age > 30 && this.height > 160) {
            System.out.println("User is older than 30 and higher than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
}