package exceptions;

public class ItemIsBrokenException extends Exception {
    private final String itemName;

    public ItemIsBrokenException(String itemName) {
        super("Предмет " + itemName + " сломан");
        this.itemName = itemName;
    }

    @Override
    public String getMessage() {
        return "Предмет " + itemName + " сломан";
    }

}