package Assignment2;

public class Run {

    public static void main(String[] args) {

        Student[] students = new Student[]{new UnderGrad("Saaligha", "216108780", 50.0D), new UnderGrad("Yasmine", "215408780", 550.0D), new PostGrad("Jonah", "216154580", 530.0D), new UnderGrad("Bobby", "232447804", 750.0D), new UnderGrad("Jaylinn", "216923789", 10.0D)};

        for (int x = 0; x < students.length; ++x) {
            System.out.println(students[x]);

        }

    }

}
