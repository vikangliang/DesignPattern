package adapter.classadapter;

public class VAdapter extends V220 implements IV5 {
    @Override
    public int output5V() {
        int srcV=output220V();
        int dstV=srcV/44;
        return dstV;
    }
}
