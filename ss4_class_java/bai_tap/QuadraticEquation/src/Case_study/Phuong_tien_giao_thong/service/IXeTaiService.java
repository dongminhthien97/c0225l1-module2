package Case_study.Phuong_tien_giao_thong.service;

import Case_study.Phuong_tien_giao_thong.entity.XeTai;

import java.util.List;

public interface IXeTaiService {
    List<XeTai> findAll();
    void add(XeTai xeTai);
    boolean deletebyBks(String bienKiemSoat);
}
