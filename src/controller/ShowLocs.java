package controller;

import java.util.*;
import java.util.Locale;

import com.opensymphony.xwork2.ActionSupport;

public class ShowLocs extends ActionSupport {
  Locale[] locs;
  
   public Locale[] getLocs() {
    return locs;
  }

  public void setLocs(Locale[] locs) {
    this.locs = locs;
  }
  public Map<String, String> getLocsMap() {
    return locsMap;
  }
  Map<String,String> locsMap=new HashMap<>();
  public String execute(){
     locs=Locale.getAvailableLocales();
     for(Locale loc:locs){
       locsMap.put(""+loc, 
           loc.getDisplayName(loc));       
     }
     return SUCCESS;
   }
}
