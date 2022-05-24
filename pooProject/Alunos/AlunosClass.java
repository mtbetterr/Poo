package Alunos;
import java.util.concurrent.TimeUnit;



public class AlunosClass {
    String nome;
    
int idade;
float nota;
boolean aprovacao;
      
    void status(){
    System.out.println("nome: " + this.nome);

    System.out.println("idade: " + this.idade);
    try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();

            if (this.nota >= 6){
                System.out.println ("O aluno foi aprovado");
            } else {
                System.out.println("O aluno foi reprovado");
        
            }
            System.out.println("___________________________");
        
        }
}
    void nota(){
       
        }
    
                    

void aprovacaoa() {
this.aprovacao = true;

}
void aprovadoa(){
this.aprovacao = false;

}
}

    

    

    

