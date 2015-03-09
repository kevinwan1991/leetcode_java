package DeckOfCards;

import java.util.Arrays;

public class DeckOfCards {
	private Card[] cards;
	
	public DeckOfCards(){
		cards=new Card[52];
		for(int i=0; i<cards.length; i++){
			cards[i]=new Card(i);
		}
	}
	
	public void shuffle(){
		for(int k=0; k<cards.length; k++){
			int i=(int)(cards.length*Math.random());
			int j=(int)(cards.length*Math.random());
			Card tmp=cards[i];
			cards[i]=cards[j];
			cards[j]=tmp;
		}
	}
	
	public static void main(String[] args){
		DeckOfCards deck=new DeckOfCards();
		deck.shuffle();
		System.out.print(Arrays.toString(deck.cards));
	}
}
