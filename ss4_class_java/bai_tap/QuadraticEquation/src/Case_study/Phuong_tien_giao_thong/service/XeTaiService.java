package Case_study.Phuong_tien_giao_thong.service;

import Case_study.Phuong_tien_giao_thong.entity.XeTai;
import Case_study.Phuong_tien_giao_thong.repository.XeTaiRepository;

import java.util.List;

public class XeTaiService implements IXeTaiService {
    private XeTaiRepository xetaiRepository = new XeTaiRepository();

    @Override
    public List<XeTai> findAll() {
        return xetaiRepository.findAll();
    }

    @Override
    public void add(XeTai xeTai) {
        xetaiRepository.add(xeTai);
    }

    @Override
    public boolean deletebyBks(String bienKiemSoat) {
        return xetaiRepository.deletebyBks(bienKiemSoat);
    }
}
