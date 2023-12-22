import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner s = new Scanner(System.in); 

            System.out.println("Qual o nome do seu personagem?");

            String nome = s.next();
        
            System.out.println("Quanto de XP seu personagem possui?");

            int xp = s.nextInt();

            if (xp<1000) {
                System.out.println("O Herói de nome " + nome +  ", está no nível Ferro com " + xp + " de XP");    
            }else if(xp>=1000 && xp<=2000){
                System.out.println("O Herói de nome " + nome +  ", está no nível Bronze com " + xp + " de XP");
            } else if(xp>2000 && xp<=5000){
                System.out.println("O Herói de nome " + nome +  ", está no nível Prata com " + xp + " de XP");
            } else if(xp>5000 && xp<=7000){
                System.out.println("O Herói de nome " + nome +  ", está no nível Ouro com " + xp + " de XP");      
            }else if(xp>7000 && xp<=8000){
                System.out.println("O Herói de nome " + nome +  ", está no nível Platina com " + xp + " de XP");
            }else if(xp>8000 && xp<=9000){
                System.out.println("O Herói de nome " + nome +  ", está no nível Ascendente com " + xp + " de XP");
            }else if(xp>9000 && xp<=10000){
                System.out.println("O Herói de nome " + nome +  ", está no nível Imortal com " + xp + " de XP");
            }else{
                System.out.println("O Herói de nome " + nome +  ", está no nível Radiante com " + xp + " de XP");
            }
        }
    }
