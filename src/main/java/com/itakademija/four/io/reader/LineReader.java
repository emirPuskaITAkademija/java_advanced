package com.itakademija.four.io.reader;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * DECORATOR
 * FileReader
 * <p>
 * BufferedReader -> charactere iz jedne linije. Pomoću FileReader će iščitati karaktere i kada dođe
 * /n /r/n String line
 * Caffe
 * <p>
 * MilkDecorator
 * <p>
 * new MilkDecorator(new Caffe());
 * new BufferedReader(new FileReader());
 *
 */
class LineReader implements Reader {
    @Override
    public String read(String path) throws ReaderException {
        try {
            StringBuilder sb = new StringBuilder();
            //fileReader: FileReader, InputStreamReader, Reader
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                //  /n/r -Windows   /n - Unix
                String lineSeparator = System.lineSeparator();
                sb.append(line).append(lineSeparator);
            }
            return sb.toString();
        } catch (Exception e) {
            throw new ReaderException(e.getMessage());
        }

    }
}
