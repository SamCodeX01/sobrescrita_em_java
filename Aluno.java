
import javax.swing.JOptionPane;

/**
 *
 * @author Expression Samuel is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class Aluno extends Pessoa{
    int ra;
    float media;
    int faltas;


//Construtor da classe aluno
    public Aluno(String nome, float altura, float peso, int ra, float media, int faltas){
        super(nome, altura, peso);
            this.ra = ra;
            this.media = media;    
            this.faltas = faltas;
}

    //Método que sobrescreve o que já foi feito em Pessoa
    @Override //sobrescrita substitui o metodo da classe herdeira
    public void exibirDados(){
        System.out.print("Aluno: " + super.nome);
        System.out.print("RA: " + ra);
        System.out.print("Média: " + media);
        System.out.print("IMC do Aluno: " + calcularIMC());
    }
    
    //Método que faz sobrecarga para exibir GUI
        public void exibirDados(int x){
            String msg;
            msg =   "Nome: " + super.nome + 
                    "IMC: " + super.calcularIMC() +
                    "Média: " + media + analisarMedia() +
                    "Faltas: " + faltas  + "-" + calcularFrequencia() + "% - " +
                    "Resultado: " + analisarSituacaoDoAluno();
            JOptionPane.showMessageDialog(null, msg);                    
        }
        
        //Método para analisar a média obtida pelo aluno
        public String analisarMedia(){
            if(media < 4.0){
                return " - Reprovado";
            }
            else if(media < 6.0){
                return "exame";
            }
            else{
                return " - Aprovado" ;
            }
        }
        
        //Método para calcular percentual de faltas do aluno
        public int calcularFrequencia(){
            return (100*faltas)/80;
        } 
        
        //Método para analisar a frequência do aluno
        public String analisarFrequencia(){
            if(calcularFrequencia() > 25){
                return "Reprovado";
            }
              else{
                return "Aprovado";}
            }
        
        //Método para analisar a situação do Aluno
        public String analisarSituacaoDoAluno(){
            if(analisarMedia() == "Aprovado" && analisarFrequencia().equals("Aprovado")){
                return "Aprovado";
            }
            else{ 
                return "Reprovado";
            }           
        }
        
        //Método para calcular o IMC do Aluno
        @Override
        public float calcularIMC(){
            float imc;
            imc = super.calcularIMC();
            
            if(imc < 18.5){
                System.out.println("Abaixo do Peso");
            }
            else if(imc < 24.9){
                System.out.println("Peso Ideal");
            }
            else if(imc < 26.9){
                System.out.println("Levemente acima do Peso");
            }
            return imc;
        }
}//fim da classe
