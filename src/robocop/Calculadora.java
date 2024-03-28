
package robocop;


public class Calculadora {
    private Robo robo;

    public void setRobo(Robo robo) {
        this.robo = robo;
    }

    public Robo getRobo() {
        return robo;
    }
    
    public Calculadora(Robo robo){}
    
    public float Soma(float num1, float num2){
    
        return num1 + num2;
    }
    
    public float Subtrair(float num1, float num2) {
    	return num1 - num2;
    }
    public float Multiplicar(float num1, float num2) {
    	return num1 * num2;
    }
    
    public float Dividir(float num1, float num2) {
    	return num1 / num2;
    }
}
