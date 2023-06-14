package academy.devdojo.maratonajava.introducao;

import java.time.LocalDateTime;
import java.util.Date;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, moro no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {

        String nome = "Guilherme Henrique";
        String endereco = "Rua dos canarios, n0";
        double salario = 1300.00;
        String data = "05-06-2020";
        String relatorio = "Eu " + nome + ", moro no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + data;

        System.out.println(relatorio);
    }
}
