/*
Ici,  on va voire les variables en Java
-Pas de caractéres spéciaux, pas d'espace
-Commence par une lettre ou underscore(_)
    UneVariableUnPeuLong (Camel case)
    UneVariable (Pascal case)
    une_variable (snake case)
*/
public class Cours3 {
    public static void main(String[] args) {
        System.out.println("Salut. Bienvenu au cours 3 ;)");
        //Declaration d'une variable toute simple
        int userAge = 0, cours = 3;
        System.out.println(cours);
        System.out.println("La valeure de la variable userAge vaut : " + userAge);
        //Declaration d'une variable constante : avec le mot clés final
        final int Number = 26;
        System.out.println("La valeure de la variable Number qui est notre constante vaut : " + Number);
        //Essayon de modifier la valeur de Number
        //Le programme va platé car notre variable était une constante. (code mis en commentaire)
        /*Number = 14;
        System.out.println(Number);*/
    }
}