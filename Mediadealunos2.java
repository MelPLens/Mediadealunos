package mediabranch1;
import java.util.Scanner;
public class mediabranch2{
    public static void main( String[] args){
        Scanner ler = new Scanner( System.in);
        

        int sala[]= {0, 0, 0, 0, 0, 0}; // declaro a quantidade de alunos em cada uma das seis casas, colocando valendo igual a zero, pois o usuario que vai colocar a quantidade
       
        int quantidade= sala.length; // declaro a variável do tipo int chamada 'quantidade' e atribuio a ela o comprimento(length) da variável 'sala'
        
        int soma = 0; // declaro a variavel soma para ser feito o calculo da média
        
        
        System.out.print("------- QUANTIDADE DE ALUNOS -------\n ");// imprimido ao usuário
        System.out.print("Digite quantos alunos tem em cada sala :\n ");
        
        
        System.out.print("Sala 1: ");
        sala[0] = ler.nextInt();// coloco a variavel mais a matriz para ser guardada e logo depois ser executado o calculo para a média

        System.out.print("Sala 2: ");
        sala[1]=ler.nextInt();

        System.out.print("Sala 3: ");
        sala[2] = ler.nextInt();

        System.out.print("Sala 4: ");
        sala[3] = ler.nextInt();

        System.out.print("Sala 5: ");
        sala[4] = ler.nextInt();

        System.out.print("Sala 6: ");
        sala[5] = ler.nextInt();

        for(int calculo=0; calculo<quantidade;calculo++){ // declaro o laco de repeticao para ser feito o calculo com todas as informacoes no qual o usuario esta inserindo
            soma = soma + sala[calculo]; // a soma dos alunos é igual a soma de todos os alunos mais as salas dividindo.
        }

        int media = soma/quantidade; //declaro variavel int para ser feita o calculo da medida com a soma de todos os alunos dividido pela quantidade.

        System.out.println("-------RESULTADO-------");
        System.out.println("A média de alunos é: " + media);
        System.out.println("-----------------------");

        System.out.println(" Maior número de alunos : ");// imprimido ao usuário
        if(sala[0] > media){ // e se for maior que a media de todas as salas será o maior numero de alunos.
            System.out.println(" Sala 1");// imprimi ao usuário a maior sala com quantidade de alunos
        }
        if(sala[1] > media){
            System.out.println(" Sala 2");
        }
        if(sala[2] > media){
            System.out.println(" Sala 3");
        }
        if(sala[3] > media){
            System.out.println(" Sala 4");
        }
        if(sala[4] > media){
            System.out.println(" Sala 5");
        }
        if(sala[5] > media){
            System.out.println(" Sala 6");
        }
        System.out.println("-----------------------");

        System.out.println(" Menor número de alunos : ");// imprimido ao usuário
        if(sala[0] < media){ // e se for menor que a media de todas as salas será o menor numero de alunos.
            System.out.println(" Sala 1");// imprimi ao usuário a menor sala com quantidade de alunos
        }
        if(sala[1] < media){
            System.out.println(" Sala 2");
        }
        if(sala[2] < media){
            System.out.println(" Sala 3");
        }
        if(sala[3] < media){
            System.out.println(" Sala 4");
        }
        if(sala[4] < media){
            System.out.println(" Sala 5");
        }
        if(sala[5] < media){
            System.out.println(" Sala 6");
        }
        System.out.println("---------FIM-----------");

        ler.close();//fim do programa
    }
        
}
