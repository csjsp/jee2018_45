package dao;

import java.sql.*;
import java.util.*;

import domain.Stu;

public class StuDAOImp implements StuDAO {
  String url = "jdbc:hsqldb:hsql://localhost";
  String driver = "org.hsqldb.jdbcDriver";
  String user = "sa";
  String pass = "";

  @Override
  public boolean check(String username) throws Exception {
    Class.forName(driver);
    String sql = "select * from stu where username =?";
    boolean isHave = false;
    try (Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement pstmt = con.prepareStatement(sql);) {
      pstmt.setString(1, username);
      try (ResultSet rs = pstmt.executeQuery();) {
        isHave = rs.next();
      }
    }
    return isHave;
  }

  /**
   * 得到所有学生 select * from stu last,getRow当前时第几行,beforeFirst List<String[]>
   */
  // List<Stu>
  @Override
  public List<String[]> getAllStus() throws Exception {
    List<String[]> stus = new ArrayList<>();
    Class.forName(driver);
    String sql = "select * from stu";
    try (Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement pstmt = con.prepareStatement(sql);) {
      try (ResultSet rs = pstmt.executeQuery();) {
        while (rs.next()) {// 保存每行的数据
          String[] row = new String[5];
          row[0] = rs.getString("id");
          row[1] = rs.getString("username");
          row[2] = rs.getString("java");
          row[3] = rs.getString("math");
          row[4] = rs.getString("os");
          stus.add(row);
        }
      }
    }
    return stus;
  }

  @Override
  public List<Stu> getAllStusByObj() throws Exception {
    List<Stu> stus = new ArrayList<>();
    Class.forName(driver);
    String sql = "select * from stu";
    try (Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement pstmt = con.prepareStatement(sql);) {
      try (ResultSet rs = pstmt.executeQuery();) {
        while (rs.next()) {// 保存每行的数据
          Stu stu = new Stu();
          stu.setId(rs.getLong("id"));
          stu.setUsername(rs.getString("username"));
          stus.add(stu);
        }
      }
      return stus;
    }
  }
   @Override
  public Stu findById(long id) throws Exception {
    Stu stu=new Stu();
    Class.forName(driver);
    String sql = "select * from stu where id=?";
    try (Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement pstmt = con.prepareStatement(sql);) {
      pstmt.setLong(1,id);
      try (ResultSet rs = pstmt.executeQuery();) {
        rs.next();
        stu.setId(rs.getLong("id"));
        stu.setUsername(rs.getString("username"));
        stu.setJava(rs.getDouble("java"));
        stu.setMath(rs.getDouble("math"));
        stu.setOs(rs.getDouble("os"));
      }
    }
    return stu;
  }

  @Override
  public boolean save(Stu stu) throws Exception {
    boolean isSuc=false;
    Class.forName(driver);
    String sql = "insert into stu(username,java,math,os) values(?,?,?,?)";
    try (Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement pstmt = con.prepareStatement(sql);) {
      pstmt.setString(1,stu.getUsername());
      pstmt.setDouble(2,stu.getJava());
      pstmt.setDouble(3,stu.getMath());
      pstmt.setDouble(4, stu.getOs());      
      int row=pstmt.executeUpdate();
      isSuc=row>0;
    }
    return isSuc;
  }
  @Override
  public boolean update(Stu stu) throws Exception {
    boolean isSuc=false;
    Class.forName(driver);
    String sql = "update stu set username=?,java=?,math=?,os=? where id=?";
    try (Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement pstmt = con.prepareStatement(sql);) {
      pstmt.setString(1,stu.getUsername());
      pstmt.setDouble(2,stu.getJava());
      pstmt.setDouble(3,stu.getMath());
      pstmt.setDouble(4, stu.getOs()); 
      pstmt.setLong(5, stu.getId());
      int row=pstmt.executeUpdate();
      isSuc=row>0;
    }
    return isSuc;
  }

  @Override
  public boolean delById(long id) throws Exception {
    boolean isSuc=false;
    Class.forName(driver);
    String sql = "delete from stu where id=?";
    try (Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement pstmt = con.prepareStatement(sql);) {
      pstmt.setLong(1,id);
      int row=pstmt.executeUpdate();
      isSuc=row>0;
    }
    return isSuc;
  }
}
