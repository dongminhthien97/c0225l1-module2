package Case_study.Phuong_tien_giao_thong.repository;

import Case_study.Phuong_tien_giao_thong.entity.XeTai;
import Case_study.Phuong_tien_giao_thong.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class XeTaiRepository implements IXeTaiRepository {
    private final String TRUCK_FILE ="bai_tap/QuadraticEquation/src/Case_study/Phuong_tien_giao_thong/data/xeTai.csv";
    private final boolean APPEND = true;


    public List<XeTai> findAll() {
        List<XeTai> xeTaiList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(TRUCK_FILE);
        String[] array =null;
        for (String line: stringList) {
            array = line.split(",");
            XeTai xeTai = new XeTai( array[0], array[1],array[2],array[3],
                    Double.parseDouble(array[4]));
            xeTaiList.add(xeTai);
        }
        return xeTaiList;
    }

    @Override
    public void add(XeTai xeTai) {
        List<String> stringList = new ArrayList<>();
        stringList.add(xeTai.getInfoToCSV());
        ReadAndWriteFile.writeListToCSV(TRUCK_FILE,stringList,APPEND);
    }

    @Override
    public boolean deletebyBks(String bienKiemSoat) {
        boolean isDelete = false;
        List<XeTai> xeTaiList = findAll();
        for (int i = 0; i <xeTaiList.size() ; i++) {
            if (Objects.equals(bienKiemSoat, xeTaiList.get(i).getBienKiemSoat())){
                xeTaiList.remove(i);
                isDelete = true;
                break;
            }
        }
        // chuyển sang listring để ghi lại
        List<String> stringList = new ArrayList<>();
        for (XeTai s: xeTaiList) {
            stringList.add(s.getInfoToCSV());
        }
        ReadAndWriteFile.writeListToCSV(TRUCK_FILE,stringList,!APPEND);
        return isDelete;
    }
}
