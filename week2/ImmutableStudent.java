package java_roadmap.week2;

import java.util.ArrayList;
import java.util.List;

  final class ImmutableStudentTesting {
     final private int id;
     final private String name;
     final private List<String> courses;


     public ImmutableStudentTesting(int id, String name, List<String> courses) {
         this.id = id;
         this.name = name;
         List<String> temp = new ArrayList<>();



         for(String course : courses) {
             temp.add(course);
         }

         this.courses = temp;
     }


     public int getId() {
         return id;
     }


     public String getName() {
         return name;
     }

     public List<String> getCourses() {
         return List.copyOf(courses);
     }
 }

 public class ImmutableStudent {
     public static void main(String[] args) {

         ImmutableStudentTesting t = new ImmutableStudentTesting(1, "John Doe", new ArrayList<>());

         System.out.println(t.getCourses());
         System.out.println(t.getName());

     }

}
