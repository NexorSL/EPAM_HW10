package behavioral.command;

public class Owner {
    Command sit;
    Command stand;
    Command down;

    public Owner(Command sit, Command stand, Command down) {
        this.sit = sit;
        this.stand = stand;
        this.down = down;
    }

    public void commandSit(){
        sit.execute();
    }

    public void commandStand(){
        stand.execute();
    }

    public void commandDown(){
        down.execute();
    }
}
