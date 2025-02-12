import java.math.BigDecimal;
import java.time.LocalDate;

// 2 - Classe Funcionário

/**
 * {@code Funcionario} Representa um funcionário, que é uma extensão da classe Pessoa,
 * contendo informações adicionais como salário e função.
 */
public class Funcionario extends Pessoa {

    // salário do funcionário
    private BigDecimal salario;

    // função desempenhada pelo funcionário.
    private String funcao;

    /**
     * Constrói uma nova instância de Funcionário com nome, data de nascimento, salário e função.
     *
     * @param nome Nome do funcionário.
     * @param dataNascimento Data de nascimento do funcionário.
     * @param salario Salário do funcionário.
     * @param funcao Função desempenhada pelo funcionário.
     */
    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }
}
