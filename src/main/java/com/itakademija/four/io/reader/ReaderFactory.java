package com.itakademija.four.io.reader;

/**
 * ReaderFactory : razdvaja kreiranje objekata od njihovog korištenja
 */
public class ReaderFactory {

    public static Reader createReader(ReaderType readerType) {
        //input u switch može biti i enumerirani tip
        Reader reader = switch (readerType){
            case BYTE -> new ByteReader();
            case CHAR -> new CharacterReader();
            case LINE -> new LineReader();
            case OBJECT -> new ObjectReader();
        };
        return reader;
    }

    // varijablu tipa Reader ->
//    public static Reader createReader(ReaderType readerType) {
//        //input u switch može biti i enumerirani tip
//        switch (readerType) {
//            case BYTE:
//                return new ByteReader();
//            case CHAR:
//                return new CharacterReader();
//            case LINE: // Reader  LineReader ->
//                return new LineReader();
//            case OBJECT:
//                return new ObjectReader();
//            default:
//                throw new IllegalArgumentException("Unknown reader type %s".formatted(readerType.getName()));
//        }
//    }

//    public static Reader createReader(String type) {
//        if (type == null || type.isBlank()) {
//            throw new IllegalArgumentException("Type cannot be null or empty");
//        }
//        //Java 7 -> input u switch može biti tipa String
//        switch (type.toUpperCase()) {
//            case "BYTE":
//                return new ByteReader();
//            case "CHAR":
//                return new CharacterReader();
//            case "LINE":
//                return new LineReader();
//            case "OBJECT":
//                return new ObjectReader();
//            default:
//                throw new IllegalArgumentException("Unknown reader type %s".formatted(type));
//        }
//    }
}
