package Project2;


import java.util.Scanner;

public class EmailRegistration {
    private String email;
    private String userName;
    private String passWord;

    public void setEmail(String email){
        if (email.endsWith("@yahoo.com")){
            this.email=email;
            System.out.println("Email set to: " + email);

        }else {
            System.out.println("Invalid input. Must be Yahoo email.");
        }
    }
    public void setUserName(String userName){
        if (userName.length()>6) {
            this.userName=userName;
            System.out.println("Username set to " + userName);

        } else if (userName.isEmpty()) {

            System.out.println("Username must not be empty");

        } else{
            System.out.println("Username must be longer than 6 character");
        }
    }
    public void setPassWord(String passWord){
        if (passWord.length()>6 && !passWord.contains(userName)){
            this.passWord=passWord;
            System.out.println("Password Set");

        }else {
            System.out.println("Password must be longer than 6 character and must not contain the username");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        EmailRegistration registration=new EmailRegistration();
        System.out.println("Enter your email");
        String email=scanner.nextLine();
        registration.setEmail(email);

        System.out.println("Enter your username");
        String username=scanner.nextLine();
        registration.setUserName(username);

        System.out.println("Enter your password");
        String password=scanner.nextLine();
        registration.setPassWord(password);


scanner.close();
    }
}
