/**
 * Created by jenny on 7/12/2017.
 */
public enum Status {

    ON_SHELF("On Shelf"), CHECKED_OUT("Checked Out"), RESERVED("Reserved");

    private String stringVersion;

    Status(String stringVersion) {
        this.stringVersion = stringVersion;
    }

    //Override to output Status as string (as declared for stringVersion) instead of reference location:
    @Override
    public String toString() {
        return stringVersion;
    }

}