package adapter.objectadapter;

public class VAdapter implements IV5 {
    private V220 v220;

    public VAdapter(V220 v) {
        v220 = v;
    }

    @Override
    public int output5V() {
        int srcV = 0, dstV = 0;
        if (v220 != null) {
            srcV = v220.output220V();
            dstV = srcV / 44;
        }
        return dstV;
    }
}
