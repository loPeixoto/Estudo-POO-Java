package banco_exercicio;

public class Conta {
    String numero;
    Pessoa titular;
    double saldo;
    double limite;

    double disponivel() {
        return this.saldo + this.limite;
    }
    
    void extrato() {
        System.out.println("*** EXTRATO DA CONTA ***");
        System.out.println("Conta: " + this.numero);
        System.out.println("Titular: " + this.titular.cpf);
        System.out.println("Valor disponivel para saque: " + this.disponivel() + "/n");
    }

    boolean sacar(double valor) {
        if (valor <= this.disponivel()) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso. Novo saldo: " + this.saldo);
            return true;
        }
        else {
            System.out.println("Erro: Saque na conta " + this.numero + " nao foi realizado. Valor disponivel: " + this.disponivel());
            return false;
        }
    }

    void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito de " + valor + " realizado com sucesso.");
        System.out.println("Novo saldo: " + this.saldo);
    }

    boolean transferir(double valor, Conta destino) {
        if(this.sacar(valor)) {
            this.sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferencia de " + valor + " da conta" + this.numero + " para conta " + destino.numero + " foi realizado com sucesso");
            return true;
        }
        else {
            System.out.println("Erro: nao foi possivel transferir " + valor + " da conta " + this.numero + " para a conta " + destino.numero + ". Valor disponivel: " + this.disponivel());
            return false;
        }
    }
}
