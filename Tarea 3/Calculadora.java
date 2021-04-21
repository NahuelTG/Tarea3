
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    public String Ecuacion_segundo_grado(double a, double b, double c){
        String Ecuacion_segundo_grado;
        Ecuacion_segundo_grado ="";
        double X1;
        double X2;
        
        if((Math.pow(b,2)-4*a*c) < 0){
            double imaginario = Math.sqrt(-(Math.pow(b,2) - 4*a*c));
            String ImaginarioSub1 = imaginario / (2*a) + "i";
            String ImaginarioSub2 = imaginario / (2*a) + "i";
            
            Ecuacion_segundo_grado = "Xsub1 ="+ -b/(2*a)+"+"+"("+ImaginarioSub1+")" +
                       "     Xsub2 ="+ -b/(2*a)+"-"+"("+ImaginarioSub2+")";
        }
        if((Math.pow(b,2)-4*a*c) >= 0){
            X1 = (- b + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a); 
            X2 = (- b - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
        
            Ecuacion_segundo_grado = "Xsub1 ="+ X1 +"     Xsub2 ="+ X2;
        }
        
        return Ecuacion_segundo_grado;
    }
    public String Ecuacion_de_la_recta(Punto nro1, Punto nro2){
        String Ecuacion;
        double m;
        m = (nro2.getY() - nro1.getY())/(nro2.getX() - nro1.getX());
        
        Ecuacion = "y = "+ m+"x"+"+"+"("+(nro1.getY()+(-m*nro1.getX()))+")";
        
        return Ecuacion;
    }
    public double Cat_Triangulo(double cat1, double Hip){
        double cat2;
        
        cat2 = Math.sqrt(Math.pow(Hip,2)-Math.pow(cat1,2));
        
        return cat2;
    }
}
