import java.util.ArrayList;
public class Task {
    public static void main(String[] args) {
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:" + hand);
        System.out.println("Cards add:" + addCards(hand));

        for (Card tmp : d) {
            System.out.print(tmp.toString());
        }
    }

    public static int addCards(ArrayList<Card> hand) {
 /* TODO 
This should compute the sum of values of the cards in an ArrayList of cards.*/
        int result = 0;
        for (Card tmp : hand) {
                if (tmp.getValue().toString().equals("Ace"))
                    result += 1;
                else if (tmp.getValue().toString().equals("Jack"))
                    result += 11;
                else if (tmp.getValue().toString().equals("Queen"))
                    result += 12;
                else if (tmp.getValue().toString().equals("King"))
                    result += 13;
                else
                result += Integer.valueOf(tmp.getValue().toString());
        }
            return result;
    }
}