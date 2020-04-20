package guimaraes.joao.Exemplomaven;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calculadora {

    private double numero1;
    private double numero2;


    public double somar(){
        return this.numero1 + this.numero2;
    }

    public double mutiplicar(){
        return this.numero1 * this.numero2;
    }

    public double dividir(){
        return this.numero1/this.numero2;
    }

    public double subtrair(){
        return this.numero1 - this.numero2;
    }

}
