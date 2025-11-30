public class Hello {
    public static void main(String[] args) {
        // TD 1 Familiariation avec Java
        // Exo 1:
        // Recopiez le programme ci-dessus dans un fichier nommé Hello.java. Pour le compiler utilisez la commande javac Hello.java et pour l'exécuter, java Hello. Peut-on l'exécuter directement sans utiliser la commande java ? Que se passe-t-il si le fichier s'appelle Hello2.java ?
        System.out.println("Hello World !");
        // Reponse : Non pas possible d'executer sans la commande java. j'ai essayé de detourner avec le terminal en faisant: ./Hello.class mais j'ai pas les permissions necessaires. Donc j'ai lancé un chmod 764 et retesté la meme chose, mais la encore une erreur de format de fichier. Donc on ne peut pas executer directement un fichier .class. Le fichier doit s'appeler Hello.java pour que la commande java Hello fonctionne. Si le fichier s'appelle Hello2.java, faudra changer le nom de la classe aussi pour que ca fonctionne.
    }
}