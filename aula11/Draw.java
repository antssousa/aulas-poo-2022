import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random(1L);
        ArrayList<Integer> alunos = new ArrayList<Integer>();
        String[] nomes = { "ALFREDO CONCEIÇÃO DOS REIS",
                "ANA CLARA SOUSA LIMA AMARAL FONTENELES",
                "ANALICE SOUSA LIMA",
                "ANNA LUIZA LIMA ROCHA",
                "ANTÔNIO AUGUSTO COSTA DE SOUZA ARAUJO",
                "ANTÔNIO GABRIEL DE ARAÚJO RODRIGUES",
                "CLARA BEATRIZ LIMA FRANÇA",
                "CLARA DOS SANTOS MORAES",
                "DEBORAH FRANCO SOARES",
                "EDUARDO DOS SANTOS NASCIMENTO",
                "ELDER RAFAEL DE OLIVEIRA RIBEIRO",
                "ELIAS CARDOSO DE CASTRO NETO",
                "ERYCA VITÓRIA SILVA PEREIRA",
                "FELIPE JUNIO SILVA LOPES",
                "FERNANDA OLIVEIRA DE FARIAS",
                "GABRIELA BATISTA DE ALMEIDA",
                "HENRIQUE FERREIRA DE MESQUITA GOMES",
                "IRAPUAM JUNIO DA SILVA SANTOS",
                "ISABELLY MARIA MAGALHÃES ARAUJO",
                "ITALO MOURA DE FIGUEIREDO",
                "JEOVANA DA SILVA SOUZA",
                "JHONATAS SILVA DOS SANTOS",
                "JOSÉ WILK SOUZA LIMA",
                "LARA RAYSA DOS SANTOS SIQUEIRA",
                "LAYANNE PEREIRA CUNHA",
                "LUCIANA MARIA DOS SANTOS",
                "LUDMYLA RODRIGUES RAMOS",
                "LUIS GUSTAVO SILVA DE AZEVEDO",
                "LUIZ FELIPE MEDEIROS RAMOS",
                "LUIZ HENRIQUE ALVES ALMEIDA MARQUES",
                "MARIA AMANDA DE SOUZA PAZ",
                "MARIA ANGELINA DE ARAÚJO SOUSA",
                "MARIA BEATRIZ MEDEIROS LOPES",
                "MARIA EDUARDA DO NASCIMENTO DA MATA",
                "MARIA KAROLLYNE LARA HENRIQUE BARROS",
                "MATHEUS DE PINHO LIMA",
                "PEDRO HENRIQUES DE MORAIS SILVA",
                "RAFAELLY LIMA DOS REIS",
                "RAIANE COSTA PEREIRA",
                "RAISSA COSTA PEREIRA",
                "RARISSON RODRIGUES LIMA",
                "TATIELE FERREIRA DA SILVA",
                "YASMIN DA SILVA CARVALHO",
                "YTALLO GABRIEL MARQUES ARAUJO GALENO" };
        for (;;) {
            System.out.println("Menu");
            System.out.println("Deseja sortear uma nova crianca para os jogos chocolotais? ");
            System.out.println("1 - Sim");
            System.out.println("Qualquer otra opcao - Nao");
            int opcao = scan.nextInt();
            if (opcao == 1) {
                while (true) {
                    int aluno = random.nextInt(44);
                    if (!alunos.contains(aluno)) {
                        System.out.println("------------------------------------------------------------");
                        System.out.println("A crianca sortuda foi " + nomes[aluno]);
                        System.out.println("------------------------------------------------------------");
                        alunos.add(aluno);
                        break;
                    }
                }

            } else {
                System.out.println("Saindo ...");
                break;
            }
        }

    }
}
