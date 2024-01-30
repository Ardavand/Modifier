
package construction;
public class User {
    private String username;
    private String password;
    
//    public User(String username, String password){
//        this.username = username;
//        this.password = password;
//    }
    
//    public User(){
//        System.out.println("eksekusi method constructor...");
//    }
//    
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
}


//class Democonstructor{
//    public static void main(String [] args) {
//        User Ard = new User("Ardavand", "Hahe");
//        System.out.println("Username : "+ Ard.username);
//        System.out.println("Password : "+ Ard.password);
//    }
//}
    
