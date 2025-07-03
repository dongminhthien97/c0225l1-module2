package Case_study.Phuong_tien_giao_thong.service;

import Case_study.Phuong_tien_giao_thong.entity.XeMay;
import Case_study.Phuong_tien_giao_thong.repository.XeMayRepository;

import java.util.List;

public class XeMayService implements IXeMayService {
    private XeMayRepository xemayRepository = new XeMayRepository();

    @Override
    public List<XeMay> findAll() {
        return xemayRepository.findAll();
    }

    @Override
    public void add(XeMay xeMay) {
        xemayRepository.add(xeMay);
    }

    @Override
    public boolean deletebyBks(String bienKiemSoat) {
        return xemayRepository.deletebyBks(bienKiemSoat);
    }
}
