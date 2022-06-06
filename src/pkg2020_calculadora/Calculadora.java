/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2020_calculadora;

/**
 *
 * @author Javi
 */
public class Calculadora {
    private int num1; 
    private int num2;
    public Calculadora (int a, int b){ 
        num1=a; 
        num2=b;
    }
    public int suma(){ 
        int resul=num1+num2; 
        return resul;
    }
    public int resta(){ 
        int resul=num1-num2; 
        return resul;
    }
    public int multiplica(){ 
        int resul=num1*num2; 
        return resul;
    }
    public int divide(){ 
        int resul = 0;
        if (num2!=0) {
            resul=num1/num2;
        }
        return resul;
    }

}
