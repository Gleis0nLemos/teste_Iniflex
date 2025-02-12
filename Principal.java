import javax.swing.plaf.synth.SynthTextAreaUI;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

// 3 - Classe Principal

public class Principal {

    // 3.1 - Funcionários inseridos de acordo com a tabela inicial

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>(Arrays.asList(
                new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"),
                new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"),
                new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9839.14"), "Coordenador"),
                new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"),
                new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"),
                new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"),
                new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"),
                new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"),
                new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"),
                new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente")
        ));

        // 3.2 - Remover João da tabela
        funcionarios.removeIf(f -> f.nome.equals("João"));

        // 3.3 - Imprimir todos os funcionários
        System.out.println("\n###############################################");
        System.out.println("Todos os funcionários antes do aumento de 10% e após remover João:\n");
        funcionarios.forEach(System.out::println);

        // 3.4 - Aumentando salário em 10%
        funcionarios.forEach(f -> f.aumentarSalario(new BigDecimal("0.10")));
//
//        System.out.println("\n");
//        funcionarios.forEach(System.out::println);

        // 3.5 - Agrupa os funcionários por função
        Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));

        // 3.6 - Imprimindo os funcionário agrupados pela função
        System.out.println("\n###############################################");
        System.out.println("Funcionários agrupados por função:");
        funcionariosPorFuncao.forEach((funcao, lista) -> {
            System.out.println("\n" + funcao + ":");
            lista.forEach(System.out::println);
        });

        // 3.8 - Funcionários com aniversário em Outubro e Dezembro
        System.out.println("\n###############################################");
        System.out.println("Aniversariantes de Outubro e Dezembro:\n");
        funcionarios.stream()
                .filter(f -> f.dataNascimento.getMonthValue() == 10 || f.dataNascimento.getMonthValue() == 12)
                .forEach(System.out::println);

        // 3.9 - Funcionário mais velho
        System.out.println("\n###############################################");
        Funcionario maisVelho = Collections.min(funcionarios, Comparator.comparing(f -> f.dataNascimento));
        System.out.println("Funcionário mais velho: " + maisVelho.nome + " - " + maisVelho.getIdade() + " anos");

        // 3.10 - Ordenando funcionários por ordem alfabética
        System.out.println("\n###############################################");
        funcionarios.sort(Comparator.comparing(f -> f.nome));
        System.out.println("Funcionários ordenados por nome:");
        funcionarios.forEach(System.out::println);

        // 3.11 - Imprimindo o total dos salários dos funcionários
        System.out.println("\n###############################################");
        BigDecimal totalSalarios = funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);

        System.out.println("Total dos salários: " + nf.format(totalSalarios));
    }
}
