package dao;

import java.util.List;

import domain.Stu;

public interface StuDAO {
   boolean check(String username) throws Exception;
   List<String[]> getAllStus() throws Exception;
   List<Stu> getAllStusByObj() throws Exception;
}
