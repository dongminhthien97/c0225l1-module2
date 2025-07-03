package Case_study.Phuong_tien_giao_thong.repository;

import Case_study.Phuong_tien_giao_thong.entity.XeMay;
import Case_study.Phuong_tien_giao_thong.entity.XeTai;

import java.util.List;

public interface IXeMayRepository {
    List<XeMay> findAll();
    void add(XeMay xeMay);
    boolean deletebyBks(String bienKiemSoat);
}
