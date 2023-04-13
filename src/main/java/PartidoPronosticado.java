public class PartidoPronosticado extends Partido {
    private final ResultadoEnum resultadoPron;

    public PartidoPronosticado(String equipoLocal, String equipoVisitante, ResultadoEnum resultadoPron) {
        super(equipoLocal, equipoVisitante);
        this.resultadoPron = resultadoPron;
    }

    public ResultadoEnum getResultadoPron() {
        return resultadoPron;
    }

    public void mostrarPartidoPronosticado() {
        System.out.println(equipoLocal + " vs. " + equipoVisitante + " = " + resultadoPron);
    }


}