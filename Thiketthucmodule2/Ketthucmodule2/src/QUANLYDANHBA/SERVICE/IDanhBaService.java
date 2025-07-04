package QUANLYDANHBA.SERVICE;

import QUANLYDANHBA.Enity.DanhBa;

import java.util.List;

public interface IDanhBaService {
    List<DanhBa> findAll();
    void add(DanhBa danhBa);
    static boolean deleteByTel(String tel);
}
