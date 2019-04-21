package pattern.behavioral.state;

/**
 *
 * @author blackey
 * @date 2019/4/21
 */
public class Work {

    private State state;

    public int hour;

    Work(){
        this.state = new AWork();
    }

    void changeStatue(State s){
        this.state = s;
    };

    void handle(){
        state.handle(this);
    }
}
