package br.edu.ifnmg.poo.jvamorim.builderdesignpattern;

/**
 * A classe Acai_SemBuilder possui um construtor muito complicado, já que o Design
 * Pattern Builder não foi utilizado.
 */
public class Acai_SemBuilder {
    
    //<editor-fold defaultstate="collapsed" desc="Propriedades">
    
    private final int tamanho;
    private final boolean banana;
    private final boolean morango;
    private final boolean granola;
    private final boolean aveia;
    private final boolean farinhaAmendoim;
    private final boolean leiteEmPo;
    private final boolean leiteCondensado;
    private final boolean mousseMorango;
    private final boolean mel;
    private final boolean chocobol;
    private final boolean chocolateGranulado;
    private final boolean gotasChocolate;
    private final boolean cupuacu;
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    
    /**
     * O construtor dessa classe (Acai_SemBuilder) possui parâmetros em excesso,
     * algo que poderia ser totalmente evitado com a utilização do Builder.
     * 
     * @param tamanho Tamanho do açaí em mL.
     * @param banana Possui banana?
     * @param morango Possui morango?
     * @param granola Possui granola?
     * @param aveia Possui aveia?
     * @param farinhaAmendoim Possui farinha de amendoim?
     * @param leiteEmPo Possui leite em pó?
     * @param leiteCondensado Possui leite condensado?
     * @param mousseMorango Possui mousse de morango?
     * @param mel Possui mel?
     * @param chocobol Possui chocobol?
     * @param chocolateGranulado Possui chocolate granulado?
     * @param gotasChocolate Possui gotas de chocolate?
     * @param cupuacu Possui cupuaçu?
     */
    public Acai_SemBuilder(int tamanho, boolean banana, boolean morango, boolean granola, boolean aveia, boolean farinhaAmendoim, boolean leiteEmPo, boolean leiteCondensado, boolean mousseMorango, boolean mel, boolean chocobol, boolean chocolateGranulado, boolean gotasChocolate, boolean cupuacu) {
        this.tamanho = tamanho;
        this.banana = banana;
        this.morango = morango;
        this.granola = granola;
        this.aveia = aveia;
        this.farinhaAmendoim = farinhaAmendoim;
        this.leiteEmPo = leiteEmPo;
        this.leiteCondensado = leiteCondensado;
        this.mousseMorango = mousseMorango;
        this.mel = mel;
        this.chocobol = chocobol;
        this.chocolateGranulado = chocolateGranulado;
        this.gotasChocolate = gotasChocolate;
        this.cupuacu = cupuacu;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters">
    
    public int getTamanho() {
        return tamanho;
    }

    public boolean getBanana() {
        return banana;
    }

    public boolean getMorango() {
        return morango;
    }

    public boolean getGranola() {
        return granola;
    }

    public boolean getAveia() {
        return aveia;
    }

    public boolean getFarinhaAmendoim() {
        return farinhaAmendoim;
    }

    public boolean getLeiteEmPo() {
        return leiteEmPo;
    }

    public boolean getLeiteCondensado() {
        return leiteCondensado;
    }

    public boolean getMousseMorango() {
        return mousseMorango;
    }

    public boolean getMel() {
        return mel;
    }

    public boolean getChocobol() {
        return chocobol;
    }

    public boolean getChocolateGranulado() {
        return chocolateGranulado;
    }

    public boolean getGotasChocolate() {
        return gotasChocolate;
    }

    public boolean getCupuacu() {
        return cupuacu;
    }
    
    //</editor-fold>
    
    @Override
    public String toString() {
        String texto = "AÇAÍ - " + getTamanho() + " mL\nAdicionais: \n";
        
        texto += getBanana() ? "- Banana\n" : "";
        texto += getMorango() ? "- Morango\n" : "";
        texto += getGranola() ? "- Granola\n" : "";
        texto += getAveia() ? "- Aveia\n" : "";
        texto += getFarinhaAmendoim() ? "- Farinha de amendoim\n" : "";
        texto += getLeiteEmPo() ? "- Leite em pó\n" : "";
        texto += getLeiteCondensado() ? "- Leite condensado\n" : "";
        texto += getMousseMorango() ? "- Mousse de morango\n" : "";
        texto += getMel() ? "- Mel\n" : "";
        texto += getChocobol() ? "- Chocobol\n" : "";
        texto += getChocolateGranulado() ? "- Chocolate granulado\n" : "";
        texto += getGotasChocolate() ? "- Gotas de chocolate\n" : "";
        texto += getCupuacu() ? "- Cupuaçu\n" : "";
        
        return texto;
    }
}
