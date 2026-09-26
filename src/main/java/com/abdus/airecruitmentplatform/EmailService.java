package com.abdus.airecruitmentplatform;

import org.springframework.stereotype.Service;

import java.util.Arrays;
@Service
public class EmailService {

  public String leetsplit(candidate candidateObje){
String email = candidateObje.getEmail();
String domain = email.split("@")[1] ;

      String[] majorDomains = {

              "gmail.com", "googlemail.com",
              "outlook.com", "hotmail.com", "live.com", "msn.com",
              "yahoo.com", "ymail.com", "rocketmail.com",
              "icloud.com", "me.com", "mac.com",


              "proton.me", "protonmail.com", "tuta.com", "tutanota.com",


              "aol.com", "comcast.net", "att.net", "gmx.com", "gmx.de",
              "web.de", "mail.ru", "yandex.ru", "qq.com", "163.com"
      };
if(Arrays.asList(majorDomains).contains(domain)){
return "Email Exists " ;


}





return "Email does not supported" ;


  }


}
