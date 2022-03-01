import java.util.*;

public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};
    public Deck() {
/* TODO
This constructor initializes the deck variable with
all the cards of a deck, except a joker.
The suits array may help you.*/
        deck = new ArrayList<>();
        for(int i =0;i< suits.length;i++)
        {
            deck.add(new Card("Ace", suits[i]));
            for(int j = 2;j < 11;j++)
                deck.add(new Card(j, suits[i]));

            deck.add(new Card("Jack", suits[i]));
            deck.add(new Card("Queen", suits[i]));
            deck.add(new Card("King", suits[i]));
            Collections.shuffle(deck);
        }


    }

    public Card dealCard(){
/* TODO
Code this. It is almost EXACTLY as the  method to draw one object
from the bag in the previous task. The difference is that this method
REMOVES the card from the deck */
        int ind = (int)(deck.size() * Math.random());
        Card pickedCard= (Card)deck.remove(ind);
        return pickedCard;
    }

    public int size(){/* TODO: Return the size of the deck (number of cards left in it)*/
        return deck.size();
    }
    @Override
    public Iterator<Card> iterator() {
       /* TODO 
Return a new DeckIterator with this instance in the constructor.*/
        Iterator<Card> it = new DeckIterator(this);
        return it;
    }
}
