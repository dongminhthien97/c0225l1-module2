package Case_study.Phuong_tien_giao_thong.repository;

import Case_study.Phuong_tien_giao_thong.entity.XeTai;

import java.util.List;

public interface IXeTaiRepository {
    List<XeTai> findAll();
    void add(XeTai xeTai);
    boolean deletebyBks(String bienKiemSoat);
}
