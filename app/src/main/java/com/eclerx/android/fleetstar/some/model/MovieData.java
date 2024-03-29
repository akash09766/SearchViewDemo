package com.eclerx.android.fleetstar.some.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Awesome Pojo Generator
 * */
public class MovieData {
  @SerializedName("page")
  @Expose
  private Integer page;
  @SerializedName("total_pages")
  @Expose
  private Integer total_pages;
  @SerializedName("results")
  @Expose
  private ArrayList<Results> results;
  @SerializedName("total_results")
  @Expose
  private Integer total_results;
  public void setPage(Integer page){
   this.page=page;
  }
  public Integer getPage(){
   return page;
  }
  public void setTotal_pages(Integer total_pages){
   this.total_pages=total_pages;
  }
  public Integer getTotal_pages(){
   return total_pages;
  }
  public void setResults(ArrayList<Results> results){
   this.results=results;
  }
  public ArrayList<Results> getResults(){
   return results;
  }
  public void setTotal_results(Integer total_results){
   this.total_results=total_results;
  }
  public Integer getTotal_results(){
   return total_results;
  }
}