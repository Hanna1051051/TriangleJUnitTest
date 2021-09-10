public class Triangle {

 public static double triangleSquare(int a, int b, int c ){
   double per2=(a+b+c)/2;
     return (Math.sqrt(per2*(per2-a)*(per2-b)*(per2-c)));
 }
}

