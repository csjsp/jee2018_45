package demo;

import static java.lang.System.out;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class I18NDemo {
  private final static Logger logger
  =LoggerFactory.getLogger(I18NDemo.class);
  public static void main(String[] args) {
    // if(在大陆) inCn();
    // else inTw();
    inCn();
    // loc();
    // i18n();
    // formatDemo();
    // format2();
    //order();
    getAllLocs();
  }

  public static void order() {
    Locale enLoc = new Locale("en", "US");
    // msg_en_US
    ResourceBundle bundle = ResourceBundle.getBundle("demo.msg", enLoc);
    out.println(bundle.getString("id"));
    out.println(bundle.getString("stu.info"));

  }

  public static void loc() {
    // Locale loc=new Locale("zh","CN");
    Locale loc = Locale.getDefault();// 现在在哪
    out.println(loc);
    String strLoc = "" + loc;
    switch (strLoc) {
    case "zh_CN":
      inCn();
      break;
    case "zh_TW":
      inTw();
      break;
    default:
      inCn();
    }
  }

  public static void i18n() {
    ResourceBundle bundle = ResourceBundle.getBundle("demo.msg");
    String id = bundle.getString("id");
    out.println(id);
  }

  public static void formatDemo() {
    String info = "学号是{0},姓名是{1}";
    String res = MessageFormat.format(info, 1L, "zhangsan", 45);
    out.println(res);
  }

  public static void format2() {
    String info = "时间是{0,time},日期是{0,date,full}";
    String res = MessageFormat.format(info, new Date());
    out.println(res);
  }

  public static void inCn() {
    logger.error("学号");
    logger.error("信息");
  }

  public static void inTw() {
    out.println("學號");
    out.println("資訊");
  }
  public static void getAllLocs(){
    Locale[] locs=Locale.getAvailableLocales();
    for(Locale loc:locs){
      logger.debug("loc is->{}",loc.getDisplayName(loc));   
 
    }
  }
}
