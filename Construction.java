
package construction;
public class Construction {
    public static void main(String[] args) {
        User Ord = new User();
        
        Ord.setUsername("Ard");
        Ord.setPassword("HaHo");
        
        System.out.println("Username : "+ Ord.getUsername());
        System.out.println("Password : "+ Ord.getPassword());
    }
}


//    class Democonstructor{
//    public static void main(String [] args) {
//        User Ard = new User("Ardavand", "Hahe");
//        System.out.println("Username : "+ Ard.username);
//        System.out.println("Password : "+ Ard.password);
//    }
//}
