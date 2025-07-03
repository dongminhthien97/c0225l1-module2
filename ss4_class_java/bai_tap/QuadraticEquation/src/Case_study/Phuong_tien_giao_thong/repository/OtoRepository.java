package Case_study.Phuong_tien_giao_thong.repository;

import Case_study.Phuong_tien_giao_thong.entity.Oto;
import Case_study.Phuong_tien_giao_thong.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class OtoRepository implements IOtoRepository {
    private final String OTO_FILE ="bai_tap/QuadraticEquation/src/Case_study/Phuong_tien_giao_thong/data/oTo.csv";
    private final boolean APPEND = true;


    public List<Oto> findAll() {
        List<Oto> oToList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(OTO_FILE);
        String[] array = null;
        for (String line: stringList) {
            array = line.split(",");
            try {
                Oto oTo = new Oto(array[0], array[1], array[2], array[3], array[4], Double.parseDouble(array[5]));
                oToList.add(oTo);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
        return oToList;
    }

    @Override
    public void add(Oto oTo) {
        List<String> stringList = new ArrayList<>();
        stringList.add(oTo.getInfoToCSV());
        ReadAndWriteFile.writeListToCSV(OTO_FILE,stringList,APPEND);
    }

    @Override
    public boolean deletebyBks(String bienKiemSoat) {
        boolean isDelete = false;
        List<Oto> oToList = findAll();
        for (int i = 0; i <oToList.size() ; i++) {
            if (bienKiemSoat ==oToList.get(i).getInfoToCSV()) {
                oToList.remove(i);
                isDelete = true;
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Oto o: oToList) {
            stringList.add(o.getInfoToCSV());
        }
        ReadAndWriteFile.writeListToCSV(OTO_FILE,stringList,!APPEND);
        return isDelete;
    }
}
