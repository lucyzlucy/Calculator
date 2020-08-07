public enum ErrorMessages {
    INVALID_NUMBER("The program accepts only numbers in the range from -20 to 20 ."),
    INVALID_OPERATOR("The program accepts only the following operators: +, -, /, *"),
    NOT_A_NUMBER("The program accepts only numbers.Please, enter a number:"),
    ZERO_DIVISION("You cannot divide by 0!"),
    FILE_ISSUE("There has been an issue with writing to the file. Your calculation has not been logged. " +
            "Do you want to try logging again? (y - Yes, try again, n - No, skip it) : \n");


    private final String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() { return message; }
}