class Banco {
    public static void main(String[] args) {
        
        Conta conta1 = new Conta();
        conta1.titular.nome = "Caue Queiroz";
        conta1.saldo = 1000;

        Conta conta2 = new Conta();
        conta2.titular.nome = "Donnie Darko";
        conta2.saldo = 250;

        conta1.transferirPara(conta2, 250);

    }
}
