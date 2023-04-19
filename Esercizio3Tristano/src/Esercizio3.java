import java.util.Scanner;

public class Esercizio3 {
    Scanner sc=new Scanner(System.in);
    public static class Rettangolo{
        public float h;
        public float b;

        public Rettangolo(float h,float b) {
            this.h=h;
            this.b=b;
        }
        public float getb()
        {
            return b;
        }
        public float geth()
        {
            return h;
        }

        public float perimetro() {
            return (b+h)*2;
        }
        public float area () {
            return (b*h);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float h=0;
        float b=0;
         // creating an object of
        // Student
        System.out.println("inserisci la base");
        b= sc.nextFloat();
        System.out.println("inserisci l'altezza");
        h= sc.nextFloat();
        Rettangolo R1 = new Rettangolo(b,h);
        System.out.println("il perimetro del rettangolo è "+R1.perimetro()+" l'area del rettangolo è "+R1.area());
    }

}
