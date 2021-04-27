import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
//        Student student = new Student("cong",22);
//        xulyfile.ghifile(student,"test.ptt");
        ArrayList<Student> data = new ArrayList<>();
        data.add(new Student("cong", 22));
        data.add(new Student("kieu anh",18));
        data.add(new Student("hoang",28));
        xulyfile.ghifile(data,"testarray1.txt");
//        ArrayList<Student> students = xulyfile.docfile("testarray.txt");
//        System.out.println(students);

    }
}
