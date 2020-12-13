package br.edu.ifnmg.poo.jvamorim.builderdesignpattern;

public class Program {
    public static void main(String[] args) {
        
        /* A classe Acai_SemBuilder possui as mesmas funcionalidades da classe 
           Acai, porém sem utilizar o Builder. Esse fato torna a instanciação de 
           um objeto dessa classe muito mais complicada em relação à classe Acai,
           que possui o Builder. Para perceber isso, basta tentar fazer a leitura
           de um objeto abaixo instanciado sem utilizar o Builder e um instanciado
           utilizando o Builder. É muito fácil se perder e não entender o que está
           acontecendo na instanciação do objeto sem Builder, pois a quantidade de
           argumentos passados no construtor é muito grande. Para saber o que cada
           argumento representa é necessário recorrer ao código do construtor, 
           abrindo a classe e a documentação, o que é bem inviável e contra
           produtivo.
           Além disso, teremos de definir valores para propriedades que nem sequer 
           serão usadas, já que neste contexto, um açaí ter como valor false uma
           propriedade que representada um adicional, simplesmente significa que 
           esse adicional/propriedade será ignorado durante as etapas que envolvem 
           a produção desse açaí no mundo real.
           Observe abaixo a construção de dois pedidos de açaí, sem a utilização
           do builder e com a utilização do Builder. No final o resultado é de
           fato o mesmo, mas a complexidade para criar sem o Builder é muitissíma
           maior. Qualquer programador que fosse ler o código abaixo, teria muito
           mais dificultada para ler os trechos onde o Builder não é utilizado.
        */
        
        
        // Pedido 1: um açaí de 300 mL, com banana e leite em pó.
        // Pedido 2: um açaí de 700 mL, com cupuaçu.
        
        
        System.out.println("SEM UTILIZAR O BUILDER:\n");
        
        Acai_SemBuilder acaiPedido1_SemBuilder =
            new Acai_SemBuilder(300, true, false, false, false, false, true, false, false, 
            false, false, false, false, false);
        
        Acai_SemBuilder acaiPedido2_SemBuilder =
            new Acai_SemBuilder(700, false, false, false, false, false, false, false, false, 
            false, false, false, false, true);
        
        System.out.println(acaiPedido1_SemBuilder);
        System.out.println(acaiPedido2_SemBuilder);
        
        
        System.out.println("UTILIZANDO O BUILDER:\n");
        
        Acai acaiPedido1_ComBuilder = new Acai.Builder(300).banana().leiteEmPo().build();
        Acai acaiPedido2_ComBuilder = new Acai.Builder(700).cupuacu().build();
        
        System.out.println(acaiPedido1_ComBuilder);
        System.out.println(acaiPedido2_ComBuilder);
    }
}
