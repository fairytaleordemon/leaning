package pattern.structural.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author blackey
 * @date 2019/4/17
 */
public abstract class Brand {

    protected List<SoftWare> softWare = new ArrayList<>();

    public void installSoft(SoftWare softWare){
        this.softWare.add(softWare);
    };

    abstract void run();

}
