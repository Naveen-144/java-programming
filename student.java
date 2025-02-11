public class student {
     int marks;
     String name;

     student(int a, String b){   //this is constructor with parameter

        marks = a;
        name = b;
     }

     public static void main(String[] args) {
        student ob = new student(65, "don");
        student ob2 = new student(76, "thala");
        System.out.println(ob.marks+" "+ob.name);
        System.out.println(ob2.marks+" "+ob2.name);
     }
    
}
