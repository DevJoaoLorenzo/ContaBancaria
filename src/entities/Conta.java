package entities;

public class Conta {
    private String number;
    private String name;
    private double saldo;
    public Conta(String number, String name){
        this.number=number;
        this.name=name;
    }
    public Conta(String number, String name, double deposito){
        this.number=number;
        this.name=name;
        deposito(deposito);
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSaldo() {
        return saldo;
    }
    public void deposito(double deposito){
        saldo+=deposito;
    }
    public void saque(double saque){
        saldo-=saque+5.0;
    }
    public String toString() {
        return "Conta: "
                + number
                + ", Nome: "
                + name
                + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }
}
