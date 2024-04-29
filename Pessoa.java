
public class Pessoa {
    String nome;
    float altura;
    float peso;


//Construtor da classe
public Pessoa(String nome, float altura, float peso){
    this.nome = nome;
    this.altura = altura;
    this.peso = peso;
}

//método comum para exibir dados de uma pessoa
    public void exibirDados(){
        System.out.print("Nome: " + nome);
        System.out.print("Altura: " + altura);
        System.out.print("Peso: " + peso);
    }
    
    //Método para calcular o IMC de uma pessoa
    public float calcularIMC(){
        return peso/(altura*altura);
    }
    
    //Método para analisar a altura de uma Pessoa
    public String analisarAltura(){
        if(altura < 1.55){
            System.out.println("Baixo");
        }
        else if(altura >= 1.56 && altura <= 1.70){
            System.out.println("Altura mediana");
        }
        else if(altura >= 1.71 && altura <= 1.90){
            System.out.println("Alto");
        }
        
        else if(altura >= 1.90){
            System.out.println("Super Alto");
        }
        return analisarAltura();
    }
     
}

