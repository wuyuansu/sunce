import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/21.
 */
public class My implements Serializable{
    private int a;
    public My(int b){
        a=b;
    }

    @Override
    public String toString() {
        return "My{" +
                "a=" + a +
                '}';
    }
}
