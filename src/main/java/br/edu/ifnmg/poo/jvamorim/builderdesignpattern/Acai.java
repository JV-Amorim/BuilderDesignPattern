package br.edu.ifnmg.poo.jvamorim.builderdesignpattern;

/**
 * A classe Acai possuiria um construtor muito complicado caso o Design Pattern 
 * Builder não fosse utilizado.
 */
public class Acai {
    
    //<editor-fold defaultstate="collapsed" desc="Propriedades">
    
    // As propriedades de um objeto da classe Acai serão definidos pelo Builder.
    private int tamanho;
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
    
    //<editor-fold defaultstate="collapsed" desc="Construtor Privado">
    
    /**
     * O construtor da classe Acai é privado, pois não queremos instanciá-la
     * diretamente. A instanciação de um objeto dessa classe será feito pelo 
     * Builder, que irá realizar a construção passo-a-passo. Dessa forma, não 
     * teremos um construtor monstruoso na classe Acai.
     * @param builder Builder da classe Acai.
     */
    private Acai(Builder builder) {
        tamanho = builder.tamanho;
        banana = builder.banana;
        morango = builder.morango;
        granola = builder.granola;
        aveia = builder.aveia;
        farinhaAmendoim = builder.farinhaAmendoim;
        leiteEmPo = builder.leiteEmPo;
        leiteCondensado = builder.leiteCondensado;
        mousseMorango = builder.mousseMorango;
        mel = builder.mel;
        chocobol = builder.chocobol;
        chocolateGranulado = builder.chocolateGranulado;
        gotasChocolate = builder.gotasChocolate;
        cupuacu = builder.cupuacu;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Builder">
    
    /**
     * Classe responsável por facilitar a construção de objetos do tipo Acai.
     */
    public static class Builder {
        
        // Propriedade obrigatória para um objeto do tipo Acai:
        private final int tamanho;

        // Propriedades opcionais para um objeto do tipo Acai:
        private boolean banana;
        private boolean morango;
        private boolean granola;
        private boolean aveia;
        private boolean farinhaAmendoim;
        private boolean leiteEmPo;
        private boolean leiteCondensado;
        private boolean mousseMorango;
        private boolean mel;
        private boolean chocobol;
        private boolean chocolateGranulado;
        private boolean gotasChocolate;
        private boolean cupuacu;

        /**
         * Inicializar a construção de um objeto do tipo Acai. O Builder recebe
         * somente os atributos obrigatórios como parâmetros.
         * @param tamanho Tamanho do açai em mL. Exemplo: 500 irá gerar um objeto
         * do tipo Acai que representa um açaí de 500 mL.
         */
        public Builder(int tamanho) {
            this.tamanho = tamanho;
        }

        /**
         * Finalizar a construção do objeto.
         * @return Objeto do tipo Acai com a construção finalizada.
         */
        public Acai build() {
            return new Acai(this);
        }

        /**
         * Adiciona banana ao açaí.
         * @return Objeto do tipo Builder. Trata-se do objeto do tipo Acai ainda
         * em construção (não-finalizado). Para finalizar a construção é necessário
         * chamar o método build().
         */
        public Builder banana() {
            banana = true;
            return this;
        }

        /**
         * Adiciona morango ao açaí.
         * @return Objeto do tipo Builder. Trata-se do objeto do tipo Acai ainda
         * em construção (não-finalizado). Para finalizar a construção é necessário
         * chamar o método build().
         */
        public Builder morango() {
            morango = true;
            return this;
        }

        /**
         * Adiciona granola ao açaí.
         * @return Objeto do tipo Builder. Trata-se do objeto do tipo Acai ainda
         * em construção (não-finalizado). Para finalizar a construção é necessário
         * chamar o método build().
         */
        public Builder granola() {
            granola = true;
            return this;
        }

        /**
         * Adiciona aveia ao açaí.
         * @return Objeto do tipo Builder. Trata-se do objeto do tipo Acai ainda
         * em construção (não-finalizado). Para finalizar a construção é necessário
         * chamar o método build().
         */
        public Builder aveia() {
            aveia = true;
            return this;
        }

        /**
         * Adiciona farinha de amendoim ao açaí.
         * @return Objeto do tipo Builder. Trata-se do objeto do tipo Acai ainda
         * em construção (não-finalizado). Para finalizar a construção é necessário
         * chamar o método build().
         */
        public Builder farinhaAmendoim() {
            farinhaAmendoim = true;
            return this;
        }

        /**
         * Adiciona leite em pó ao açaí.
         * @return Objeto do tipo Builder. Trata-se do objeto do tipo Acai ainda
         * em construção (não-finalizado). Para finalizar a construção é necessário
         * chamar o método build().
         */
        public Builder leiteEmPo() {
            leiteEmPo = true;
            return this;
        }

        /**
         * Adiciona leite condensado ao açaí.
         * @return Objeto do tipo Builder. Trata-se do objeto do tipo Acai ainda
         * em construção (não-finalizado). Para finalizar a construção é necessário
         * chamar o método build().
         */
        public Builder leiteCondensado() {
            leiteCondensado = true;
            return this;
        }

        /**
         * Adiciona mousse de morango ao açaí.
         * @return Objeto do tipo Builder. Trata-se do objeto do tipo Acai ainda
         * em construção (não-finalizado). Para finalizar a construção é necessário
         * chamar o método build().
         */
        public Builder mousseMorango() {
            mousseMorango = true;
            return this;
        }

        /**
         * Adiciona mel ao açaí.
         * @return Objeto do tipo Builder. Trata-se do objeto do tipo Acai ainda
         * em construção (não-finalizado). Para finalizar a construção é necessário
         * chamar o método build().
         */
        public Builder mel() {
            mel = true;
            return this;
        }

        /**
         * Adiciona chocobol ao açaí.
         * @return Objeto do tipo Builder. Trata-se do objeto do tipo Acai ainda
         * em construção (não-finalizado). Para finalizar a construção é necessário
         * chamar o método build().
         */
        public Builder chocobol() {
            chocobol = true;
            return this;
        }

        /**
         * Adiciona chocolate granulado ao açaí.
         * @return Objeto do tipo Builder. Trata-se do objeto do tipo Acai ainda
         * em construção (não-finalizado). Para finalizar a construção é necessário
         * chamar o método build().
         */
        public Builder chocolateGranulado() {
            chocolateGranulado = true;
            return this;
        }

        /**
         * Adiciona gotas de chocolate ao açaí.
         * @return Objeto do tipo Builder. Trata-se do objeto do tipo Acai ainda
         * em construção (não-finalizado). Para finalizar a construção é necessário
         * chamar o método build().
         */
        public Builder gotasChocolate() {
            gotasChocolate = true;
            return this;
        }

        /**
         * Adiciona cupuaçu ao açaí.
         * @return Objeto do tipo Builder. Trata-se do objeto do tipo Acai ainda
         * em construção (não-finalizado). Para finalizar a construção é necessário
         * chamar o método build().
         */
        public Builder cupuacu() {
            cupuacu = true;
            return this;
        }
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
