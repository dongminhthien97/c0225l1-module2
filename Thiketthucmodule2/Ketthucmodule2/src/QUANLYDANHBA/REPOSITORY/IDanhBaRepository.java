package QUANLYDANHBA.REPOSITORY;

import QUANLYDANHBA.Enity.DanhBa;

import java.util.List;

public interface IDanhBaRepository {
    List<DanhBa> findAll();
    void add(DanhBa danhBa);
    boolean deleteByTel(String tel);;
}
