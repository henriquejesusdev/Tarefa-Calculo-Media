/**
 * Classe que representa uma Calculadora de Média.
 * Esta classe armazena quatro notas de um aluno, calcula a média aritmética delas
 * e determina a situação do aluno com base na média.
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
     * Determina a situação do aluno com base na média.
     * @return String indicando se o aluno está Aprovado, em Recuperação ou Reprovado
     */
    public String getSituacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media >= 5.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    /**
     * Retorna uma descrição das notas, da média calculada e da situação do aluno.
     * @return String com as notas, a média e a situação
     */
    public String getDescricao() {
        return "Notas: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4 +
               "\nMédia: " + calcularMedia() +
               "\nSituação: " + getSituacao();
    }
    
    public void setNotas(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
}