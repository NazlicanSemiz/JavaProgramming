package day09_IfStatements;

public class ChooseLanguage {
    public static void main(String[] args) {

        int language = 5; //1-5

        String message = ( language >=1 && language<=5)? (language==1)? "Hello' thanks for your call"
                :(language==2)? "Hola, gracias para llamar" :(language==3)? "Merhaba, aradiginiz icin tesekkurler"
                :(language==4)? "Privet, spasibo za vash zvonok" :"Merci ,pour votre appel" :"Invalid Message" ;

        System.out.println(message);
    }
}
/*
3. Creata a class called ChooseLanguage, Given an integer variable named selection
that has a number between 1~5, Write a program that can select the language based
on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
 */