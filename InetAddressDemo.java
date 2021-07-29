package com.hubberspot.networking.example;

import java.net.*;

public class InetAddressDemo
{

  public static void main(String[] args) 
  {
   try
   { 
     InetAddress address = InetAddress.getLocalHost();
     System.out.println("Local host's address : "
                     + address);
     address = InetAddress.getByName("www.google.com");
     
     System.out.println("Google's address : "
                     + address);

     InetAddress[] allAddresses = InetAddress
          .getAllByName("www.google.com");
     
     for( int i=0 ; i < allAddresses.length ; i++)
       System.out.println("Address " + i+1 + " : "
                    + allAddresses[i]);
  }
   catch(UnknownHostException    e)
   {
      e.printStackTrace();
   }
 }   
}








👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
