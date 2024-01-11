package AlleNikhil.newTestNg.Test1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPr {

    @DataProvider(name = "ra")
    public Object[] get(){
        Object tr[][]={{12,12},
                {23,32}

        };
        return tr;
    }
    @Test(dataProvider = "ra")
    public void set(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }
}
