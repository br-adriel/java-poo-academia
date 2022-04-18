import java.util.Date;

/**
 * Dados do cliente que geralmente nao variam
 * 
 * @author Adriel
 * @version 17/04/22
 */
public class Cliente
{
    String nome;
    String cpf;
    Date dataNascimento;
    String telefone;
    char genero;
    Metrica metricas[];
    Metrica meta;

    int idade ()
    {
        int idade;
        Date hoje = new Date();
        
        idade = hoje.getYear() - this.dataNascimento.getYear();
        if (hoje.getMonth() > this.dataNascimento.getMonth()) {
            idade--;
        } else if (hoje.getMonth() == this.dataNascimento.getMonth()) {
            if (hoje.getDate() > this.dataNascimento.getDate()) {
                idade--;
            }
        }
         return idade;
    }
    
    double imc() {
        Metrica ultima = null;
        for (int i=0; i < metricas.length; i++) {
            if (metricas[i] == null) break;
            ultima = metricas[i];
        }
        return ultima == null ? -1 : ultima.imc();
    }
}
