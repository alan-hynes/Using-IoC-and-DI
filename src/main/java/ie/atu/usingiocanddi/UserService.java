package ie.atu.usingiocanddi;

public class UserService {
    private EmailService emailService;

    public UserService() {
        this.emailService = new EmailService(); //Tight coupling
    }

    public void registerUser(String username, String email) {
        // some user registration logic

        // Send confirmation email
        emailService.sendEmail(email, "Welcome to our platform");
    }
}
