
package receitafederal;

import java.util.Scanner;


public class ReceitaFederal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciar objeto
        Fisica f = new Fisica();
       
        ////  Execução 1
        //Entradas
        f.setNome("José");
        f.setCpf("121.252.433-33");
        f.setRendaBrutaAnual(12000);
        f.setGastosEducacao(2000);
        f.setGastosSaude(3500);
        
        //Cálculos
        f.calcularRendaLiquida(f.getGastosEducacao(), f.getGastosSaude());
        double aux = f.calcularImpostoDeRenda();
        
        //Saídas
        System.out.println("Nome....: " + f.getNome());
        System.out.println("CPF.....: " + f.getCpf());
        System.out.println("RendaLiq: " + f.getRendaLiquidaAnual());
        System.out.println("IRPF....: " + aux);
        
        
        System.out.println("\n\n\n");
        ////  Execução 2
        //Entradas
        f.setNome("Smallville");
        f.setCpf("689.784.929-43");
        f.setRendaBrutaAnual(25000);
        f.setGastosEducacao(3800);
        f.setGastosSaude(4500);
        
        //Cálculos
        f.calcularRendaLiquida(f.getGastosEducacao(), f.getGastosSaude());
        aux = f.calcularImpostoDeRenda();
        
        //Saídas
        System.out.println("Nome....: " + f.getNome());
        System.out.println("CPF.....: " + f.getCpf());
        System.out.println("RendaLiq: " + f.getRendaLiquidaAnual());
        System.out.println("IRPF....: " + aux);
        
        
    }
    
}

