package com.CodeWithAarushi.advanced.construction.patterns;

public class NaiveSingleton {
    private static NaiveSingleton instance;
    
    private NaiveSingleton() {        
    }
    
    public static NaiveSingleton getInstance() {
        if( instance == null ) {
            instance = new NaiveSingleton();
        }
        
        return instance;
    }
}



/*
👋 Hi, I’m @aarushinair - Aarushi Nair (she/her/ella)
👀 I’m a Computer Science Engineering Student
💞️ I’m looking to collaborate on #java, #python, #R, #applicationdevelopment
🌱 #GirlsWhoCode #WomenInTech #WomenInIT #WomenInSTEM #CyberSecurity #QuantumComputing #BlockChain #AI #ML
📫 How to reach me: https://www.linkedin.com/in/aarushinair/
👩‍🏫 YouTube Channel - Code with Aarushi : https://www.youtube.com/channel/UCKj5T1ELHCmkGKujkpqtl7Q
🙋‍ Follow me on Twitter: https://twitter.com/aarushinair_
*/
