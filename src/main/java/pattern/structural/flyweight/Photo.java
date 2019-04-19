package pattern.structural.flyweight;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/19
 */
public class Photo {


    String location;

    Photo(){

    }

    Photo(String location){
        this.location = location;
    }

    public void info(){
        System.out.println("这张照片是在 "+ location +"拍的");
    }

}
