public class array4 {  
    public static void main(String[] args) {
        int intarray[] = {1,2,3};

        int clonearray[] = intarray.clone();

        System.out.println(intarray == clonearray);
        System.out.println(intarray[0] == clonearray[0]);
        System.out.println(intarray[1] == clonearray[1]);
    }
}
