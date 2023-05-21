import java.util.*; 

public class OnlineExamination 
{  
    static String username; 
    static String password; 
    static int duration; 
    static String name; 
    static int age; 
    static String[] answers; 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
  
        // Login 
        System.out.println("Enter Your Username:"); 
        username = sc.next(); 
        System.out.println("Enter Your Password:"); 
        password = sc.next(); 
        System.out.println("Logged In Successfully"); 
  
        // Updating profile and password 
        System.out.println("Enter Your Name:"); 
        name = sc.next(); 
        System.out.println("Enter Your Age:"); 
        age = sc.nextInt(); 
        System.out.println("Enter New Password:"); 
        password = sc.next(); 
        System.out.println("Profile Updated Successfully"); 
  
        // Selecting answers for MCQs 
        System.out.println("Enter Answers for MCQs:"); 
        int n = sc.nextInt(); 
        answers = new String[n]; 
        for (int i = 0; i < n; i++) { 
            System.out.println("Enter Answer " + (i + 1) + ":"); 
            answers[i] = sc.next(); 
        } 
        System.out.println("Answers Submitted Successfully"); 
  
        // Timer and auto submit 
        System.out.println("Enter Timer Duration (minutes):"); 
        duration = sc.nextInt(); 
        System.out.println("Timer Started"); 
        while (duration != 0) { 
            System.out.println("Time Left: " + duration + " minutes"); 
            try { 
                Thread.sleep(60000); 
            } 
            catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
            duration--; 
        } 
        System.out.println("Time's Up. Answers Submitted Automatically"); 
		sc.close();
		
        // Closing session and log out 
        System.out.println("Session Closed. Logging Out"); 
        username = null; 
        password = null; 
        name = null; 
        age = 0; 
        answers = null; 
        duration = 0; 
        System.out.println("Logged Out Successfully"); 
    } 
}