package banco_exercicio;

public class Pessoa {
    String nome;
    int idade;
    char sexo;
    String cpf;

    void aniversario() {
        /*Adiciona um ano na idade da pessoa*/
        this.idade = this.idade + 1;
    }

    void atribuiCPF(String c) {
        /* Altera o valor do atribut CPF */
        this.cpf = c;
    }

    int getIdade() {
        /* retorna o valor da idade da pessoa */
        return this.idade;
    }
}


