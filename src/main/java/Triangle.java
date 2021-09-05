public class Triangle {

 public static double triangleSquare(double a, double b, double c ){
   double per2=(a+b+c)/2;
     return (Math.sqrt(per2*(per2-a)*(per2-b)*(per2-c)));
 }
}

