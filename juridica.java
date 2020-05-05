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
public class juridica extends Contribuinte{

    private String cnpj;
    private double gastosPessoal;
    private double gastosEqupamentos;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getGastosPessoal() {
        return gastosPessoal;
    }

    public void setGastosPessoal(double gastosPessoal) {
        this.gastosPessoal = gastosPessoal;
    }

    public double getGastosEqupamentos() {
        return gastosEqupamentos;
    }

    public void setGastosEqupamentos(double gastosEqupamentos) {
        this.gastosEqupamentos = gastosEqupamentos;
    }

    public double calcularImpostoDeRenda() {
        double aux = 0;
        if (rendaLiquidaAnual <= 100000) 
        {
            aux = rendaLiquidaAnual * 0.05;
            
        } else if (rendaLiquidaAnual <= 200000) 
        {
            aux = rendaLiquidaAnual * 0.1 - 5000;

        } else 
        {
            aux = rendaLiquidaAnual * 0.3 - 45000;
        }

        return aux;
    }
}

