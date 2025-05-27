package task06;

public class Bondhus extends SocialMedia {
    private String[] sentBox = new String[5];
    private int sentCount = 0;

    public Bondhus(String name, String mail) {
        super(name, mail);
    }

    public void sendMessage(String message) {
        if (sentCount < sentBox.length) {
            sentBox[sentCount] = message;
            sentCount++;
        } else {
            System.out.println("Sentbox is full.");
        }
    }

    public void showSentbox() {
        System.out.println(userName + "'s Sentbox:");
        if (sentCount == 0) {
            System.out.println("No sent messages.");
        } else {
            for (int i = 0; i < sentCount; i++) {
                System.out.println(sentBox[i]);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nMessages Sent: " + sentCount;
    }
}



