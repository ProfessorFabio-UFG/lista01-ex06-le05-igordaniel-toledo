public class Main {
    public static void main(String[] args) {
        Caixa caixa = new Caixa("Carlos", "123");
        caixa.setTelefone("9999-1111");
        caixa.setSalario(3000);
        caixa.setHorario("08h às 16h");
        caixa.aumentarSalario(10);
        caixa.exibirDados();
        System.out.println("Recebimento anual: R$" + caixa.getRecebimentoAnual());
        System.out.println();

        Gerente gerente = new Gerente("Fernanda", "456");
        gerente.setTelefone("9888-2222");
        gerente.setSalario(8000);
        gerente.setBonificacao(1000);
        gerente.setTipo("PF");
        gerente.aumentarSalario(20);
        gerente.exibirDados();
        System.out.println("Recebimento anual: R$" + gerente.getRecebimentoAnual());
        System.out.println();

        Cliente cliente1 = new Cliente("Mari", "2345-6697", 20, "882284634344");
        Cliente cliente2 = new Cliente("Jão", "9988-5566", 30, "927283381995");
        Cliente cliente3 = new Cliente("Anna", "9345-1234", 25, "12345678900");

        cliente2.desativar();

        System.out.println(cliente1.mostrarDados());
        System.out.println(cliente2.mostrarDados());
        System.out.println(cliente3.mostrarDados());
    }
}
