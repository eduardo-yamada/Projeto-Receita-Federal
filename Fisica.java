/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receitafederal;


public class Fisica extends Contribuinte{

    private String cpf;
    private double gastosSaude;
    private double gastosEducacao;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public double getGastosEducacao() {
        return gastosEducacao;
    }

    public void setGastosEducacao(double gastosEducacao) {
        this.gastosEducacao = gastosEducacao;
    }

    public double calcularImpostoDeRenda(){
        double aux = 0;
        
        if (rendaLiquidaAnual <= 10000)
        {
            aux = 0;
        } else if(rendaLiquidaAnual<= 20000)
        {
            aux = rendaLiquidaAnual*0.1-1000;
        } else 
        {
            aux = rendaLiquidaAnual*0.25-4000;
        }
        
        return aux;
    }
}

