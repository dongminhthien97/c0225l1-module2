package Case_study.Phuong_tien_giao_thong.repository;

import Case_study.Phuong_tien_giao_thong.entity.Oto;

import java.util.List;

public interface IOtoRepository {
    List<Oto> findAll();
    void add(Oto oTo);
    boolean deletebyBks(String bienKiemSoat);
}
