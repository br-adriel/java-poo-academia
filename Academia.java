
/**
 * Dados da academia
 * 
 * @author Adriel 
 * @version 17/04/22
 */
public class Academia
{
    String nome;
    Cliente clientes[];

    double imc(){
        double soma = 0;
        int i = 0;
        int parcela = 0;
        while( i < clientes.length ){
            if(clientes[i].imc() != -1){
                soma += clientes[i].imc();
                parcela ++;
            }
            i++;
        }
        return parcela == 0 ? 0 : soma / parcela;
    }
}
