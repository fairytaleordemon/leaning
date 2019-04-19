package pattern.structural.decorator;

/**
 * 手机配件（装饰者类）
 *
 * @author blackey
 * @date 2019/4/17
 */
public class Universal extends Phone{

    protected Phone phone;


    void decorate(Phone phone){
        this.phone = phone;
        this.show();
    }

    @Override
    void show(){
        if (phone != null){
            phone.show();
        }
    }
}
