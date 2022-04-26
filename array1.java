class Student {
   public int rollno;
   public String name;
   Student(int rollno,String name) {
       this .rollno = rollno;
       this.name = name;
       
   }
}

public class array1{
    public static void main(String[] args) {
           Student[]arr ;
           arr = new Student[5];

           arr[0] = new Student(1,"aman");
           arr[1]= new Student(2, "vaibhav");
           arr[2]=new Student(3, "shiker ");
           arr[3] =new Student(4, "rakhi");
           arr[4] = new Student(5,"devil");
           for (int i = 0; i < arr.length; i++) {
               System.out.println("Elements at "+i+":"+arr[i].rollno+""+arr[i].name);
           }


    }
}