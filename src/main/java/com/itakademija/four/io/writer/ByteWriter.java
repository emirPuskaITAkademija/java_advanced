package com.itakademija.four.io.writer;

// java.io.FileOutputStream -> byte po byte šaljemo sadržaj-"content" u fajl-"path"

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

// instancnu metodu mogu pozvati kada POSTOJI OBJEKAT
// Writer writer = new Writer() -> NE MOŽE
// Writer writer = new ByteWriter();
// writer.write();
// online shop -> shopping basket - >
// payment type -> PayPal
//PaymentExecution -> PayPal implementacija
// payment type -> Shopify
//PaymentExecution -> izmijene tu klasu i dodaju funkcionalnost KROZ MODIFIKACIJU
// PaymentExecution -> HAS-A interface Payment -> ne implementira payment i ne kreira payment objekat nego ga dobije
// payment.pay(); -> Payment payment = PaymentFactory.paymentType(korisnični odabir)
//
class ByteWriter implements Writer{
    @Override
    public void write(String path, String content) throws WriterException {
        //Kada pozovem neku metodu ili konstruktor koja u svom potpisu ima throws CheckedException
        try(FileOutputStream fileOutputStream = new FileOutputStream(path);) {
            byte[] charArray = content.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(charArray);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
