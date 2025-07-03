package Case_study.Phuong_tien_giao_thong.service;

import Case_study.Phuong_tien_giao_thong.entity.XeMay;
import Case_study.Phuong_tien_giao_thong.entity.XeTai;

import java.util.List;

public interface IXeMayService {
    List<XeMay> findAll();
    void add(XeMay xeMay);
    boolean deletebyBks(String bienKiemSoat);
}
