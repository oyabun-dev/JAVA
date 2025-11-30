public class Hello {
    public static void main(String[] args) {
        // TD 1 Familiariation avec Java
        // Exo 1:
        // Recopiez le programme ci-dessus dans un fichier nommé Hello.java. Pour le compiler utilisez la commande javac Hello.java et pour l'exécuter, java Hello. Peut-on l'exécuter directement sans utiliser la commande java ? Que se passe-t-il si le fichier s'appelle Hello2.java ?
        System.out.println("Hello World !");
        // Reponse : Non pas possible d'executer sans la commande java. j'ai essayé de detourner avec le terminal en faisant: ./Hello.class mais j'ai pas les permissions necessaires. Donc j'ai lancé un chmod 764 et retesté la meme chose, mais la encore une erreur de format de fichier. Donc on ne peut pas executer directement un fichier .class. Le fichier doit s'appeler Hello.java pour que la commande java Hello fonctionne. Si le fichier s'appelle Hello2.java, faudra changer le nom de la classe aussi pour que ca fonctionne.

        // Exo 2:
        // Lire la ligne de commande s'avère beaucoup plus simple en Java qu'en C. On reçoit comme argument de main un seul tableau (habituellement nommé args). On obtient le nombre d'éléments du tableau par args.length. Les arguments de la ligne de commande seront donc dans args[0] ... args[args.length-1].
        for (byte i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
        // 1. Modifiez ce programme pour que java Hello Toto produise l'affichage : Hello Toto !
        // 2. Que se passe-t-il si on ne donne pas d'argument sur la ligne de commande ? A l'aide d'une conditionnelle, résolvez ce problème.
        // 3. Modifiez maintenant le programme pour que pour chaque nom donné sur la ligne de commande, il affiche une ligne de salutation.
    }
}