public class Hello {
    // exo3 2
    public static int somme (int[] tab) {
        int r = 0;
        for (byte i = 0; i < tab.length; i++) {
            r += tab[i];
        }
        return r;
    }
    public static int produit (int[] tab) {
        int r = 1;
        for (byte i = 0; i < tab.length; i++) {
            r *= tab[i];
        }
        return r;
    }
    
    public static int moyenne (int[] tab) {
        int r = somme(tab) / tab.length;
        return r;
    }

    public static void main(String[] args) {
        // TD 1 Familiariation avec Java
        // Exo 1:
        // Recopiez le programme ci-dessus dans un fichier nommé Hello.java. Pour le compiler utilisez la commande javac Hello.java et pour l'exécuter, java Hello. Peut-on l'exécuter directement sans utiliser la commande java ? Que se passe-t-il si le fichier s'appelle Hello2.java ?
            // System.out.println("Hello World !");
        // Reponse : Non pas possible d'executer sans la commande java. j'ai essayé de detourner avec le terminal en faisant: ./Hello.class mais j'ai pas les permissions necessaires. Donc j'ai lancé un chmod 764 et retesté la meme chose, mais la encore une erreur de format de fichier. Donc on ne peut pas executer directement un fichier .class. Le fichier doit s'appeler Hello.java pour que la commande java Hello fonctionne. Si le fichier s'appelle Hello2.java, faudra changer le nom de la classe aussi pour que ca fonctionne.

        // Exo 2:
        // Lire la ligne de commande s'avère beaucoup plus simple en Java qu'en C. On reçoit comme argument de main un seul tableau (habituellement nommé args). On obtient le nombre d'éléments du tableau par args.length. Les arguments de la ligne de commande seront donc dans args[0] ... args[args.length-1].
            // for (byte i = 0; i < args.length; i++) {
            //     System.out.println("Argument " + i + ": " + args[i]);
            // }
        // 1. Modifiez ce programme pour que java Hello Toto produise l'affichage : Hello Toto !
            // String name = args[0];
            // System.out.println("Hello " + name + " !");
        // 2. Que se passe-t-il si on ne donne pas d'argument sur la ligne de commande ? A l'aide d'une conditionnelle, résolvez ce problème.
            // On recoit une erreur
            // if (args.length == 0) {
            //     System.out.println("Hello World !");
            // } else {
            //     String name = args[0];
            //     System.out.println("Hello " + name + " !");
            // }
        // 3. Modifiez maintenant le programme pour que pour chaque nom donné sur la ligne de commande, il affiche une ligne de salutation.
            // if (args.length == 0) {
            //     System.out.println("Hello World !");
            // } else {
            //     for (byte i = 0; i < args.length; i++) {
            //         String name = args[i];
            //         System.out.println("Hello " + name + " !");
            //     }
            // }

            // Exo 3:
            // 1. Écrivez un programme Somme effectuant la somme du tableau : {1, 23, 12, -4, 6, 89, 2} et affichant le résultat.
                // int[] tab = {1, 23, 12, -4, 6, 89, 2};
                // int sum = 0;
                // for (byte i = 0; i < tab.length; i++) {
                //     sum += tab[i];
                // }
                // System.out.println(sum);
            // 2. Définissez une méthode static, qui prendra en argument le tableau, qui effectuera le calcul et qui retournera la valeur obtenue. main ne sera responsable que de l'appel de la fonction et de l'affichage. Le prototype de la méthode est : public static int somme(int[] tab)
                int[] tab = {1, 23, 12, -4, 6, 89, 2};
                System.out.println(somme(tab));
                System.out.println(produit(tab));
                System.out.println(moyenne(tab));

            // 3. Ajoutez la méthode produit et la méthode moyenne au programme.
    }
}