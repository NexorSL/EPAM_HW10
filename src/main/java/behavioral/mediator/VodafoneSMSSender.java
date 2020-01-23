package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class VodafoneSMSSender implements Sender, VodafoneSender {
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToSender(User user) {
        this.users.add(user);
    }

    @Override
    public void sendSms(String sms, User user) {
        for (User u : users) {
            if(u!=user){
                u.getSms(sms);
            }
        }
        admin.getSms(sms);
    }

    @Override
    public void sendSmsToAll(String sms) {
        for (User u : users) {
            u.getSms(sms);
        }
        admin.getSms(sms);
    }
}
