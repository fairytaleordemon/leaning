package pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/19
 */
public class PhotoFactory {

    public Map<String,Photo> map = new HashMap<>();

    public Photo getPhoto(String location){
        Photo photo = null;
        if (map.get(location) != null){
             photo = map.get(location);
        }

        return photo;
    }


    public void takePhoto(String location){
        Photo photo = new Photo(location);
        map.put(location,photo);
    }

}
