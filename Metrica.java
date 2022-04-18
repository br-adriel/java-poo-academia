import java.util.Date;

/**
 * Desceve as caracteristicas do cliente que variam
 * 
 * @author Adriel
 * @version 17/04/22
 */
public class Metrica
{
    double peso;
    double altura;
    double biceps;
    double peito;
    double cintura;
    Date data;
    
    public Metrica()
    {
        this.data = new Date();
    }

    public double imc()
    {
        return this.peso / (this.altura * this.altura);
    }
}
