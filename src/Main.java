import classes.Animale;
import classes.Cane;
import classes.Video;
class Main
{
    public static void main(String[] args) {
        Video.print("test clase abstract senza bisogno di istanza");

        //istanzio la classe animale
        Animale animale = new Animale("Pippo", 15);
        Video.print(animale.getNome() + " " + animale.getEtà());
        //chiamo i metodi
        animale.respira();
        animale.muoviti();

        //istanzio un cane, estensione di animale
        Cane cane = new Cane("Pluto", (byte) 20, (byte) 4, (byte) 1);
        //chiamo il metodo proprio di cane
        cane.abbaia();
        //chiamo il metodo ereditato da Animale
        cane.respira();
        //chiamo il metodo ereditato da Animale sul quale è stato fatto l'override
        cane.muoviti();

    }

}