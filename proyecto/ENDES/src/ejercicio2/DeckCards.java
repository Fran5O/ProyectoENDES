package ejercicio2;

import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {
		//Declara las variables del mazo
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		//Almacena las variables
		ArrayList<Card> deck = new ArrayList<Card>();
		//Bucle que se encarga de barajar las cartas
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
		//Calcula que carta sacar
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		//Muestra en pantalla las 5 primeras cartas del mazo
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
