package lista2;

import java.util.Scanner;



public class exercício2 {

   
    
    public static void main(String[] args) {
        int ano;
       Scanner teclado = new Scanner (System.in);
       
       System.out.println("Digite um ano: ");
       ano = teclado.nextInt();
       
        if (ano<2020) {System.out.println(ano+" é um ano já passado");}      
       else 
        if (ano == 2020) {System.out.println(ano+" é o ano atual");}           
       else 
        if (ano>2020){System.out.println(ano+" é um ano futuro");}
    }
    
}
