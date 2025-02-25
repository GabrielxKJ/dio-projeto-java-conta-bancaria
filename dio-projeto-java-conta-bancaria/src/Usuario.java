public class Usuario {
    int numero;
    String agencia;
    String nome_cliente;
    double saldo;

    Usuario(int numeroUsuario, String agencia, String nome_cliente, double saldo){
        this.numero = numeroUsuario;
        this.agencia = agencia;
        this.nome_cliente = nome_cliente;
        this.saldo = saldo;
    }
}
