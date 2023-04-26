public class Ordine
{
    private int ntav;
    private Prodotto[] prodotti;
    private static int indice = 0;
    public Ordine(int ntav)
    {
        this.ntav = ntav;
        prodotti = new Prodotto[10];
    }
    public void setNtav(int ntav)
    {
        this.ntav = ntav;
    }
    public void setProdotti(Prodotto[] prodotti)
    {
        this.prodotti = prodotti;
    }
    public int getNtav()
    {
        return ntav;
    }
    public Prodotto[] getProdotti()
    {
        return prodotti;
    }
    public void insert(Prodotto p)
    {
        prodotti[indice] = p;
        indice ++;
    }
    
}