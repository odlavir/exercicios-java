import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o nome da agenda: ");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);
        System.out.println("---------------------------------------");

        Contato[] contatos = new Contato[3];


        for (int i = 0; i < contatos.length; i++) {
            Contato c = new Contato();
            System.out.print("Digite o nome do contato " + (i + 1) + ": ");
            c.setNome(scan.nextLine());

            System.out.print("Digite o telefone do contato " + (i + 1) + ": ");
            c.setTelefone(scan.nextLine());

            System.out.print("Digite o email do contato " + (i + 1) + ": ");
            c.setEmail(scan.nextLine());

            System.out.println("---------------------------------------");

            contatos[i] = c;
        }

        agenda.setContatos(contatos);

        if (agenda != null) {
            System.out.println("---------------------------------------");
            System.out.println(agenda.obterInfo());
            System.out.println("---------------------------------------");
        }
    }
}