package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {
    public static void main(String[] args) throws Exception {
        //Saisir le nombre des employes
        try (Scanner lecture = new Scanner(System.in)) {
            //Saisir le nombre des employes
            System.out.print("Entrez le nombre des emloyes : ");
            int nbre_employes = lecture.nextInt();
            
            String tab_employes[] = new String [nbre_employes];
            int tab_salaires[] = new int[nbre_employes];
            System.out.println("SAISIR LES NOMS DES VOS " + nbre_employes + " EMPLOYES");
            //Boucle pour entrer les employes
            for (int j = 0; j < nbre_employes; j++) {
                System.out.print("Employe numero " + (j+1) + " : ");
                tab_employes[j] = lecture.next();
            }
            System.out.println("");
            System.out.println("SAISIR LES SALAIRES DES VOS " + nbre_employes + " EMPLOYES");
            //Boucle pour entrer les salaires des employes
            for (int j = 0; j < nbre_employes; j++) {
                System.out.print("Salaire de l'employe " + tab_employes[j] + " : ");
                tab_salaires[j] = lecture.nextInt();
            }
            //variables pour stocker le plus grand salaire et l'employe le mieux paye
            int salaire_grand = tab_salaires[0];
            String employeCher = tab_employes[0];
            //Boucle pour comparer les salaires des nos employes
            for(int i = 1; i < nbre_employes; i++){
                if (tab_salaires[i] > salaire_grand) {
                    salaire_grand = tab_salaires[i];
                    employeCher = tab_employes[i];
                }
            }
            //variables pour stocker le plus grand salaire et l'employe le moins paye
            int salaire_petit = tab_salaires[0];
            String employemoinsCher = tab_employes[0];
            //Boucle pour comparer les salaires des nos employes
            for(int i = 1; i < nbre_employes;i++){
                if (tab_salaires[i] < salaire_petit) {
                    salaire_petit = tab_salaires[i];
                    employemoinsCher = tab_employes[i];
                }
            }
            System.out.println("");
            
            int etat = 0;
            do {
                System.out.println("Ecrire  si vous voulez voir l'Evaluation de vos employes");
                etat = lecture.nextInt();
            } while (etat != 1);
            System.out.println("");
            System.out.println("EVALUATIONS DES SALAIRES DES EMPLOYES");
            if (etat == 1) {
                System.out.println("le plus grand salaire est : " + salaire_grand + " Fc" + " et est de " + employeCher);
                System.out.println("Le plus petit salaire est : " + salaire_petit + " Fc" + " et est de " + employemoinsCher);
            }
            
            System.out.println("");
        }
    }
}