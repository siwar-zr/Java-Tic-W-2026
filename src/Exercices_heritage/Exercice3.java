package Exercices_heritage;

import java.util.Scanner;

class Vehicule{
    private String marque;
    private double vitesseMax;

    public Vehicule(String marque, double vitesseMax) {
        this.marque = marque;
        this.vitesseMax = vitesseMax;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(double vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public void afficheInfo(){
        System.out.println("La marque : "+marque);
        System.out.println("La vitesse max : "+vitesseMax);
    }
}

class Voiture extends Vehicule{
    private int nbrPortes;

    public Voiture(String marque, double vm, int np){
        super(marque,vm);
        this.nbrPortes = np;
    }

    public int getNbrPortes() {
        return nbrPortes;
    }

    public void afficheInfo(){
        super.afficheInfo();
        System.out.println("Le nombre de portes : "+nbrPortes);
    }

    public void setNbrPortes(int nbrPortes) {
        this.nbrPortes = nbrPortes;
    }
}

class Moto extends Vehicule{
    private int cylindree;

    public Moto(String marque, double vitesseMax, int cylindree) {
        super(marque, vitesseMax);
        this.cylindree = cylindree;
    }

    public int getCylindree() {
        return cylindree;
    }

    public void setCylindree(int cylindree) {
        this.cylindree = cylindree;
    }

    @Override
    public void afficheInfo() {
        super.afficheInfo();
        System.out.println("Cylindrée : "+cylindree);
    }
}
public class Exercice3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Voulez vous créer une voiture (1) ou une moto (2) : ");
        int choix = sc.nextInt();
        sc.nextLine(); //Consommer le line apres le nextInt (\n)

        if (choix == 1 ){
            System.out.println("Entrez la marque de la voiture : ");
            String marque = sc.nextLine();

            System.out.println("Entrez la vitesseMax de la voiture : ");
            double vitesseMax = sc.nextDouble();

            System.out.println("Entrez le nbre de portes : ");
            int nbreP = sc.nextInt();

            Voiture v1 = new Voiture(marque,vitesseMax,nbreP);
            v1.afficheInfo();
        } else if (choix == 2) {
            System.out.println("Entrez la marque de la moto : ");
            String marque = sc.nextLine();

            System.out.println("Entrez la vitesseMax de la moto : ");
            double vitesseMax = sc.nextDouble();

            System.out.println("Entrez la cylindrée : ");
            int cyl = sc.nextInt();

            Moto m1 = new Moto(marque,vitesseMax,cyl);
            m1.afficheInfo();

        }else {
            System.out.println("Choix invalide ");
        }

        sc.close();

    }
}
