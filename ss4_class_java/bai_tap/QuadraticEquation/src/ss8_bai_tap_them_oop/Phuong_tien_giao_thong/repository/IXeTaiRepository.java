package ss8_bai_tap_them_oop.Phuong_tien_giao_thong.repository;

import ss8_bai_tap_them_oop.Phuong_tien_giao_thong.entity.XeTai;

import java.util.List;

public interface IXeTaiRepository {
    List<XeTai> findAll();
    void add(XeTai xeTai);
}
