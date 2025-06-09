package s10_DSA.MyArrayList;

public class TestMyArrayList {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Student student = new Student(1,"Thien");
        Student student1 = new Student(2,"Thien1");
        Student student2 = new Student(3,"Thien2");
        Student student3 = new Student(4,"Thien3");
        Student student4 = new Student(5,"Thien4");
        Student student5 = new Student(6,"Thien5");

        MyArrayList<Student> studentMyarrayList = new MyArrayList<>();
        studentMyarrayList.add(student);
        studentMyarrayList.add(student1);
        studentMyarrayList.add(student2);
        studentMyarrayList.add(student3);
        studentMyarrayList.add(student4);
        studentMyarrayList.add(student5);
        studentMyarrayList.size();
        for (int i = 0; i < studentMyarrayList.size(); i++) {
            Student students = (Student) studentMyarrayList.elements[i];

            System.out.println(students.getId());
            System.out.println(students.getName());
        }

    }
}
