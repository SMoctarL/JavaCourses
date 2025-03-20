//Dans ce cours, nous allons voire les opérateurs
/*
 = -> Affectation
 == -> Pour comparer les valeurs de deux variables
 === -> Pour comparer les variable de deux valeur ainsi que leur types
 != < <= > >= Pour mes autres comapraisons comme on les connais en informatique
    NB : '!' est aussi une opérateur d'inversion
 + -> Concaténation
    Exemple :
        int age = 20;
        System.out.println("Vous avez " + age + " age");
 + + * / % -> Pour les calcules standard comme on les connais en informatique

Les notions d'incrémentation et de décrémentation marche aussi dans ce langage. Vous pouvez les verifier par vous meme.
    Exemple : += -= *= /= %=
              ++A | A++ -> pré-incrémentation | post-incrémentation
              --B | B-- -> pré-décrémentation | post-décrémentation

 */
public class Cours4 {
    public static void main(String[] args) {
        System.out.println("Bienvenu au cours 4 ;)");
        //Vous pouvez tester les opérateur d'en haut en adaptant le code selon vos testes.
        boolean result = 14 < 32;
        System.out.println(result); //ceci va retourner true
        //Passons au notion d'incrémentation
        int nb1 = 1;
        int nb2 = nb1++; //Equivaut à nb2 = nb1 esnuite nb1 = nb1 + 1.
        System.out.println(nb1);
        System.out.println(nb2);
        /*Cette premiere instruction affiche
        2
        1
        Pourquoi?:
            au debut, nb1 vallait 1. nb reçoit nb1 mais nb1 va lui ensuite passé à nb1 + 1 à cause du nb1++ (post-incrémentatoin : l'intruction est faite à la fin de l'intrction parent)
            ce qui fait que nb2 prend la valeur 1 (valeur de depart de nb1) et nb1 passe à 2.
        Je vous laisse deviner pas la suite, ce qui va se passer si on change nb1++ par ++nb1

        */


    }
}