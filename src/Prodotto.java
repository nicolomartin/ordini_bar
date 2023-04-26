public class Prodotto
{
    private String nome;
    private int costo;
    public Prodotto(String nome, int costo)
    {
        this.nome = nome;
        this.costo = costo;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setCosto(int costo)
    {
        this.costo = costo;
    }
    public String getNome()
    {
        return nome;
    }
    public int getCosto()
    {
        return costo;
    }
}