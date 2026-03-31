public class exercicio4 {
    public static void main(String[] args){
        double n1 = -7;
        double n2 = 8;
        double n3 = 10;
        int notaslidas = 0;
        double media = 0;
        
        if (n1 >= 0 && n1<=10) {
            notaslidas +=1;
            media+=n1;
        }
        if (n2 >= 0 && n2<=10) {
            notaslidas +=1;
            media +=n2;
        }
        if (n3 >= 0 && n3<=10) {
            notaslidas +=1;
            media +=n3;
        }

        if(notaslidas > 0){
            media = media / notaslidas;
        } else {
            System.out.println("Nenhuma nota válida");
        }

        System.out.println("Foram lidas " + notaslidas + " notas e a média é " + media + ".");
        
    }
}
