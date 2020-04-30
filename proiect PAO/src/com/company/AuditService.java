package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

public class AuditService {
    private String path;

    AuditService (String cale){
        this.path = cale;
    }

    void AdaugaAudit(String numeActiune) throws IOException {
        Date date= new Date();
        long time = date.getTime();
        Timestamp timpStamp = new Timestamp(time);
        String timpString = timpStamp.toString();
        FileWriter fileWrite = new FileWriter(this.path , true);
        fileWrite.write(numeActiune + ',' + timpString + "\n");
        fileWrite.close();
    }
    
    void AfiseazaAudit() throws IOException {
        BufferedReader bufferRead = new BufferedReader(new FileReader(this.path));
        String linie;
        while((linie = bufferRead.readLine()) != null) {
            String[] s = linie.split(",");
            System.out.println(s[0] + ", " + s[1]);
        }
        bufferRead.close();
    }
}
