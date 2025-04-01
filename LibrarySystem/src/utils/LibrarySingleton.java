package utils;

import library.Library;

public class LibrarySingleton {
    public static  Library library;
    public static Library getLibrary(){
        if(library==null){
            library=new Library();
        }
        return library;
    }
}
