package behavioral.mediator;

public class Runner {
    public static void main(String[] args) {
        VodafoneSMSSender smsSender = new VodafoneSMSSender();

        User admin = new Admin(smsSender, "Admin");
        User user1 = new VodafoneUser(smsSender, "User 1");
        User user2 = new VodafoneUser(smsSender, "User 2");

        smsSender.setAdmin(admin);

        smsSender.addUserToSender(user1);
        smsSender.addUserToSender(user2);

        user1.sendSms("Hello, i am User 1!");
        smsSender.sendSmsToAll("Noviu paket ot vodafone!!!");
    }
}
