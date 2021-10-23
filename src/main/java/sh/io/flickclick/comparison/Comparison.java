package sh.io.flickclick.comparison;

//@Entity
public class Comparison {
    private Long id;
    private String senderEmail;
    private String[] senderMovies;
    private String recipientEmail;
    private String[] recipientMovies;
    private String[] recipientExclusive;
    private String[] senderExclusive;
    private String[] inCommon;

    public Comparison() {
    }

    public Comparison(Long id, String senderEmail, String[] senderMovies) {
        this.id = id;
        this.senderEmail = senderEmail;
        this.senderMovies = senderMovies;
    }

    public Comparison(String senderEmail, String[] senderMovies) {
        this.senderEmail = senderEmail;
        this.senderMovies = senderMovies;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSenderEmail() {
        return this.senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String[] getSenderMovies() {
        return this.senderMovies;
    }

    public void setSenderMovies(String[] senderMovies) {
        this.senderMovies = senderMovies;
    }

    public String getRecipientEmail() {
        return this.recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public String[] getRecipientMovies() {
        return this.recipientMovies;
    }

    public void setRecipientMovies(String[] recipientMovies) {
        this.recipientMovies = recipientMovies;
    }

    public String[] getRecipientExclusive() {
        return this.recipientExclusive;
    }

    public void setRecipientExclusive(String[] recipientExclusive) {
        this.recipientExclusive = recipientExclusive;
    }

    public String[] getSenderExclusive() {
        return this.senderExclusive;
    }

    public void setSenderExclusive(String[] senderExclusive) {
        this.senderExclusive = senderExclusive;
    }

    public String[] getInCommon() {
        return this.inCommon;
    }

    public void setInCommon(String[] inCommon) {
        this.inCommon = inCommon;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", senderEmail='" + getSenderEmail() + "'" + ", senderMovies='"
                + getSenderMovies() + "'" + ", recipientEmail='" + getRecipientEmail() + "'" + ", recipientMovies='"
                + getRecipientMovies() + "'" + ", recipientExclusive='" + getRecipientExclusive() + "'"
                + ", senderExclusive='" + getSenderExclusive() + "'" + ", inCommon='" + getInCommon() + "'" + "}";
    }

}
