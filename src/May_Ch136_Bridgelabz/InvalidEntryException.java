package May_Ch136_Bridgelabz;

public class InvalidEntryException extends Exception  {
    // To check the Entries or valid or Not
    enum ExceptionType {
        INVALID,VALID
    }

    public InvalidEntryException(String message) {
        super(message);
    }
}

