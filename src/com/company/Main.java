package com.company;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;
public class Main {
    ;
    public static void main(String[] args) throws Exception
            {

                String[] adjectives = arrayFromUrl("https://cs.leanderisd.org/txt/adjectives.txt");
                String[] nouns      = arrayFromUrl("https://cs.leanderisd.org/txt/nouns.txt");

                System.out.println("Random Movie Title Generator\n");

                System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
                System.out.println("and " + nouns.length + " nouns (" + (adjectives.length*nouns.length) + " combinations).");


                // Declaring two random variables to pull an adjective and a noun from two different arrays
                int rndmAdjec = new Random().nextInt(adjectives.length);
                int rndmNoun = new Random().nextInt(nouns.length);

                //Pulling two random values from the arrays and displaying them
                String adjective = adjectives[rndmAdjec];
                String noun = nouns[rndmNoun];

                System.out.println( "Your movie title is: " + adjective + " " + noun );
            }

            /**
             *	@param url - the URL to read words from
             *	@return An array of words, initialized from the given URL
             */
            public static String[] arrayFromUrl( String url ) throws Exception
            {
                Scanner fin = new Scanner((new URL(url)).openStream());
                int count = fin.nextInt();

                String[] words = new String[count];

                for ( int i=0; i<words.length; i++ )
                {
                    words[i] = fin.next();
                }
                fin.close();

                return words;
            }

        }
