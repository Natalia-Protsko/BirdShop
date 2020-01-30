package hierarchy;

public class Launcher {

    public static void main(String[] args) {
        Posting [] postings = new Posting[3];

        System.out.println("--- Posting");
        postings[0] = new Posting("It's a posting","Posting sender","Posting receiver");
        System.out.println("--- ValuedPosting");
        postings[1] = new ValuedPosting("It's a valued posting","Valued posting sender","Valued posting receiver",100.20);
        System.out.println("--- BigValuedPosting");
        postings[2] = new BigValuedPosting();
        ((BigValuedPosting)postings[2]).description = "Big valued posting description";



        for (Posting posting : postings) {
            posting.say();

        }


    }
}
