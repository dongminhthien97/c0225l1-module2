package Case_study.Phuong_tien_giao_thong.service;

import Case_study.Phuong_tien_giao_thong.entity.Oto;
import Case_study.Phuong_tien_giao_thong.repository.OtoRepository;


import java.util.List;

public class OtoService implements IOtoService{
    private OtoRepository otoRepository = new OtoRepository();

    @Override
    public List<Oto> findAll() {
        return otoRepository.findAll();
    }

    @Override
    public void add(Oto oTo) {
       otoRepository.add(oTo);
    }

    @Override
    public boolean deletebyBks(String bienKiemSoat) {
        return otoRepository.deletebyBks(bienKiemSoat);
    }

}
