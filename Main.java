final class Main {
    void main() {
        Aluno aluno = new Aluno();
        aluno.setNome("Iasmin");
        aluno.setIdade(24);
        aluno.setMatricula("2250");
        aluno.setNota01((double)9.0F);
        aluno.setNota02((double)6.0F);
        aluno.calcularMedia();
        aluno.verificaSituacao();
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Lago");
        aluno2.setIdade(19);
        aluno2.setMatricula("2251");
        aluno2.setNota01((double)0.0F);
        aluno2.setNota02((double)5.0F);
        aluno2.calcularMedia();
        aluno2.verificaSituacao();
    }
}
