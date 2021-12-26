import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HACKEARTH {

    /* public static void main(String args[]) throws Exception {
HACKEARTH OBJ = new HACKEARTH();
OBJ.start();

    }
    private void start(){
        System.out.println(check("12345"));
        System.out.println(check("123456"));
        System.out.println(check(null));

    }   */

    private boolean check(String s) {
        try {
return s.length() >5;
        }
        catch(NullPointerException e){
            System.out.println("an excpetion occured");
                    return false;

        }
    }

    public static void main(String args[]) {
        Stream<double[]> HackValue = IntStream.rangeClosed(1,100).boxed()
 .flatMap(a->IntStream.rangeClosed(a,10).mapToObj(b->new double[] {a,b,Math.sqrt(a*a+b*b)}).filter(t->t[2]%1==0));
    HackValue.limit(5).forEach(t->System.out.println(t[0]+" "+t[1]+" "+t[2]));}
    }
