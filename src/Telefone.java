public class Telefone {
    private String nome;
    private int ddd;
    private int numero;

    public Telefone(String nome, int ddd, int numero) {
        this.nome = nome;
        this.ddd = ddd;
        this.numero = numero;
    }

    public Telefone() {
    }

    public void mostrarInfo(){
        System.out.println("Nome: "+getNome() + "\nNúmero: "+getDdd() + getNumero());
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
