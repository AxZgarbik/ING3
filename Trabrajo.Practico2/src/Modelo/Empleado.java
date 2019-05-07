package Modelo;
public class Empleado extends Persona {
    private double salario;
    private String FechaC;

public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaC() {
        return FechaC;
    }

    public void setFechaC(String FechaC) {
        this.FechaC = FechaC;
    }
    public String ToString (){
        return super.toString().concat("Fecha de contrato: "+FechaC +"Salario: " +salario);
    }
}
