class Students {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }
}
public class Static {
    public static void main(String[] args) {
        Students.school = "ABC";
        Students s1 = new Students();
        s1.name = "Tony";
        System.out.println(s1.school);
    }
}
