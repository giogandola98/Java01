package classes;

public class Cane extends Animale
{
    private byte n_zampe;
    private byte colore;

    public Cane(String nome, byte età)
    {
        super(nome, età);
    }

    public Cane(String nome, byte età,byte n_zampe, byte colore)
    {
        super(nome, età);
        this.n_zampe=n_zampe;
        this.colore=colore;
    }

    public void abbaia()
    {
        System.out.println("Sto abbaiando");
    }

    public void muoviti()
    {
        System.out.println("Mi sto muovendo come un cane");
    }

    public byte getN_zampe() {
        return n_zampe;
    }

    public void setN_zampe(byte n_zampe) {
        this.n_zampe = n_zampe;
    }

    public byte getColore() {
        return colore;
    }

    public void setColore(byte colore) {
        this.colore = colore;
    }




}
