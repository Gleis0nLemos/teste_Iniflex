import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

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

    /**
     * Retorna o salário do funcionário.
     *
     * @return O salário do funcionário com {@code BigDecimal}.
     */
    public BigDecimal getSalario() {
        return salario;
    }

    /**
     * Aplica um aumento ao salário do funcionário baseado em um percentual.
     *
     * @param percentual Percentual de aumento representado como {@code BigDecimal}
     *                   (exemplo: 0.10 para 10% de aumento).
     */
    public void aumentarSalario(BigDecimal percentual) {
        this.salario = this.salario.add(this.salario.multiply(percentual));
    }

    /**
     * Retorna a função do funcionário.
     *
     * @return A função do funcionário como {@code String}
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * Calcula e retorna a idade do funcionário com base no ano atual.
     *
     * @return A idade do funcionário como um número inteiro.
     */
    public int getIdade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    /**
     * Retorna uma representação em formato de string do funcionário,
     * contendo nome, data de nascimento, salário formatado e função.
     *
     * @return Uma string formatada contendo as informações do funcionário.
     */
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        return nome + " - " + dataNascimento.format(formatter) + " - " + nf.format(salario) + " - " + funcao;
    }
}
