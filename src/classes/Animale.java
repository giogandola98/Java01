package classes;

public class Animale implements interfaces.Animale
{
    private String nome;
    private byte età;

    public Animale(String nome, byte età)
    {
        this.nome=nome;
        this.età=età;
    }

    public Animale(String nome, int età)
    {
        this.nome=nome;
        this.età=(byte) età;
    }

    @Override
    public void muoviti()
    {
        System.out.println("Mi sto muovendo in modo generico");
    }
    @Override
    public void respira()
    {
        System .out.println("Sto respirando");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getEtà() {
        return età;
    }

    public void setEtà(byte età) {
        this.età = età;
    }
}
