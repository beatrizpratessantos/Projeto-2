public class PessoaFactory {

    public static Pessoa criarPessoa(String tipo, String nome, String matricula) {
        Pessoa.Builder builder = new Pessoa.Builder()
                .nome(nome)
                .matricula(matricula);

        switch (tipo.toLowerCase()) {
            case "aluno":
                return builder.cargo("Aluno")
                        .horaEntrada("08:00")
                        .horaSaida("12:00")
                        .build();
            case "professor":
                return builder.cargo("Professor")
                        .horaEntrada("07:00")
                        .horaSaida("12:00")
                        .build();
            case "administrativo":
                return builder.cargo("Administrativo")
                        .horaEntrada("08:00")
                        .horaSaida("13:00")
                        .build();
            case "publico":
                return builder.cargo("Público Geral")
                        .horaEntrada("09:00")
                        .horaSaida("13:00")
                        .build();
            default:
                throw new IllegalArgumentException("Pessoa desconhecida");
        }
    }
}