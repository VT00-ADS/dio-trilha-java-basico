import java.util.Scanner;
public class Contador {
    public static void main (String[]args){
   Scanner scanner = new Scanner(System.in);
   System.out.println("Digite o primeiro Parametro: ");
   int terminal1  = scanner.nextInt();
   System.out.println("Digite o segundo Parametro: ");
   int terminal2 = scanner.nextInt();
int Resultado;
int contagem = terminal2 - terminal1;


try{

    contar(terminal1, terminal2);
    for (Resultado = 0; terminal2 >= terminal1; Resultado++){
        if (Resultado > contagem){
            break;
        }
        
System.out.println("Imprimindo o número: "+ Resultado );
    }

}catch (ParametrosInvalidosException e){

    System.out.println("O segundo valor deve ser maior que o primeiro");
}



}

    public static void  contar(int terminal1, int terminal2) throws ParametrosInvalidosException {
        int contagem = terminal2 - terminal1;

      if (terminal1 > terminal2) {
      throw new ParametrosInvalidosException("O segundo valor deve ser maior que o primeiro");
      }
      if (terminal2 > terminal1){
      for (contagem = 0; terminal2 < terminal1; contagem++) {

 }
      }

    }




static  class ParametrosInvalidosException extends Exception {

    ParametrosInvalidosException(String menssagem) {
        super();


    }
}    



}
