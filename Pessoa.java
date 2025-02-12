import java.time.LocalDate;

// 1 - Classe Pessoa

/**
 * Representa uma pessoa com nome e data de nascimento
 */
public class Pessoa {

    // nome da pessoa
    protected String nome;

    // data de nascimento da pessoa
    protected LocalDate dataNascimento;

    /**
     * Constrói uma nova instância de Pessoa com o nome e a data de nascimento fornecidos.
     *
     * @param nome Nome da pessoa
     * @param dataNascimento Data de nascimento da pessoa
     */
    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
