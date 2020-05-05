/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receitafederal;

/**
 *
 * @author 11161103031
 */
public class Contribuinte {
 
    private String nome;
    protected double rendaBrutaAnual;
    protected double rendaLiquidaAnual;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaBrutaAnual() {
        return rendaBrutaAnual;
    }

    public void setRendaBrutaAnual(double rendaBrutaAnual) {
        this.rendaBrutaAnual = rendaBrutaAnual;
    }

    public double getRendaLiquidaAnual() {
        return rendaLiquidaAnual;
    }


    public double calcularRendaLiquida(double abatimento1, double abatimento2){
        rendaLiquidaAnual = rendaBrutaAnual - (abatimento1+abatimento2);
        return rendaLiquidaAnual;
        
    }

   
}

