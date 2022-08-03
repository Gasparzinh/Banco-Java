public class Main{

    public static void main(String[]args){
        Cliente Tulio=new Cliente();
        Tulio.setNome("Tulio");

        Conta cc = new ContaCorrente(Tulio);
        Conta poupanca=new ContaPoupanca(Tulio);

        cc.depositar(100);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        
    }
}