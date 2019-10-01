package it.giogandola.example01.classes;

public class Animale implements it.giogandola.example01.interfaces.Animale
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
        Video.print("Mi sto muovendo in modo generico");
    }
    @Override
    public void respira()
    {
        Video.print("Sto respirando");
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
