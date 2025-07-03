package Case_study.Phuong_tien_giao_thong.service;

import Case_study.Phuong_tien_giao_thong.entity.Oto;
import Case_study.Phuong_tien_giao_thong.entity.XeMay;

import java.util.List;

public interface IOtoService {
    List<Oto> findAll();
    void add(Oto oTo);
    boolean deletebyBks(String bienKiemSoat);
}
