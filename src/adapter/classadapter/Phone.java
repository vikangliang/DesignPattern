package adapter.classadapter;

public class Phone {
    public void changing(IV5 iv5){
        if(iv5.output5V()==5){
            System.out.println("转为5v,开始充电");
        }else{
            System.out.println("电压不符合");
        }
    }
}
