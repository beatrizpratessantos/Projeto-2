public class Pessoa {
    private final String nome;
    private final String cargo;
    private final String matricula;
    private final String horaEntrada;
    private final String horaSaida;

    private Pessoa(Builder builder) {
        this.nome = builder.nome;
        this.cargo = builder.cargo;
        this.matricula = builder.matricula;
        this.horaEntrada = builder.horaEntrada;
        this.horaSaida = builder.horaSaida;
    }

   
    @Override
    public String toString() {
        return String.format("Tipo: %s | Nome: %s | Matrícula: %s | Horário: %s - %s", 
                              cargo, nome, matricula, horaEntrada, horaSaida);
    }

    public static class Builder {
        private String nome;
        private String cargo;
        private String matricula;
        private String horaEntrada;
        private String horaSaida;

        public Builder nome(String nome) { this.nome = nome; return this; }
        public Builder cargo(String cargo) { this.cargo = cargo; return this; }
        public Builder matricula(String matricula) { this.matricula = matricula; return this; }
        public Builder horaEntrada(String horaEntrada) { this.horaEntrada = horaEntrada; return this; }
        public Builder horaSaida(String horaSaida) { this.horaSaida = horaSaida; return this; }

        public Pessoa build() {
            return new Pessoa(this);
        }
    }
}