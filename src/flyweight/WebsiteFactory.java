package flyweight;

import java.util.HashMap;

public class WebsiteFactory {
    private HashMap<String,CWebsite> pool=new HashMap<>();

    public Website getWeb(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new CWebsite(type));
        }
        return pool.get(type);
    }

    public int getpoolCount(){
        return pool.size();
    }
}
