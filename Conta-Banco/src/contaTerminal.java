import java.util.Scanner;

public class contaTerminal {
  
    public contaTerminal() {
    }
    
    public static void main(java.lang.String[] arg0) throws java.lang.Exception {
    }
  
        Scanner leitor = new Scanner(System.in) {
            int numeroConta = leitor.nextInt();
            String numeroAgencia = leitor.next();
            String nomeCliente = leitor.next();
            double saldo = leitor.nextDouble();
            {
            System.out.println( "Por favor, digite o número da conta" );
            System.out.print( "Por favor, digite o número da agência" );
            System.out.print("Por favor, digite seu nome completo");

           
                System.out.println("Olá" + (nomeCliente) + ", obrigado por criar uma conta em nosso banco, sua Agência é " + (numeroAgencia) + ", conta " + (numeroConta) + " e seu saldo" +  (saldo) + "já está disponível para saque");
            }
        };

        public contaTerminal(Scanner leitor) {
            this.leitor = leitor;
        }
        

        
        

        
       

        //Exibier as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem "Conta criada"
        
        
    }

