import java.util.Scanner;

  class Conta{
    int data_abertura;
    String nome_titular;
    String agencia;
    int calcular_rendimento = +3;
    double saldo;
    int sacar;
    int depositar;
    int numero_identificacao_titular;

    Scanner google = new Scanner(System.in);
    

    //método construtor

    public Conta(String nome_titular, String agencia, double saldo, int numero_identificacao_titular, int calcular_rendimento) {
        this.nome_titular = nome_titular;
        this.agencia = agencia;
        this.saldo = saldo;
        this.numero_identificacao_titular = numero_identificacao_titular;
    
    }
    public String returnnome_titular()  {
        return this.nome_titular;
    }

    public String returnagencia()  {
        return this.agencia;
    }

    public int returndepositar() {
        return this.depositar = depositar;
    }

    public int returnsacar() {
        sacar = google.nextInt();
        return this.sacar = sacar;

    }  
    public double returnsaldo() {
        return this.saldo;
    }   
    public int returnnumero_identificacao_titular() {
        return this.numero_identificacao_titular;
    }

    public int returncalcular_rendimento() {
        return this.calcular_rendimento;
    }   

    void inicializar() {
        System.out.println("Seja bem-vindo a sua conta, insira o cartão para fazer a operação desejada:");
    }
} 
