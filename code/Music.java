public class Music{

 
 // Instance variables
private String Composer;
private String Name;
private String period;
private String year;
private String type;
private String audiofile;
private String length;


 public Music (String name) {
    int index = name.indexOf(";");
     this.Composer = name.substring(0,index);
     int temp = index + 1;
     index = name.indexOf(";",temp);
     this.Name = name.substring(temp,index);
     temp = index + 1;
     index = name.indexOf(";",temp);
     this.period = name.substring(temp,index);
     temp = index + 1;
     index = name.indexOf(";",temp);
     this.type = name.substring(temp,index);
     temp = index + 1;
     index = name.indexOf(";",temp);
     this.year = name.substring(temp,index);
     temp = index + 1;
     index = name.indexOf(";",temp);
     this.audiofile = name.substring(temp,index);
     temp = index + 1;
     index = name.indexOf(";",temp);
     this.length = name.substring(temp,index);

 }
 public String troubleshooting(){
return Name + " and " +  period + " and " + year + " and " +  type + " and " + audiofile + " and "  + length;
 }
 public String getCompser(){
    return Composer;
 }
 public String getName(){
   return Name;
}
public String getperiod(){
   return period;
}
public String getyear(){
   return year;
}
public String gettype(){
   return type;
}
public String getaudiofile(){
   return audiofile;
}
public String length(){
   return length;
}

/*
 * private String Composer;
private String Name;
private String period;
private String year;
private String type;
private String audiofile;
private String length;
 */
}