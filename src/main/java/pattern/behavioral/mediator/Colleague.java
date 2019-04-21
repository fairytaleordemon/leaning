package pattern.behavioral.mediator;

/**
 * 同事类
 *
 * @author blackey
 * @date 2019/4/20
 */
public abstract class Colleague {

    private String name;

    private String code;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    abstract void coding();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
