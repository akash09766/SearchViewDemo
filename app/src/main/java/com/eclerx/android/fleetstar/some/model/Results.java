package com.eclerx.android.fleetstar.some.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Awesome Pojo Generator
 * */
public class Results{
  @SerializedName("overview")
  @Expose
  private String overview;
  @SerializedName("original_language")
  @Expose
  private String original_language;
  @SerializedName("original_title")
  @Expose
  private String original_title;
  @SerializedName("video")
  @Expose
  private Boolean video;
  @SerializedName("title")
  @Expose
  private String title;
  @SerializedName("genre_ids")
  @Expose
  private List<Integer> genre_ids;
  @SerializedName("poster_path")
  @Expose
  private String poster_path;
  @SerializedName("backdrop_path")
  @Expose
  private String backdrop_path;
  @SerializedName("release_date")
  @Expose
  private String release_date;
  @SerializedName("popularity")
  @Expose
  private Float popularity;
  @SerializedName("vote_average")
  @Expose
  private Float vote_average;
  @SerializedName("id")
  @Expose
  private Integer id;
  @SerializedName("adult")
  @Expose
  private Boolean adult;
  @SerializedName("vote_count")
  @Expose
  private Integer vote_count;
  public void setOverview(String overview){
   this.overview=overview;
  }
  public String getOverview(){
   return overview;
  }
  public void setOriginal_language(String original_language){
   this.original_language=original_language;
  }
  public String getOriginal_language(){
   return original_language;
  }
  public void setOriginal_title(String original_title){
   this.original_title=original_title;
  }
  public String getOriginal_title(){
   return original_title;
  }
  public void setVideo(Boolean video){
   this.video=video;
  }
  public Boolean getVideo(){
   return video;
  }
  public void setTitle(String title){
   this.title=title;
  }
  public String getTitle(){
   return title;
  }
  public Object getGenre_ids(){
   return genre_ids;
  }
  public void setPoster_path(String poster_path){
   this.poster_path=poster_path;
  }
  public String getPoster_path(){
   return poster_path;
  }
  public void setBackdrop_path(String backdrop_path){
   this.backdrop_path=backdrop_path;
  }
  public String getBackdrop_path(){
   return backdrop_path;
  }
  public void setRelease_date(String release_date){
   this.release_date=release_date;
  }
  public String getRelease_date(){
   return release_date;
  }
  public void setPopularity(Float popularity){
   this.popularity=popularity;
  }
  public Float getPopularity(){
   return popularity;
  }
  public void setVote_average(Float vote_average){
   this.vote_average=vote_average;
  }
  public Float getVote_average(){
   return vote_average;
  }
  public void setId(Integer id){
   this.id=id;
  }
  public Integer getId(){
   return id;
  }
  public void setAdult(Boolean adult){
   this.adult=adult;
  }
  public Boolean getAdult(){
   return adult;
  }
  public void setVote_count(Integer vote_count){
   this.vote_count=vote_count;
  }
  public Integer getVote_count(){
   return vote_count;
  }
}