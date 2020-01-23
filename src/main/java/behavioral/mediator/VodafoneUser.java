package behavioral.mediator;

public class VodafoneUser implements User {
    Sender sender;
    String name;

    public VodafoneUser(Sender sender, String name) {
        this.sender = sender;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void getSms(String sms) {
        System.out.println(this.name + " receiving message: " + sms + ".");
    }

    @Override
    public void sendSms(String sms) {
        sender.sendSms(sms, this);
    }
}
