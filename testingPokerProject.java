
public class testingPokerProject 
{

	public static void main(String[] args)
	{
		
		Card card1 = new Card('H', "4", 4);
		Card card2 = new Card('D', "4", 4);
		Card card3 = new Card('C', "4", 4);
		Card card4 = new Card('S', "J", 11);
		Card card5 = new Card('C', "K", 13);
		Card[] hand = {card5, card3, card1, card2, card4};
		
		int[] arr = {0,1,2,3,4};
		Card exchcard = new Card('S', "4", 4);
		Card exchcard2 = new Card('D', "A", 14);
		Card exchcard3 = new Card('H', "J", 11);
		Card exchcard4 = new Card('D', "2", 2);
		Card exchcard5 = new Card('C', "4", 4);
		Card[] cards = {exchcard5, exchcard3, exchcard2, exchcard4, exchcard};
		
		PokerHand test = new PokerHand(hand);
		PokerHand test2 = new PokerHand();
		
		System.out.println(test.toString());
		System.out.println(test.getBestHand());
		System.out.println(test.toString());
		
		System.out.println(test2.toString());
		System.out.println(test2.getBestHand()); //should idsplay royal
		System.out.println(test2.toString());
		
		//After discord
		test.discard(arr, cards);
		System.out.println(test.toString());
		
		System.out.println(test.getBestHand());
		System.out.println(test.toString());
//		Deck deck = new Deck();
//		
//		
//		
//		deck.shuffle();
//		for(int i = 0; i < cards.length; i ++)
//		{
//			System.out.println(cards[i]);
//		}
	}

}
