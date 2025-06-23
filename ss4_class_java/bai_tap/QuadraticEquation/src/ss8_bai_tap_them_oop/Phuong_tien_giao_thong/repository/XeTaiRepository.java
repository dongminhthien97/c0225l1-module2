package ss8_bai_tap_them_oop.Phuong_tien_giao_thong.repository;

import ss8_bai_tap_them_oop.Phuong_tien_giao_thong.entity.XeTai;
import ss8_bai_tap_them_oop.Phuong_tien_giao_thong.service.IXeTaiService;

import java.util.ArrayList;
import java.util.List;

public class XeTaiRepository implements IXeTaiRepository {
    private static List<XeTai> xeTaiList = new ArrayList<>();

    public List<XeTai> findAll() {
        return xeTaiList;
    }

    @Override
    public void add(XeTai xeTai) {
        xeTaiList.add(xeTai);
    }

}
