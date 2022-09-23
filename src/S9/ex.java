package S9;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ex {
    @Test
    @Parameters({"a","b"})
    public void sum(int c,int d ){
        int add= c+d;
        System.out.print("sum="+add);
    }

    @Test
    @Parameters({"a","b"})
    public void mul(int c,int d ) {
        int product = c * d;
        System.out.print("multiply=" + product);
    }
    @Test
    @Parameters({"a","b"})
    public void sub(int c,int d ){
        int subtract= c-d;
        System.out.print("sub="+subtract);
    }

}

