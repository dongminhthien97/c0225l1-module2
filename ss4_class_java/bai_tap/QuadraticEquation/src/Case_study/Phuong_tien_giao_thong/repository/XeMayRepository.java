package Case_study.Phuong_tien_giao_thong.repository;

import Case_study.Phuong_tien_giao_thong.entity.XeMay;
import Case_study.Phuong_tien_giao_thong.entity.XeTai;
import Case_study.Phuong_tien_giao_thong.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class XeMayRepository implements IXeMayRepository{
    private final String XEMAY_FILE ="bai_tap/QuadraticEquation/src/Case_study/Phuong_tien_giao_thong/data/xeMay.csv";
    private final boolean APPEND = true;


    public List<XeMay> findAll() {
        List<XeMay> xeMayList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(XEMAY_FILE);
        String[] array =null;
        for (String line: stringList) {
            array = line.split(",");
            XeMay xeMay = new XeMay( array[0], array[1],array[2],array[3],
                    Double.parseDouble(array[4]));
            xeMayList.add(xeMay);
        }
        return xeMayList;
    }

    @Override
    public void add(XeMay xeMay) {
        List<String> stringList = new ArrayList<>();
        stringList.add(xeMay.getInfoToCSV());
        ReadAndWriteFile.writeListToCSV(XEMAY_FILE,stringList,APPEND);
    }

    @Override
    public boolean deletebyBks(String bienKiemSoat) {
        boolean isDelete = false;
        List<XeMay> xeMayList = findAll();
        for (int i = 0; i < xeMayList.size() ; i++) {
            if (bienKiemSoat == xeMayList.get(i).getInfoToCSV()) {
                xeMayList.remove(i);
                isDelete = true;
                break;
            }
        }
        // chuyển sang listring để ghi lại
        List<String> stringList = new ArrayList<>();
        for (XeMay s: xeMayList) {
            stringList.add(s.getInfoToCSV());
        }
        ReadAndWriteFile.writeListToCSV(XEMAY_FILE,stringList,!APPEND);
        return isDelete;
    }
}
