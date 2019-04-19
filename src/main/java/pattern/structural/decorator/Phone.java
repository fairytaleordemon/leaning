package pattern.structural.decorator;

/**
 * 手机（被装饰者）
 *
 * @author blackey
 * @date 2019/4/17
 */
public class Phone {

    private String name;

    void show(){
        System.out.println(name + "的手机安装完了配件");
    }

    public void setName(String name) {
        this.name = name;
    }
}
