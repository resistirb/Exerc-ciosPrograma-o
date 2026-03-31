import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int dia, mes, ano;
        String mesString = "";
        dia = sc.nextInt();
        mes = sc.nextInt();
        ano = sc.nextInt();

        switch(mes){
            case(1):
            mesString = "Janeiro";
            break;

            case(2):
            mesString = "Fevereiro";
            break;

            case(3):
            mesString = "Março";
            break;

            case(4):
            mesString = "Abril";
            break;

            case(5):
            mesString = "Maio";
            break;

            case(6):
            mesString = "Junho";
            break;

            case(7):
            mesString = "Julho";
            break;

            case(8):
            mesString = "Agosto";
            break;

            case(9):
            mesString = "Setembro";
            break;

            case(10):
            mesString = "Outubro";
            break;

            case(11):
            mesString = "Novembro";
            break;

            case(12):
            mesString = "Dezembro";
            break;

            default:
            mesString = "Mês inválido";
        }

        System.out.println(dia + " de " + mesString + " de " + ano);
        sc.close();
    }
}
