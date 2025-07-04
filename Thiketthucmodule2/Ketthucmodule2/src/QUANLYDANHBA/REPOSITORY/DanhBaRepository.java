package QUANLYDANHBA.REPOSITORY;

import QUANLYDANHBA.Enity.DanhBa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DanhBaRepository implements IDanhBaRepository {

    private static final String CONTACTS_PATH ="src/QUANLYDANHBA/DATA/contacts.csv";

    @Override
    public static List<DanhBa> findAll() {
        List<DanhBa> danhba = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(CONTACTS_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 7) {
                    DanhBa danhBa = new DanhBa(parts[0].trim(), parts[1].trim(), parts[2].trim(), parts[3].trim(), parts[4].trim(),parts[6].trim(),parts[7].trim());
                    danhba.add(danhBa);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return danhba;
    }

    @Override
    public void add(DanhBa danhBa) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CONTACTS_PATH, true))) {
            writer.write(danhBa.toCSV());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean updateByTel(String tel, DanhBa danhBa) {
        return false;
    }

    @Override
    public boolean deleteByTel(String tel) {
        List<DanhBa> danhba = findAll();
        boolean removed = danhba.removeIf(d -> d.getTel().equalsIgnoreCase(tel));
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CONTACTS_PATH))) {
            for (DanhBa d : danhba) {
                writer.write(d.toCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return removed;
    }

    @Override
    public DanhBa findByTel(String tel)  {
        for (DanhBa d : findAll()) {
            if (d.getTel().equalsIgnoreCase(tel)) return d;
        }
        return null;
    }

    @Override
    public List<DanhBa> findByName(String name) {
        List<DanhBa> result = new ArrayList<>();
        for (DanhBa d : findAll()) {
            if (d.getName().equalsIgnoreCase(name)) result.add(d);
        }
        return result;
    }
}
