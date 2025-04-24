/**
 * Classe que representa uma Calculadora de Média.
 * Esta classe armazena quatro notas de um aluno e calcula a média aritmética delas.
 */
public class CalculadoraMedia {
    private double nota1; // Primeira nota
    private double nota2; // Segunda nota
    private double nota3; // Terceira nota
    private double nota4; // Quarta nota

    public CalculadoraMedia(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    /**
     * Calcula a média aritmética das quatro notas.
     * @return A média das notas
     */
    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }

    /**
     * Retorna uma descrição das notas e da média calculada.
     * @return String com as notas e a média
     */
    public String getDescricao() {
        return "Notas: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4 +
               "\nMédia: " + calcularMedia();
    }
    
    public void setNotas(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
}